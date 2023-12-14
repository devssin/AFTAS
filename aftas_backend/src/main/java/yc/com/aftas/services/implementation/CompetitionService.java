package yc.com.aftas.services.implementation;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import yc.com.aftas.dto.CompetitionDto;
import yc.com.aftas.entities.Competition;
import yc.com.aftas.mappers.CompetitionMapper;
import yc.com.aftas.repositories.CompetitionRepository;
import yc.com.aftas.services.ICompetitionService;

import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class CompetitionService implements ICompetitionService {

    @Autowired
    private CompetitionRepository competitionRepository;


    @Override
    public CompetitionDto create(CompetitionDto competitionDTO) {
        Competition competition = CompetitionMapper.competitionMapper.toEntity(competitionDTO);
        if(competitionRepository.findByCode(competitionDTO.getCode()) != null){
            throw new IllegalArgumentException("Competition with code " + competitionDTO.getCode() + " already exists");
        }
        if (!isCompetitionDateAvailable(competitionDTO.getDate())) {
            throw new IllegalArgumentException("Competition date is not available");
        }
        competitionRepository.save(competition);
        return competitionDTO;
    }

    @Override
    public boolean delete(String code) {
        Competition competition = competitionRepository.findByCode(code);
        if(competition == null){
            throw new IllegalArgumentException("Competition with code " + code + " does not exist");
        }
        competitionRepository.delete(competition);

        return true;

    }

    @Override
    public List<CompetitionDto> getAll() {
        return competitionRepository.findAll().stream().map(CompetitionMapper.competitionMapper::toDto).toList();
    }

    @Override
    public CompetitionDto getByCode(String code) {
        System.out.println("code = " + code);
        return CompetitionMapper.competitionMapper.toDto(competitionRepository.findByCode(code));
    }

    @Override
    public boolean isCompetitionDateAvailable(Date date) {
        Competition foundCompetitionEntity = competitionRepository.findByDate(date);
        if(foundCompetitionEntity == null){
            return true;
        }else {
            log.warn("====================================================");
            log.warn("You can't create a competition withing 24H. please pick a date after " + date);
            log.warn("====================================================");

            return false;
        }
    }
}

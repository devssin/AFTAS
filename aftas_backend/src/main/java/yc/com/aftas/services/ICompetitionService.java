package yc.com.aftas.services;

import org.springframework.stereotype.Service;
import yc.com.aftas.dto.CompetitionDto;

import java.util.Date;
import java.util.List;

@Service
public interface ICompetitionService {
    public CompetitionDto create(CompetitionDto competitionDTO);
    public boolean delete(String code);
    public List<CompetitionDto> getAll();
    public CompetitionDto getByCode(String code);
    public boolean isCompetitionDateAvailable(Date competitionDate);
}

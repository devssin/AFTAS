package yc.com.aftas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import yc.com.aftas.dto.CompetitionDto;
import yc.com.aftas.services.ICompetitionService;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1/competitions")
public class CompetitionController {
    @Autowired
    ICompetitionService competitionService;



    @PostMapping
    public CompetitionDto create(@RequestBody  CompetitionDto competitionDTO) {
        competitionDTO.setCode(generateCode(competitionDTO.getDate(), competitionDTO.getLocation()));
        return competitionService.create(competitionDTO);
    }

    @GetMapping
    public List<CompetitionDto> getAll(){
        return competitionService.getAll();
    }


    @GetMapping( "/{code}")
    public CompetitionDto getByCode(@PathVariable String code){
        return competitionService.getByCode(code);
    }

    @DeleteMapping("/{code}")
    public boolean delete(@PathVariable String code){
        return competitionService.delete(code);
    }

    public String generateCode(Date date, String location) {
        if (date == null || location == null) {
            throw new IllegalArgumentException("Date and location cannot be null");
        }
        String locationCode = location.substring(0, Math.min(location.length(), 3)).toLowerCase();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        String dateCode = localDate.toString().substring(2, 4) + "-" +
                String.format("%02d", localDate.getMonthValue()) + "-" +
                String.format("%02d", localDate.getDayOfMonth());

        return locationCode + "-" + dateCode;
    }


}

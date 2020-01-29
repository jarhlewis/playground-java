package com.termometrohipico.Microservices.Web;

import com.termometrohipico.Microservices.Domain.Race;
import com.termometrohipico.Microservices.Service.RaceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/race")
public class RaceController {

    private final RaceService raceService;

    public RaceController(RaceService raceService) {
        this.raceService = raceService;
    }

    @GetMapping("/all")
    public List<Race> findAll(){
        return raceService.findAll();
    }
}

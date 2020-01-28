package com.termometrohipico.THSpringBackend.Web;

import com.termometrohipico.THSpringBackend.Domain.Race;
import com.termometrohipico.THSpringBackend.Services.RaceService;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/race-api")
public class RaceController  {

    private RaceService raceService;

    public RaceController() {
    }

    public RaceController(RaceService raceService) {
        this.raceService = raceService;
    }

    @GetMapping("/all")
    public List<Race> findAll(){
        return raceService.findAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody Race race){
        raceService.save(race);
    }

}
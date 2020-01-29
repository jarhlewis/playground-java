package com.termometrohipico.Microservices.Web;

import com.termometrohipico.Microservices.Domain.Race;
import com.termometrohipico.Microservices.Service.RaceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/race")
public class RaceController {
    private final Logger logger = LoggerFactory.getLogger(RaceController.class);
    private final RaceService raceService;

    public RaceController(RaceService raceService) {
        this.raceService = raceService;
    }

    @GetMapping("")
    public List<Race> findAll(){
        logger.info("Get request to find all");
        return raceService.findAll();
    }

    @PostMapping("")
    public void save(@RequestBody Map<String, Race> races){
        logger.info("Post request to save");
        for(Map.Entry<String, Race> entry : races.entrySet()){
            raceService.save(entry.getValue());
        }
    }
}

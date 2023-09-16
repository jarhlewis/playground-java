package com.termometrohipico.Microservices.Web;

import com.termometrohipico.Microservices.Domain.Race;
import com.termometrohipico.Microservices.Service.RaceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/race")
@CrossOrigin(origins = "http://localhost/3000")
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
    public ResponseEntity<Race> save(@RequestBody Map<String, Race> races){
        logger.info("Post request to save");
        for(Map.Entry<String, Race> entry : races.entrySet()){
            raceService.save(entry.getValue());
        }
        HttpHeaders headers = new HttpHeaders();

        return ResponseEntity.ok().headers(headers).body(null);
    }

    @PostMapping("/update")
    public ResponseEntity<Race> update(@RequestBody Race race){
        logger.info("Post request to update existing record....");

        HttpHeaders headers = new HttpHeaders();

        if(race.getId() != null){
            logger.info("Record has Id. Saving...");
            raceService.save(race);
            return ResponseEntity.ok().headers(headers).body(null);
        }else {
            logger.info("Error: Record does not exist");
            return ResponseEntity.badRequest().headers(headers).body(null);
        }
    }
}

package com.termometrohipico.Microservices.Service.Impl;

import com.termometrohipico.Microservices.Domain.Race;
import com.termometrohipico.Microservices.Repository.RaceRepository;
import com.termometrohipico.Microservices.Service.RaceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RaceServiceImpl implements RaceService {

    private final Logger logger = LoggerFactory.getLogger(RaceServiceImpl.class);
    private final RaceRepository raceRepository;

    public RaceServiceImpl(RaceRepository raceRepository) {
        this.raceRepository = raceRepository;
    }

    @Override
    public List<Race> findAll() {
        logger.info("Request to find all");
        return raceRepository.findAll();
    }

    @Override
    public void save(Race race) {
        logger.info("Request to save: " + race.toString());
        raceRepository.save(race);
    }

}

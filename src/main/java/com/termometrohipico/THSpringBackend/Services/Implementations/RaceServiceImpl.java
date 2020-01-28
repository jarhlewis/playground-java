package com.termometrohipico.THSpringBackend.Services.Implementations;

import com.termometrohipico.THSpringBackend.Domain.Race;
import com.termometrohipico.THSpringBackend.Repository.RaceRepository;
import com.termometrohipico.THSpringBackend.Services.RaceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RaceServiceImpl implements RaceService {

    private RaceRepository raceRepository;

    public RaceServiceImpl() {
    }

    public RaceServiceImpl (RaceRepository theRaceRepo){
        this.raceRepository = theRaceRepo;
    }

    @Override
    public void save(Race race) {
        raceRepository.save(race);
    }

    @Override
    public List<Race> findAll() {
        return raceRepository.findAll();
    }

}

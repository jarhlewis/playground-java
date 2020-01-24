package com.termometrohipico.THSpringBackend.Services.Implementations;

import com.termometrohipico.THSpringBackend.Domain.Race;
import com.termometrohipico.THSpringBackend.Repository.RaceRepository;
import com.termometrohipico.THSpringBackend.Services.RaceService;

import java.util.List;

public class RaceServiceImpl implements RaceService {

    private RaceRepository raceRepo;

    public RaceServiceImpl (RaceRepository theRaceRepo){
        this.raceRepo = theRaceRepo;
    }
    
    @Override
    public List<Race> findAll() {
        return null;
    }

    @Override
    public Race findById() {
        return null;
    }

    @Override
    public void save() {

    }

    @Override
    public void update() {

    }

    @Override
    public void deleteById() {

    }
}

package com.termometrohipico.THSpringBackend.Services.Implementations;

import com.termometrohipico.THSpringBackend.Domain.Race;
import com.termometrohipico.THSpringBackend.Repository.RaceRepository;
import com.termometrohipico.THSpringBackend.Services.RaceService;

import java.util.List;
import java.util.Optional;

public class RaceServiceImpl implements RaceService {

    private RaceRepository raceRepo;

    public RaceServiceImpl (RaceRepository theRaceRepo){
        this.raceRepo = theRaceRepo;
    }

    @Override
    public List<Race> findAll() {
        return raceRepo.findAll();
    }

    @Override
    public Optional findById(Long id) {
        return raceRepo.findById(id);
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

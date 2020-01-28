package com.termometrohipico.THSpringBackend.Services;

import com.termometrohipico.THSpringBackend.Domain.Race;

import java.util.List;

public interface RaceService {
    public List<Race> findAll();
    public void save(Race race);
}

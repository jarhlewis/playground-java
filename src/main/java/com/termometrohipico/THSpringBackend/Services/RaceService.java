package com.termometrohipico.THSpringBackend.Services;

import com.termometrohipico.THSpringBackend.Domain.Race;

import java.util.List;

public interface RaceService {
    public List<Race> findAll();
    public Race findById();
    public void save();
    public void update();
    public void deleteById();
}

package com.termometrohipico.THSpringBackend.Services;

import com.termometrohipico.THSpringBackend.Domain.Race;

import java.util.List;
import java.util.Optional;

public interface RaceService {
    public List<Race> findAll();
    public Optional findById(Long id);
    public void save();
    public void update();
    public void deleteById();
}

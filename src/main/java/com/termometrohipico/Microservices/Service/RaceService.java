package com.termometrohipico.Microservices.Service;

import com.termometrohipico.Microservices.Domain.Race;

import java.util.List;

public interface RaceService {
    public List<Race> findAll();
}

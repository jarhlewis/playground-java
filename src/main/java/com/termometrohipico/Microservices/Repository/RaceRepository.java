package com.termometrohipico.Microservices.Repository;

import com.termometrohipico.Microservices.Domain.Race;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RaceRepository extends JpaRepository<Race, Long> {
}

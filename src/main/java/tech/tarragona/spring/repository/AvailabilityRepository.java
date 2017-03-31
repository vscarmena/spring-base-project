package tech.tarragona.spring.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.tarragona.spring.model.Availability;

@Repository
public interface AvailabilityRepository extends JpaRepository <Availability, Integer> {
}

package tech.tarragona.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.tarragona.spring.model.Caravana;

@Repository
public interface CaravanaRepository extends JpaRepository <Caravana, String> {

	Caravana findByPlate(String plate);
}

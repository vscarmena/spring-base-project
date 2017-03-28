package tech.tarragona.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.tarragona.spring.model.Caravan;

@Repository
public interface CaravanaRepository extends JpaRepository <Caravan, Integer> {

	Caravan findById(Integer id);
}
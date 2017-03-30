package tech.tarragona.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.tarragona.spring.model.Camping;

@Repository
public interface CampingRepository extends JpaRepository <Camping, Integer>{

	
}

package tech.tarragona.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.tarragona.spring.model.Authority;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Integer> {
	
	Authority findByName(String name);
}

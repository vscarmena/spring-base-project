package tech.tarragona.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.tarragona.spring.model.Person;
@Repository
public interface PersonRepository extends JpaRepository<Person, String> {

}

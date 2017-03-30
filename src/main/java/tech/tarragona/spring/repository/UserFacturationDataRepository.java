package tech.tarragona.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.tarragona.spring.model.UserFacturationData;


@Repository
public interface UserFacturationDataRepository extends JpaRepository <UserFacturationData, Integer>{

}
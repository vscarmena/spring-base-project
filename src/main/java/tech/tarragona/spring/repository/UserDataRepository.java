package tech.tarragona.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.tarragona.spring.model.UserData;


@Repository
public interface UserDataRepository extends JpaRepository <UserData, Integer>{

	UserData findByUsername(String username);

	UserData findById(Integer id);



}
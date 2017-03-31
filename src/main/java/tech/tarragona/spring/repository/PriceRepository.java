package tech.tarragona.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.tarragona.spring.model.Price;

@Repository
public interface PriceRepository extends JpaRepository<Price, Integer> {

}

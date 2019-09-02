package com.smolaardy.driverslicense.repositories;

import org.springframework.data.repository.CrudRepository;

import com.yasmeen.driverslicense.models.Person;

public interface PersonRepository extends CrudRepository<Person, Long>{

}
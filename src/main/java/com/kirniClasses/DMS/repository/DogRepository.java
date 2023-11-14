package com.kirniClasses.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kirniClasses.DMS.Models.Dog;
/*
 *@author Soujanya Kirni
 *S563147
 *11-13-2023
 */
public interface DogRepository extends CrudRepository<Dog,Integer>{

	List<Dog> findByName(String name);
}

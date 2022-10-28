package com.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.DAOUser;

@Repository
public interface UserRepository extends CrudRepository<DAOUser, Integer> {
	
	DAOUser findByUsername(String username);

}

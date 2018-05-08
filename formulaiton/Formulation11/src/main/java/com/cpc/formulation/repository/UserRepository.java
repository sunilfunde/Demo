package com.cpc.formulation.repository;

import org.springframework.data.repository.CrudRepository;

import com.cpc.formulation.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
}

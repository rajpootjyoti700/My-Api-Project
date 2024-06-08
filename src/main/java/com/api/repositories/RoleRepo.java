package com.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.entities.Role;

public interface RoleRepo extends JpaRepository<Role, Integer> {

}

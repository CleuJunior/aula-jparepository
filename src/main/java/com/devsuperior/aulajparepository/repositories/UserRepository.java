package com.devsuperior.aulajparepository.repositories;

import com.devsuperior.aulajparepository.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> { }

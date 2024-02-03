package com.company.fullstackweb.repository;

import com.company.fullstackweb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}


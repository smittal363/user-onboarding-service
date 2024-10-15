package com.example.useronboarding.repository;

import com.example.useronboarding.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

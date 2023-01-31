package com.bratkov.project.repositories;

import com.bratkov.project.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository <User, Integer> {
}

package com.bratkov.project.repositories;

import com.bratkov.project.models.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository <Customers, Integer> {
}

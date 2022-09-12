package com.bratkov.project.services;

import com.bratkov.project.models.Customers;
import com.bratkov.project.repositories.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CustomerService {

    private final CustomerRepo customerRepo;

    @Autowired
    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    public List<Customers> getAllCustomers() {

        return customerRepo.findAll();

    }
}

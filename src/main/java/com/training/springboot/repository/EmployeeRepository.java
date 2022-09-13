package com.training.springboot.repository;

import com.training.springboot.model.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee,Integer>{
    Optional<Employee> findById(Integer id);
}
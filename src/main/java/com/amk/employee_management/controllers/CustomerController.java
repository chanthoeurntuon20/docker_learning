package com.amk.employee_management.controllers;

import com.amk.employee_management.Repositories.CustomerRepo;
import com.amk.employee_management.exceptions.ResourceNotFoundException;
import com.amk.employee_management.models.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {
    @Autowired
    private CustomerRepo customerRepo;

    @GetMapping("/customers")
    public List<Customer> getAllEmployees() {
        return customerRepo.findAll();
    }

    @GetMapping("/customers/{id}")
    public ResponseEntity<Customer> getEmployeeById(@PathVariable(value = "id") Integer customerId)
            throws ResourceNotFoundException {
        Customer employee = customerRepo.findById(customerId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + customerId));
        return ResponseEntity.ok().body(employee);
    }

    @PostMapping("/customers/create")
    public Customer createEmployee(@Valid @RequestBody Customer employee) {
        return customerRepo.save(employee);
    }
}

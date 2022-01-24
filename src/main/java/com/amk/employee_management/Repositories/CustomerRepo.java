package com.amk.employee_management.Repositories;

import com.amk.employee_management.models.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {
}

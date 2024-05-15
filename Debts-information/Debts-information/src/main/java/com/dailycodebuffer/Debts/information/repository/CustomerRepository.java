package com.dailycodebuffer.Springboot.tutorial.repository;

import com.dailycodebuffer.Debts.information.entity.Customers;
import com.dailycodebuffer.Springboot.tutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Department, Long> {

    public Customers findByCustomerName(String customerName);

    public Customers findByCustomerNameIgnoreCase(String departmentName);
}
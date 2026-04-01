package com.ancy.grocery_app.repository;

import com.ancy.grocery_app.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
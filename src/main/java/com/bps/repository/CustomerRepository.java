package com.bps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bps.model.CustomerRegister;

public interface CustomerRepository extends JpaRepository<CustomerRegister , Long > {

}

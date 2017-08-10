package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	@Query("SELECT x FROM Customer x ORDER BY x.id desc")
	List<Customer> findAllOrderId();	
	
	@Query("SELECT x FROM Customer x WHERE x.name = :name ORDER BY x.id desc")
	List<Customer> findUser(@Param("name") String name);
		
} 

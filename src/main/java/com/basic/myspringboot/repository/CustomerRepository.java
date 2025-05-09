package com.basic.myspringboot.repository;

import com.basic.myspringboot.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    //Query Method 정의하면 JPA가 JPQL(java persistence query language)
    //Optional로 감싼 이유? null값이 올 수도 있기 때문
    Optional<Customer> findByCustomerId(String id);
    //unique가 아니므로 List
    List<Customer> findByCustomerNameContaining(String name);


}

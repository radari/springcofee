package com.springcofee.repository;

import com.springcofee.model.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by raviteja.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long>{

}

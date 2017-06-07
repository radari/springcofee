package com.springcofee.repository;

import com.springcofee.model.CustomerOrder;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ravitejaa
 */
public interface OrderRepository extends CrudRepository<CustomerOrder,Long>{

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.util.List;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Ohjelmistokehitys
 */
public interface CustomerRepository extends CrudRepository<Customer, Long>,
    QueryDslPredicateExecutor<Customer> {
    
    List<Customer> findByLastName(String lastName);
}

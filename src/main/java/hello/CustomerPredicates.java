/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.util.function.Predicate;

/**
 *
 * @author Ohjelmistokehitys
 */
public class CustomerPredicates {
    public static Predicate firstOrLastNameStartsWith(final String searchTerm) {
        QCustomer customer = QCustomer.customer;
        
        return customer.firstName.startsWithIgnoreCase(searchTerm)
            .or(customer.lastName.startsWithIgnoreCase(searchTerm));
    }
}

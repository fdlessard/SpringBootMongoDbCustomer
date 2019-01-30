package io.fdlessard.codebites.customer.services;

import io.fdlessard.codebites.customer.model.Customer;

import java.util.List;

public interface CustomerService {

    Customer getCustomerById(long id);
    List<Customer> geAllCustomers();
    void create(Customer customer);
}



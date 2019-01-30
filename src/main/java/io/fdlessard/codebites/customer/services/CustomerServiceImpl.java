package io.fdlessard.codebites.customer.services;

import io.fdlessard.codebites.customer.model.Customer;
import io.fdlessard.codebites.customer.repositories.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer getCustomerById(long id) {

        log.debug("CustomerServiceImpl.get({})", id);

        return customerRepository.findById(id).get();
    }

    public List<Customer> geAllCustomers() {

        log.debug("CustomerController.getAll()");

        return customerRepository.findAll();
    }

    public void create(Customer customer) {
        log.debug("CustomerController.create({})", customer);
        customerRepository.save(customer);

    }

}

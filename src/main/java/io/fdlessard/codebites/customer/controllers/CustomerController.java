package io.fdlessard.codebites.customer.controllers;

import io.fdlessard.codebites.customer.model.Customer;
import io.fdlessard.codebites.customer.services.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(value = "/isAlive", produces = "application/json")
    public String isAlive() {
        log.debug("CustomerController.isAlive()");
        return "Hello World from CustomerController";
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    @ResponseBody
    public Customer get(@PathVariable long id) {
        log.debug("CustomerController.get({})", id);
        return customerService.getCustomerById(id);
    }

    @GetMapping(value = "/", produces = "application/json")
    @ResponseBody
    public Iterable<Customer> getAll() {
        log.debug("CustomerController.getAll()");
        return customerService.geAllCustomers();
    }

    @PostMapping(value = "/", produces = "application/json")
    public void post(@RequestBody Customer customer) {
        log.debug("CustomerController.post({})", customer);
        customerService.create(customer);
    }
}

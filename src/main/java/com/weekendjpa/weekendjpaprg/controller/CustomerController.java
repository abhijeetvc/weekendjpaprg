package com.weekendjpa.weekendjpaprg.controller;

import com.weekendjpa.weekendjpaprg.models.Customer;
import com.weekendjpa.weekendjpaprg.respository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @Value("${demo.myValue}")
    private Integer myValue;

    @PostMapping("/addCustomer")
    public String addCustomer(@RequestBody Customer customer){
        customerRepository.save(customer);
        return "Customer added!!!";
    }

    @GetMapping("/getCustomerInfo/{productId}")
    public List<Map<String,Object>> getCustomerInfo(@PathVariable Integer productId){

        return customerRepository.getCustomerData(productId);
    }
}

// Get all customers who has purchased particular product -> Customer id, customer name, product name
// Get all products which are not sold
// Get all products purchased by particular customer
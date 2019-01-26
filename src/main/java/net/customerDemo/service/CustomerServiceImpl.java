package net.customerDemo.service;

import jdk.internal.jline.internal.Log;
import lombok.extern.slf4j.Slf4j;
import net.customerDemo.model.Customer;
import net.customerDemo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer getById(Long id) {
        Log.info("In CustomerServiceImpl getById {}", id);
        return customerRepository.findOne(id);
    }

    @Override
    public void save(Customer customer) {
        Log.info("In CustomerServiceImpl save {}", customer);
        customerRepository.save(customer);
    }

    @Override
    public void delete(Long id) {
        Log.info("In CustomerServiceImpl delete {}", id);
        customerRepository.delete(id);
    }

    @Override
    public List<Customer> getAll() {
        Log.info("In CustomerServiceImpl findAll");
        return customerRepository.findAll();
    }
}

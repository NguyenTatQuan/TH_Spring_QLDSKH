package vn.codegym.thspringqldskh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.thspringqldskh.model.Customer;
import vn.codegym.thspringqldskh.repository.CustomerRepository;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private CustomerRepository repository;

    @Override
    public List<Customer> findAll() {
        return repository.findAll();
    }

    @Override
    public Customer findByID(int id) {
        return repository.findByID(id);
    }
}

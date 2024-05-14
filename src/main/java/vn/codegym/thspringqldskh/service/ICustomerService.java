package vn.codegym.thspringqldskh.service;

import vn.codegym.thspringqldskh.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    Customer findByID(int id);
}

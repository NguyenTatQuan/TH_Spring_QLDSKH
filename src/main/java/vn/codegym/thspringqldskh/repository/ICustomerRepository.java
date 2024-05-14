package vn.codegym.thspringqldskh.repository;

import vn.codegym.thspringqldskh.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();
    Customer findByID(int id);
}

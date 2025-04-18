package iuh.fit.duongnguyen.customerservice.services;

import iuh.fit.se.customerservice.entities.Customer;

public interface CustomerService {
    public Customer save(Customer customer);
    public Customer findById(long id);
}

package case_study.service.I;

import case_study.entity.Customer;
import case_study.service.C.CustomerService;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    void add(Customer customer);
    void updateCustomerById(int id,Customer customer);
}

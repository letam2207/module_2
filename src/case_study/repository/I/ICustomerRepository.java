package case_study.repository.I;

import case_study.entity.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();

    void add(Customer customer);

    void updateCustomerById(Customer customer);

    Customer findId(String id);
}

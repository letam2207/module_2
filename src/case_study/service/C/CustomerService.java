package case_study.service.C;

import case_study.entity.Customer;
import case_study.repository.C.CustomerRepository;
import case_study.service.I.ICustomerService;

import java.util.List;

public class CustomerService implements ICustomerService {
    private CustomerRepository customerRepository = new CustomerRepository();
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public void add(Customer customer) {
      customerRepository.add(customer);
    }

    @Override
    public void updateCustomerById( Customer customer) {
      customerRepository.updateCustomerById(customer);
    }

    @Override
    public Customer findId(String id) {
        return customerRepository.findId(id);
    }
}

package case_study.repository.C;

import case_study.entity.Customer;
import case_study.repository.I.ICustomerRepository;
import ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.common.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private final String CUSTOMER_FILE = "";


    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();
        List<String> stringList = ReadAndWrite.readFileCSV(CUSTOMER_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            Customer customer = new Customer(array[0], array[1],array[2], array[3], array[4], array[5]
                    , array[6], array[7], array[8], Integer.parseInt(array[9]));
            customerList.add(customer);
        }

        return customerList;
    }

    @Override
    public void add(Customer customer) {
        List<String> stringList = new ArrayList<>();
        stringList.add(customer.getInfoToFile2());
        ReadAndWrite.writeFileCSV(CUSTOMER_FILE, stringList, true);
    }

    private List<String> covertToStringArray(List<Customer> customerList) {
        List<String> stringList = new ArrayList<>();
        for (Customer c : customerList) {
            stringList.add(c.getInfoToFile2());
        }
        return stringList;
    }

    @Override
    public void updateCustomerById(Customer customer) {
        List<Customer> customerList = findAll();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId().equals(customer.getId())) {
                customerList.set(i, customer);
                break;
            }
        }
        List<String> stringList = covertToStringArray(customerList);
        case_study.common.ReadAndWrite.writeFileCSV(CUSTOMER_FILE, stringList, false);
    }

    @Override
    public Customer findId(String id) {
        List<Customer> customers = findAll();
        for (Customer c : customers){
            if (c.getId().equals(id)){
                return c;
            }
        }
        return null;
    }
}

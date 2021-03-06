package com.sda.testingbasics.db;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CustomerDaoExampleTest {

    @Test
    void thatWeCanAdd() {
        CustomerDao customerDao = new CustomerDaoImpl();
        Customer customer = new Customer("Tomek", "wozdev@gmail.com");

        customerDao.add(customer);

        Assertions.assertThat(customerDao.getAll())
                .isNotNull()
                .isNotEmpty()
                .hasSize(1)
                .containsOnly(customer);
    }

    @Test
    void thatWeCanFindAnAddedCustomerAndItHasTheSameAttributes() {
        CustomerDao customerDao = new CustomerDaoImpl();
        Customer customer = new Customer("Tomek", "wozdev@gmail.com");

        customerDao.add(customer);
        Customer foundCustomer = customerDao.find(customer.getName());

        Assertions.assertThat(foundCustomer)
                .isNotNull()
                .extracting(Customer::getName)
                .isEqualTo(customer.getName());

        Assertions.assertThat(foundCustomer.getEmail())
                .isEqualTo(customer.getEmail());
    }
}
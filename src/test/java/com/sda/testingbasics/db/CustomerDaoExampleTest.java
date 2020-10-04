package com.sda.testingbasics.db;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CustomerDaoExampleTest {

    @Test
    void thatWeCanFindAnAddedCustomerAndItHasTheSameAttributes() {
        CustomerDao customerDao = new CustomerDaoImpl();
        Customer customer = new Customer("Tomek", "wozdev@gmail.com");

        customerDao.add(customer);
        Customer foundCustomer = customerDao.find(customer.getName());

        Assertions.assertThat(foundCustomer.getName())
            .isEqualTo(customer.getName());
        Assertions.assertThat(foundCustomer.getEmail())
            .isEqualTo(customer.getEmail());
    }
}
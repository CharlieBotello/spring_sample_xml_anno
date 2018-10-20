package com.fdmgroup.repository;

import java.util.List;
import java.util.ArrayList;

import com.fdmgroup.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.fdmgroup.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstName("Charlie");
		customer.setLastName("Botello");
		
		customers.add(customer);
		return customers;
	}
	
}

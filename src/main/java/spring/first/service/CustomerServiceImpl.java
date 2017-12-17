package spring.first.service;

import java.util.List;

import spring.first.model.Customer;
import spring.first.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository;
	
	private CustomerServiceImpl() {
		
		
	}
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	@Override
	public List<Customer> findAll() {
		
		return customerRepository.findAll();
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	

}

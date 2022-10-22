package com.se.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.se.springrest.modal.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	private RestTemplate restTemplate;
	private String restServerUrl;
	
	@Autowired
	public CustomerServiceImpl(RestTemplate restTemplate, @Value("${crm.rest.url}") String restServerUrl) {
		this.restTemplate = restTemplate;
		this.restServerUrl = restServerUrl;
	}
	
	@Override
	public List<Customer> getCustomers() {
		ResponseEntity<List<Customer>> responseEntity = restTemplate.exchange(
				restServerUrl,
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<List<Customer>>() {}
				);
		List<Customer> customers = responseEntity.getBody();
		return customers;
	}

	@Override
	public Customer getCustomer(int id) {
		Customer customer = restTemplate.getForObject(restServerUrl + "/" + id, Customer.class);
		return customer;
	}

	@Override
	public void saveCustomer(Customer customer) {
		int customerId = customer.getId();
		if(customerId == 0) {
			restTemplate.postForEntity(restServerUrl, customer, String.class);
		} else {
			restTemplate.put(restServerUrl, customer);
		}
	}

	@Override
	public void deleteCustomer(int id) {
		restTemplate.delete(restServerUrl + "/" + id);
		ResponseEntity<String> responseEntity = restTemplate.getForEntity(restServerUrl + "/" + id, String.class);
		String s = responseEntity.getBody();
		System.out.println(s);
	}
	
}//end class

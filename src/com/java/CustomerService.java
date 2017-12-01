package com.java;

public interface CustomerService {

	public boolean addCustomer(Customer c);
	
	public boolean removeCustomer(int id);
	
	public Customer getCustomer(int id);
	
	public Customer[] getAllCustomer();
	
	
}

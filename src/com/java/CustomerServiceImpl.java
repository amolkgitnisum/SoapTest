package com.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CustomerServiceImpl implements CustomerService{

	private static Map<Integer,Customer> customer = new HashMap<Integer,Customer>();
	
	@Override
	public boolean addCustomer(Customer c) {
		if(customer.get(c.getId()) != null) {
			return false;
		}
		customer.put(c.getId(), c);
		System.out.println("Object Added Successfully !!");
		System.out.println("afroz");
		System.out.println("aforz1");
		System.out.println("afroz2");
		System.out.println("amol");
		return true;
	}

	@Override
	public boolean removeCustomer(int id) {

		if(customer.get(id) == null) {
			return false;
		}
		customer.remove(id);
		return true;
	}

	@Override
	public Customer getCustomer(int id) {
		
		return customer.get(id);
	}

	@Override
	public Customer[] getAllCustomer() {
		
		Set<Integer> ids = customer.keySet();
		Customer[] c = new Customer[ids.size()];
		int i=0;
		for(Integer id : ids) {
			c[i] = customer.get(id);
			i++;
		}
		return c;
	}

	
}

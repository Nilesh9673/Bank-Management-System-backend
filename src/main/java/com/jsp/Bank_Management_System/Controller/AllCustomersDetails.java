package com.jsp.Bank_Management_System.Controller;

import java.util.List;

import com.jsp.Bank_Management_System.Dto.CustomersDto;
import com.jsp.Bank_Management_System.Service.CustomerService;

public class AllCustomersDetails {
	public static void main(String[] args) {
		CustomerService customerService= new CustomerService();
		List<CustomersDto> c=customerService.getAllCustomers();
		for (CustomersDto customers : c) {
			System.out.println("================================================");
			System.out.print(customers.getId()+"\t");
			System.out.print(customers.getName()+"\t");
			System.out.print(customers.getGender()+"\t");
			System.out.print(customers.getDob()+"\t");
			System.out.print(customers.getStatus()+"\t");
			
		}
	}
}

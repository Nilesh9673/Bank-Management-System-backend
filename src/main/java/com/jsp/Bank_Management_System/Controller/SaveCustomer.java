package com.jsp.Bank_Management_System.Controller;

import java.util.Scanner;

import com.jsp.Bank_Management_System.Dto.CustomersDto;
import com.jsp.Bank_Management_System.Service.CustomerService;

public class SaveCustomer {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Enter your Gender");
		String gender=sc.next();
		System.out.println("Enter your Date Of Birth");
		String dob=sc.next();
		System.out.println("Enter your AadharCard no ");
		long adharno=sc.nextLong();
		System.out.println("defalut Customers Status is unapproved");
		CustomersDto customersDto=new CustomersDto();
		customersDto.setName(name);
		customersDto.setGender(gender);
		customersDto.setDob(dob);
		customersDto.setAdharno(adharno);
		
		
		CustomerService customerService= new CustomerService();
		customerService.saveCustomers(customersDto);
	}
}

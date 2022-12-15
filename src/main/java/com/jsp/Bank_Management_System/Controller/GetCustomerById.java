package com.jsp.Bank_Management_System.Controller;

import java.util.Scanner;

import com.jsp.Bank_Management_System.Dto.CustomersDto;
import com.jsp.Bank_Management_System.Service.CustomerService;

public class GetCustomerById {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your id");
		int id = sc.nextInt();
		CustomerService customerService = new CustomerService();
		CustomersDto customers=customerService.getCustomersById(id);
		if(customers!=null) {
			System.out.println("================================================");
			System.out.print(customers.getId()+"\t");
			System.out.print(customers.getName()+"\t");
			System.out.print(customers.getGender()+"\t");
			System.out.print(customers.getDob()+"\t");
			System.out.print(customers.getStatus()+"\t");
//			System.out.print(customers.getBankaccount());
		}
	}
}

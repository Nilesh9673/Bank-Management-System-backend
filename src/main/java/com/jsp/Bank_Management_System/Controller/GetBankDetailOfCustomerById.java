package com.jsp.Bank_Management_System.Controller;

import java.util.Scanner;

import com.jsp.Bank_Management_System.Service.CustomerService;

public class GetBankDetailOfCustomerById {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Customer id ");
		int customerId= sc.nextInt();
		
		CustomerService customerService= new CustomerService();
		customerService.getBankDetailOfCustomers(customerId);
		
	}
}

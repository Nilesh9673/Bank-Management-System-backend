package com.jsp.Bank_Management_System.Controller;

import java.util.Scanner;

import com.jsp.Bank_Management_System.Service.ManagerService;

public class UpdateManagerPassword {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your id");
		int id= sc.nextInt();
		System.out.println("Enter your new Password");
		String password=sc.next();
		
		ManagerService managerService=new ManagerService();
		managerService.updateManagerPasswordById(id, password);
	}
}

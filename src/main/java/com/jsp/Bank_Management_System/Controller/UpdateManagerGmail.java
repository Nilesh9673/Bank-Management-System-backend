package com.jsp.Bank_Management_System.Controller;

import java.util.Scanner;

import com.jsp.Bank_Management_System.Service.ManagerService;

public class UpdateManagerGmail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your id");
		int id = sc.nextInt();
		System.out.println("Enter your gamil");
		String gmail = sc.next();

		ManagerService managerService = new ManagerService();
		managerService.updateManagerGmailById(id, gmail);
	}
}

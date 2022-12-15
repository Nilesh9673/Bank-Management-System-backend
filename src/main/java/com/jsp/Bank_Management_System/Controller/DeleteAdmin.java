package com.jsp.Bank_Management_System.Controller;

import java.util.Scanner;

import com.jsp.Bank_Management_System.Dto.AdminDto;
import com.jsp.Bank_Management_System.Service.AdminService;

public class DeleteAdmin {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your id");
		int id=sc.nextInt();
		AdminService adminService= new AdminService();
		adminService.deletetAdminById(id);
		
	}
}

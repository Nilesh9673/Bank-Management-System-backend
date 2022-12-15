package com.jsp.Bank_Management_System.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jsp.Bank_Management_System.Dao.ManagerDao;
import com.jsp.Bank_Management_System.Dto.AdminDto;
import com.jsp.Bank_Management_System.Dto.ManagerDto;
import com.jsp.Bank_Management_System.Service.AdminService;
import com.jsp.Bank_Management_System.Service.ManagerService;

public class ApprovedBankManager {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Admin id");
		int id=sc.nextInt();
		AdminService adminService= new AdminService();

		adminService.approvedManager(id);
		
		
	}
}

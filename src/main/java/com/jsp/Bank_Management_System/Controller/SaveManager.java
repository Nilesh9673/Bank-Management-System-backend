package com.jsp.Bank_Management_System.Controller;

import java.util.Scanner;

import javax.persistence.Query;

import com.jsp.Bank_Management_System.Dao.ManagerDao;
import com.jsp.Bank_Management_System.Dto.ManagerDto;
import com.jsp.Bank_Management_System.Service.ManagerService;

public class SaveManager {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Enter your gmail");
		String gmail=sc.next();
		System.out.println("Enter your Password");
		String password=sc.next();
		System.out.println("defalut Manager Status is unapproved");
		
		ManagerDto managerDto= new ManagerDto();
		managerDto.setName(name);
		managerDto.setGmail(gmail);
		managerDto.setPassword(password);
		
		ManagerService managerService=new ManagerService();
		managerService.saveManager(managerDto);
		
	}
}

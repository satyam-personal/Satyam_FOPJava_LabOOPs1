package com.greatlearning.emailapp.main;

import java.util.Scanner;

import com.greatlearning.emailapp.model.Employee;
import com.greatlearning.emailapp.services.CredentialService;
import com.greatlearning.emailapp.services.CredentialServiceImpl;

public class EmployeeCredentialGenerator {
	final static String[] depts = {"Technical", "Admin", "Human Resource", "Legal"};
	final static String[] deptabvr = {"tech", "adm", "hr", "lg"};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setFirstName("Dinesh");
		employee.setLastName("Desai");
		
		try (Scanner scanner = new Scanner (System.in)) {
			System.out.println("Please Enter Employee First Name -->");
			employee.setFirstName(scanner.nextLine());
			System.out.println("Please Enter Employee Last Name -->");
			employee.setLastName(scanner.nextLine());
			System.out.println("Please enter the department of employee from following options");// (i) Administrator, \n (ii) Technical,\n (iii) Human Resources, \n (iv) Legal ");
			for(int i=0; i<depts.length; i++) {
				System.out.println((i+1)+". "+depts[i]);
			}
			String dept = deptabvr[scanner.nextInt()-1]; 
			employee.setDept(dept);
		}
		CredentialService credentialService = new CredentialServiceImpl(employee.getFirstName(), employee.getLastName(), employee.getDept());
		employee.setPassword(credentialService.generatePassword());
		employee.setEmail(credentialService.generateEmailAddress(employee.getFirstName(), employee.getLastName(), employee.getDept()));
		credentialService.showCredentials(employee);

	}

}

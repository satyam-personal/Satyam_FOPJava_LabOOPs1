/**
 * 
 */
package com.greatlearning.emailapp.services;

import java.util.Random;

import com.greatlearning.emailapp.model.Employee;

/**
 * @author satyamsaxena
 *
 */
public class CredentialServiceImpl implements CredentialService{
	String firstName;
	String lastName;
	String dept;
	final String domain = "abc";
	
	public CredentialServiceImpl (String firstName, String lastName, String Dept){
		this.firstName = firstName;
		this.lastName = lastName;
		this.dept = Dept;
	}

	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		//String password = "ITX@PTI";
		Random r = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<8; i++) {
			int num = r.nextInt(127-32)+32;
			sb.append((char)num);
		}
		String password = sb.toString();
		return password;
	}

	@Override
	public String generateEmailAddress(String firstName, String lastName, String Dept) {
		// TODO Auto-generated method stub
		String body = "Dear"+firstName+"your generated credentials are as follows";
		String email = firstName+lastName +"@"+Dept+"."+this.domain+".com"; 
		return email;
	}

	@Override
	public String showCredentials(Employee e) {
		// TODO Auto-generated method stub
		String body = "Dear "+e.getFirstName()+" your generated credentials are as follows \n";
		String result = body + "\nEmail Id: "+e.getEmail()+", \nPassword: "+e.getPassword();
		System.out.println(result);
		return result;
	}

}

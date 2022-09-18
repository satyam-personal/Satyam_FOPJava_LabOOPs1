package com.greatlearning.emailapp.services;

import com.greatlearning.emailapp.model.Employee;

public interface CredentialService {
	String generatePassword();
	String generateEmailAddress(String firstName, String lastName, String Dept);
	String showCredentials(Employee e);

}

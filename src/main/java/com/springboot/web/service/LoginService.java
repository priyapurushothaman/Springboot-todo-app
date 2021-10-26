package com.springboot.web.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean validateUser(String userid, String password) {
		// priya, priya
		return userid.equalsIgnoreCase("priya")
				&& password.equalsIgnoreCase("priya");
	}

}

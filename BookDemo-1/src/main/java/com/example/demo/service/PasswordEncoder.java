package com.example.demo.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {

	public static void main(String[] args) {
BCryptPasswordEncoder encoder= new BCryptPasswordEncoder();
String rawPassword = "likki1122";
String encoded = encoder.encode(rawPassword);

System.out.println(encoded);
	}

}

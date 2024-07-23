package com.example.demo;

import java.sql.*;

import com.example.demo.utils.ConnectionUtils;

public class Application {

	public static void main(String[] args) {

		
		System.out.println(ConnectionUtils.getMySqlConnection());
	
	}

}

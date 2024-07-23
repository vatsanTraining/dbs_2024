package com.example.demo;

import java.sql.*;

import com.example.demo.utils.ConnectionUtils;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(ConnectionUtils.getOracleConnection());
	
	}

}

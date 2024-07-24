package com.training.proxy;
/* Client */
public class ClientUsingProxy {

	public static void main(String[] args) {
		
		
		 InterNetAccess proxy=new ProxyInterNetAccess();
		 
		      proxy.setEmpGrade(27);
		      proxy.grantPermission();
		     
		     
	}
}

package com.Assignment;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


import junit.framework.Assert;
@RunWith(Parameterized.class)
public class JunitparameterFacebook {
	String email,password;
	
	WebDriver driver;

	FacebookLogin fb=null;
	@Before
	public void before() {
		fb=new FacebookLogin();
	}

	public JunitparameterFacebook(String email,String password)
	{
		this.email=email;
		this.password=password;
	}

	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] {{"deepakagarwal7405@gmail.com","deepak7405"},{"dagarwal913@gmail.com","deepak7405"}});
		
	}
	
	
	
	@Test
		public void test() throws Exception {
		fb.Login(email, password);
	}
	


}

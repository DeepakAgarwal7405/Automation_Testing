package com.Assignment;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class Assertion {
//	@Ignore
	@Test
	public void test1() {
		int a=12,b=6;
		
		Assert.assertTrue(a>b);
		Assert.assertFalse(a<b);
	}
	
//	@Ignore
	@Test
	public void test2() {
		int a=12,b=12;
		int c=5;
		//Assert Same and Assert equals are same use Function
		Assert.assertSame(a, b);
		Assert.assertNotSame(a, c);
//		Assert.assertEquals(b, a);
//		Assert.assertNotEquals(b, a);;
	}
	
//	@Ignore
	@Test
	public void test3() {
		String name="Deepak";
		String name1=null;
		
		
		Assert.assertNotNull(name);
		Assert.assertNull(name1);
		
	}
//	@Ignore
	@Test
	public void test4() {
		int[] a= {12,34,56,78};
		int[] b= {12,34,56,78};
		
		
		Assert.assertArrayEquals(a, b);
	}
	@Ignore
	@Test
	public void SelfFail() {
		System.out.println("This function is self failed....");
		fail();
	}

}

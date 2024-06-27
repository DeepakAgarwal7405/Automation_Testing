package com.Assignment;

import org.testng.annotations.Test;

public class TestngnewGroup {
	@Test(groups = {"Orange"})
	  public void Orange1() {
		  System.out.println("This is Orange group");
	  }
	  
	  @Test(groups = {"Orange"})
	  public void Orange2() {
		  System.out.println("This is Orange group");
	  }
	  
	  @Test(groups = {"Orange"})
	  public void Orange3() {
		  System.out.println("This is Orange group");
	  }
	  
	  @Test(groups = {"Yellow"})
	  public void Yellow1() {
		  System.out.println("This is Yellow group");
	  }
	  
	  @Test(groups = {"Yellow"})
	  public void Yellow2() {
		  System.out.println("This is Yellow group");
	  }
	  
	  @Test(groups = {"Yellow"})
	  public void Yellow3() {
		  System.out.println("This is Yellow group");
	  }
	  
	  @Test(groups = {"Yellow","Orange"})
	  public void YellowandOrange() {
		  System.out.println("This is Yellow and Orange group");
	  }
}

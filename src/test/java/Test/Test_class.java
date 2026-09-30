package Test;




import org.testng.Assert;
import org.testng.annotations.Test;

import Base.Base_Class;
import Page.Login;
import Page.Login2;
import Page.Login3;

public class Test_class extends Base_Class {
	@Test(priority = 0)
	public void test1() {
		Login lp= new Login(driver);
		lp.username("student");
		lp.password("Password123");
		lp.submit();
		
		String t=lp.link();
		Assert.assertEquals(t, "https://practicetestautomation.com/logged-in-successfully/");
		
		String s = lp.sourcecode();
		Assert.assertTrue(s.contains("Congratulations")||s.contains("successfully logged in"));
		
		Assert.assertTrue(lp.logout());
		lp.logout_b();
	}
	@Test(priority = 1)
	public void test2() throws InterruptedException {
		Login2 ls = new Login2(driver);
		ls.username("hhshd");
		ls.password("Password123");
		ls.submit();
		
		Assert.assertTrue(ls.error());
		String et=ls.error_text();
		//String e = ls.sourcecode();
		String expErr = "Your username is invalid!";
		Assert.assertEquals(et, expErr);
	
		Thread.sleep(1000);
	}
	@Test(priority = 2)
	public void test3() {
		Login3 le = new Login3(driver);
		le.username("student");
		le.password("gwhdg");
		le.submit();
		
		Assert.assertTrue(le.error());
		String et = le.error_text();
		String exp = "Your password is invalid!";
		Assert.assertEquals(et, exp);
	}


}

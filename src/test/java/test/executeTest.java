package test;

import org.testng.annotations.Test;
import commonClasses.baseClass;
import pages.DashBoard;
import pages.HomePage;
import pages.LoginPage;

public class executeTest extends baseClass {
     HomePage homepage;
     DashBoard dashboard;
	
	
	@Test
	public void loginApp() {
		
		
		LoginPage l=new LoginPage(driver);
		homepage=l.login("", "");
		homepage.m1();
	    dashboard=homepage.m1();
		dashboard.m2();
		
				
	}

}

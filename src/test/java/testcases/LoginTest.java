package testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import utilities.Utilities;
public class LoginTest extends BaseTest{
	
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void loginTest(Hashtable<String,String> data){
		//logincode
		HomePage home = new HomePage();
		LoginPage lp = home.goToLogin();
		lp.doLogin(data.get("username"), data.get("password"));
		System.out.print("Login");
	
		//Assert.fail("Login test failed");
	
		
	}

}

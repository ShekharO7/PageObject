package Pages;

import Base.Page;

public class LoginPage extends Page {
	
	public ZohoAppPage doLogin(String username,String password) 
	{
	
		
		type("email_CSS",username);
		click("nextbtn_XPATH");
		type("password_CSS",password);
		click("signbtn_ID");
		
		return new ZohoAppPage();

	}
	public void doSale()
	{
		
	}
	public void goToHR()
	{
		
	}
}

package RoughWork;



import Pages.HomePage;
import Pages.LoginPage;
import Pages.ZohoAppPage;

public class LoginTest {
	
	public static void main(String [] args) 
	{
		HomePage home=new HomePage();
	    home.goToLogin();
	    
		LoginPage login=new LoginPage();
			    login.doLogin("itoney7799@gmail.com","Tony@7799");
		ZohoAppPage zp=new ZohoAppPage();
			   zp.goToCRM();
			  // Page.menu.goToAccounts();
	}

}

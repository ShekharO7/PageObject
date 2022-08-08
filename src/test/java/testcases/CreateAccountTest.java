package testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.Page;
import Pages.ZohoAppPage;
import Pages.crm.accounts.AccountsPage;
import Pages.crm.accounts.CreateAccountPage;
import utilities.Utilities;


public class CreateAccountTest {
	
	
	@Test(dataProviderClass=Utilities.class,dataProvider="dp")
	public void createAccountTest(Hashtable<String,String> data){
		
		ZohoAppPage zp = new ZohoAppPage();
		zp.goToCRM();
		AccountsPage account = Page.menu.gotoAccounts();
		CreateAccountPage cap = account.gotoCreateAccounts();
		cap.createAccount(data.get("accountname"));
		//Assert.fail("Create account test failed");
		
	}

}

package Pages.crm.accounts;

import Base.Page;

public class CreateAccountPage  extends Page {
	
	
	public void createAccount(String accountName){
		
		type("accountname_CSS",accountName);
		
	}

}

package Pages.crm;

import Base.Page;

public class CRMHomePage extends Page{

	public void verifyAddSampleDataBtn(){
		
		
	}
	
	public void verifyTextCRMHome(){
		
		
		
	}
	
public void enterdetails(String companyname,String phonenumber)
	
	{
		type("company_CSS",companyname);
		type("phone_CSS",phonenumber);
		click("strated_CSS");
		
	}
}

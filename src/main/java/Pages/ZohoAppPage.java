package Pages;

import org.openqa.selenium.By;
import Base.Page;
import Pages.crm.CRMHomePage;

public class ZohoAppPage extends Page {
	
	public void goToConnect()
	{
	driver.findElement(By.cssSelector("._logo-connect._logo-x96.zod-app-logo")).click();	
	}
	public CRMHomePage goToCRM()
	{
		//driver.findElement(By.cssSelector("._logo-crm._logo-x96.zod-app-logo")).click();
       click("crmlink_CSS");
		
		return new CRMHomePage();

	}
    public void goToProjects()
    {
    	driver.findElement(By.cssSelector("._logo-projects._logo-x96.zod-app-logo")).click();		
    }
}

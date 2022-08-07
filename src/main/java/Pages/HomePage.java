package Pages;

import org.openqa.selenium.By;


import Base.Page;

public class HomePage extends Page {
	
	public void goToSignUp()
	{
		driver.findElement(By.cssSelector(".signup")).click();
	}
	public LoginPage goToLogin()
	{
		
    click("loginlink_CSS");
		
		return new LoginPage();

	}
	public void goToSupport()
	{
		driver.findElement(By.cssSelector(".signing>a:nth-child(2)")).click();
		
	}
	public void goToZohuEdu()
	{
		
	}
	public void validateFooterLink()
	{
		
	}
}

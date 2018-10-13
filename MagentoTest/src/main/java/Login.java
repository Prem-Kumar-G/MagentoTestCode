

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	By email = By.xpath("//input[@id='email']");
	By pass = By.xpath("//input[@id='pass']");
	By button = By.id("send2");
	
	WebDriver d;
	
	public Login(WebDriver d)
	{
		this.d=d;	
	}
	
	public void typeEmail(String data)
	{
		d.findElement(email).sendKeys(data);
	}
	
	public void typePwd(String data)
	{
		d.findElement(pass).sendKeys(data);
	}
	
	public void clickLogin()
	{
		d.findElement(button).click();
	}

}

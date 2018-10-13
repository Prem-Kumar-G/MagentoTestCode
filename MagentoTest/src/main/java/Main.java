

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main {
	
	WebDriver d;
	By myacc = By.linkText("My Account");
	
	public Main (WebDriver d)
	{
		this.d=d;
	}
	
	public void clickOnMyacc()
	{
		d.findElement(myacc).click();
	}

}

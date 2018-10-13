

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {
	
	WebDriver d;
	By logout = By.xpath("//a[text()='Log Out']");
	
	public Logout(WebDriver d)
	{
		this.d =d;
	}
	
	public void clikLogout()
	{
		d.findElement(logout).click();


}
}

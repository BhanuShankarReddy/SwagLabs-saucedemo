package SwagLabs.Saucedemo;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserInput {

	WebDriver driver;
	Properties p;
	By userid;
	By Pwd;
	By Lbtn;
	By butn;
	By lgout;
	
	String UserInpt;
	String passInpt;
	
	
	public UserInput(WebDriver driver, Properties p) {
	
		this.driver=driver;
		
		this.userid=By.id(p.getProperty("UserId"));
		this.Pwd=By.id(p.getProperty("Password"));
		this.Lbtn=By.id(p.getProperty("loginBtn"));
		this.UserInpt=p.getProperty("userinput");
		this.passInpt=p.getProperty("PassInpt");
		this.butn=By.id(p.getProperty("Butn"));
		this.lgout=By.linkText(p.getProperty("Lgout"));
		
	}
	
	
	public void enterusername() {
		
		driver.findElement(userid).sendKeys(UserInpt);
	}
	
public void enterpassword() {
		
	driver.findElement(Pwd).sendKeys(passInpt);
	}

public void dologin() {
	
	driver.findElement(Lbtn).click();
}

public void butnMenu() {
	
	driver.findElement(butn).click();
}

public void logutButtn() {
	
	driver.findElement(lgout).click();
}

}

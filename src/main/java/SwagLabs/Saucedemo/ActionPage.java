package SwagLabs.Saucedemo;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ActionPage {

	public static void main(String[] args) {
		
		try {
			
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Properties pf = new Properties();
			
			
			
			
			
			
			FileInputStream fis=new FileInputStream("\\Saucedemo\\src\\main\\java\\SwagLabs\\Saucedemo\\input.properties");
			
			pf.load(fis);
			UserInput ref = new UserInput(driver, pf);
			
			Thread.sleep(3000);
			
			ref.enterusername();
			
			Thread.sleep(3000);
			ref.enterpassword();
			Thread.sleep(3000);
			ref.dologin();
			Thread.sleep(3000);
			ref.butnMenu();
			Thread.sleep(3000);
			ref.logutButtn();
			Thread.sleep(4000);
			driver.quit();
			
		} catch (Exception e) {
			
			System.out.println(e);
		}
		
		
	}

}

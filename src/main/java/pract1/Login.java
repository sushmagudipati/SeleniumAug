package pract1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/");
		driver.manage().window().maximize();
		driver.findElementByName("uid").sendKeys("mngr52424");
		driver.findElementByName("password").sendKeys("ybEmuva");
		driver.findElementByName("btnLogin").click();
		driver.findElementByLinkText("Log out").click();
		driver.close();
		

	}

}

package pract1;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Classs1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementById("Email").sendKeys("sivaram0543@gmail.com");
		driver.findElementById("next").click();
		driver.findElementByXPath("//*[@id='Passwd']").sendKeys("Greenish3");
		driver.findElementById("signIn").click();
		driver.findElementByXPath("//*[@id='gbwa']/div[1]/a").click();
		driver.findElementByLinkText("Drive").click();
		
	}

}

package handleDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValueMethod {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("file:///C:/Users/Qspiders-Wakad/Desktop/SeleniumData/WebElement/SingleSelectDropDown.html");
		 
		 WebElement dropDownElement = driver.findElement(By.name("menu"));
		 
		 Select sel = new Select(dropDownElement);
		 
		 sel.selectByValue("v10");
		 

}
}

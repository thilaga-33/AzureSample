package TestProject.TestProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Sample {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("navigates to chrome browser");
		driver.get("https://www.google.com/maps");
		System.out.println("chrome browser launched");
		System.out.println(driver.getTitle());
	}

}

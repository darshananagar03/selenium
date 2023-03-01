package app3.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readconfig {

	public static void main(String[] args) throws IOException{
		WebDriver driver;
		Properties prop =new Properties();
		
			FileInputStream ip = new FileInputStream("/Adzooma/src/main/java/app3/config/config.properties");
			prop.load(ip);
		
	System.out.println(prop.getProperty("browser"));
			String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Darshana\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
	} 
		
	
	}

}

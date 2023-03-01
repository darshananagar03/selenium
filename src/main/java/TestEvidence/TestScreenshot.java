package TestEvidence;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScreenshot
{
    static WebDriver driver;
	public TestScreenshot() {
	}

	public static void main(String[] args)throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Darshana\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
	
	
	driver.get("D:\\Adzooma\\test-output\\testng-results.xml");
	takeScreenshot("Login-PPC-Test");

	}

	public static void takeScreenshot(String fileName)throws IOException {
		
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("D:\\Adzooma\\ScreenShots/"+fileName+".jpg"));
		
	}

}

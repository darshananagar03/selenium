import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DownloadFile {
		
		WebDriver driver;
		File folder;
		
		@BeforeMethod
		public void setUp() 
		{
			folder = new File(UUID.randomUUID().toString());
			folder.mkdir();
			
			//chrome:
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Darshana\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content-settings.popups", 0);
			prefs.put("download.default_directory", folder.getAbsolutePath());
			
			options.setExperimentalOption("prefs", prefs);
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(ChromeOptions.CAPABILITY, options);
			options.merge(cap);
			 
			driver = new ChromeDriver(options);
		}
		
		@Test
		public void downloadFileTest()throws InterruptedException{
			driver.get("https://testing2.adzooma.com/reporting/report/performance");
			driver.findElement(By.cssSelector("button.sc-bdfBwQ.eFjsba.btn.btn-sm.sc-kudhcb.sc-OFGBB.eXqRzC.gMlVej.ml-md-3.ml-lg-1.ml-xl-3.mt-lg-3.mt-xl-0")).click();
			
			Thread.sleep(2000);
			File listOfFiles[] = folder.listFiles();
			//make sure the directory is not empty
			Assert.assertTrue(listOfFiles.length>0);
			
			for(File file:listOfFiles) {
				//make sure that downloaded file is not empty
				Assert.assertTrue(file.length()>0);
			}
		}
		@AfterMethod
		public void tearDown() {
			driver.quit();
			for(File file : folder.listFiles()) {
				file.delete();
			}
			folder.delete();
		}
	}



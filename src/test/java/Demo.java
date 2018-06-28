import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
*
*@author Vinayak Kadam
*
*/
public class Demo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///E:/Selenium%20Setup/JBKoffline/jbk%20website/index.html");
		
	} 

}

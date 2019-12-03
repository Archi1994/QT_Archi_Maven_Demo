import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class QT {
	public static void main(String[]args) throws InterruptedException
    {
           //String key= "webdriver.chrome.driver"; 
           //String value=".\\exefiles\\chromedriver.exe";
           
           //System.setProperty(key, value);
           
		   WebDriverManager.chromedriver().setup();
           
           WebDriver driver=new ChromeDriver();
           driver.get("http://www.facebook.com");
           driver.manage().window().maximize();
           
           WebElement email = driver.findElement(By.cssSelector("input[type='email']"));
           email.sendKeys("archanataneja17@gmail.com");
           
           driver.findElement(By.cssSelector("input[value='Log In']")).click();
           Thread.sleep(9000);        
    }
}

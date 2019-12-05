import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;

public class QT {
	
	@Test
	public void fun()
    {
           //String key= "webdriver.chrome.driver"; 
           //String value=".\\exefiles\\chromedriver.exe";
           
           //System.setProperty(key, value);
           
		   WebDriverManager.chromedriver().setup();
           
           WebDriver driver=new ChromeDriver();
           driver.get("http://www.facebook.com");
           driver.manage().window().maximize();
           
           WebElement email = driver.findElement(By.cssSelector("input[type='email']"));
           email.sendKeys("archanataneja@gmail.com");
           
           driver.findElement(By.cssSelector("input[value='Log In']")).click();       
    }
}

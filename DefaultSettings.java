import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class DefaultSettings{
    public ChromeDriver driver;

    @Before
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("use-fake-ui-for-media-stream");
        System.setProperty("webdriver.chrome.driver", "D:\\CodeJ\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://signup.staging.getmati.com?merchantToken=5c94e361412407001b33d5c7&metadata={\"email\":\"user@example.com\"}");
        //        driver.get("https://dashboard.getmati.com");
        /*driver.findElement(By.xpath("//input[contains(@name, 'email')]")).sendKeys("oleg.bogovik@mati.io");
        driver.findElement(By.xpath("//input[contains(@name, 'password')]")).sendKeys("12345dub");
        driver.findElement(By.xpath("//span[contains(text(), 'Login')]")).click();*/
    }

    /*@After
    public void close() {
        driver.close();
    }*/
}

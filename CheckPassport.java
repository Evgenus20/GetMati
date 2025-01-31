import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class CheckPassport extends DefaultSettings {
    @Test
    public void checkPassportMexicoPositive() throws AWTException {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        /*driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); //Timeout

        driver.findElement(By.xpath("//a[contains(@href, '/configuration')]")).click();
        driver.findElement(By.xpath("//p[contains(text(), 'Verify me')]")).click();

        //driver.switchTo().frame("mati-iframe-1");*/ //Switch to frame.

        //driver.findElement(By.xpath("//button[contains(@class, 'button-global')]")).click();
        driver.findElement(By.xpath("//div//button//p[contains(text(), 'Start')]")).click();
        driver.findElement(By.xpath("//p[contains(text(), 'Passport')]")).click();
        driver.findElement(By.xpath("//input[contains(@type, 'text')]")).sendKeys("Mexico");
        driver.findElement(By.xpath("//input[contains(@type, 'text')]")).sendKeys(Keys.RETURN);
        driver.findElement(By.xpath("//button[contains(@class, 'button-global')]")).click();
        driver.findElement(By.xpath("//button//div//p[contains(text(), 'Upload')]")).click();
        //driver.findElement(By.xpath("//button//div//p[contains(text(), 'Upload')]")).click();
        //Thread.sleep(5000);
        //Runtime.getRuntime().exec("C:\\Users\\user\\Desktop\\Mati\\Test data\\Passport\\Mexico\\ID9475288_PASAPORTE_IVAN_EDUARDO_MORENO.JPG");
        //put path to your image in a clipboard
        StringSelection ss = new StringSelection("C:\\Users\\user\\Desktop\\Mati\\Test data\\Passport\\Mexico\\ID9475288_PASAPORTE_IVAN_EDUARDO_MORENO.JPG");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        //imitate mouse events like ENTER, CTRL+C, CTRL+V
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


        //driver.findElement(By.xpath("//button//div//p[contains(text(), 'Upload')]"))
                //.sendKeys("C:\\Users\\user\\Desktop\\Mati\\Test data\\Passport\\Mexico\\ID9475288_PASAPORTE_IVAN_EDUARDO_MORENO.JPG");
        //chooseFile.sendKeys("C:\\Users\\user\\Desktop\\Mati\\Test data\\Passport\\Mexico\\ID9475288_PASAPORTE_IVAN_EDUARDO_MORENO.JPG" );

        //File myFile = new File("C:\\Users\\user\\Desktop\\Mati\\Test data\\Passport\\Mexico", "ID9475288_PASAPORTE_IVAN_EDUARDO_MORENO.JPG");
        //myFile.


    }
}
package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.TestNGAntTask.Mode.junit;

public class DropDownElement {
    ChromeDriver driver = new ChromeDriver();

    @BeforeClass
    void setup() {
        WebDriverManager.chromedriver().setup();
        driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        driver.manage().window().maximize(); //for window to maximize
    }
    @Test
    public void DropDown() throws InterruptedException {
        Select select = new Select(driver.findElement(By.id("dropdowm-menu-1")));
        //select.selectByVisibleText("python");
        select.selectByValue("python");

        Select select1 = new Select(driver.findElement(By.id("dropdowm-menu-2")));
        //select1.selectByVisibleText("testng");
        select1.selectByValue("testng");

        Select select2 = new Select(driver.findElement(By.id("dropdowm-menu-3")));
        //select2.selectByVisibleText("javascript");
        select2.selectByValue("javascript");


        //Select select3 = new Select(driver.findElement(By.id("checkboxes")));
//        Select select3 = new Select(driver.findElement(By.id("checkboxes")));
//        select3.selectByValue("option-2");
//        select3.selectByValue("option-3");


        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,360)","");

        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[2]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[3]/input")).click();

        driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[3]")).click();

        Thread.sleep(1000);

    }

}
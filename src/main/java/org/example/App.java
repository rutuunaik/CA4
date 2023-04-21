//package org.example;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import java.util.List;
//
//import static org.testng.TestNGAntTask.Mode.junit;
//
//public class App {
//    ChromeDriver driver = new ChromeDriver();
//
//    @BeforeClass
//    void setup() {
//        WebDriverManager.chromedriver().setup();
//        driver.get("https://the-internet.herokuapp.com/dropdown");
//        driver.manage().window().maximize(); //for window to maximize
//    }
//    @Test
//    public void DropDown() throws InterruptedException {
//        Select select = new Select(driver.findElement(By.id("dropdown")));
//
//        //select.selectByValue("1");
//        //select.selectByIndex("2");
//
//        //select.selectByVisibleText("Option1");
//
//        List<WebElement> List = select.getOptions();
//        for (WebElement a : List) {
//            System.out.println(a.getText());
//        }
//
//
//    }
//
//}

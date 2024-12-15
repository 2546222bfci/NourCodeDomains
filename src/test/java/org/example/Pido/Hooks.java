package org.example.Pido;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeGroups;

import java.time.Duration;

public class Hooks {
    public static WebDriver driver=null;

    @Before("@Pido")
    public static void openBrowser(){
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.manage().deleteAllCookies();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://pido.nourcode.com/ar/");
    }

    @After("@Pido")
    public static void closeBrowser() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }
}

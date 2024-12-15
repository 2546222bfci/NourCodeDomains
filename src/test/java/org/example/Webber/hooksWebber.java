package org.example.Webber;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeGroups;

import java.time.Duration;

public class hooksWebber {
    public static WebDriver driver=null;

    @Before
    public static void openBrowser(){
        EdgeOptions options=new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new EdgeDriver(options);
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://webber.link/");
    }

    @After
    public static void closeBrowser() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }
}

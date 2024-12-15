package org.example.Pido.Pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import static java.awt.SystemColor.window;
import static org.example.Pido.Hooks.driver;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.Keys;


public class P02_ZoomResponsiveness {

    private final WebDriver driver;
    private final Wait<WebDriver> wait;

    public P02_ZoomResponsiveness(WebDriver driver){
        this.driver = driver;
        this.wait=new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(40))
                .pollingEvery(Duration.ofMillis(2000))
                .ignoring(org.openqa.selenium.NoSuchElementException.class);
    }

    public void verifyHomepageLoadsCorrectly() {
        try {
            // Wait until the page is fully loaded
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("body")));

            // Verify key elements are visible on the homepage
            WebElement logo = driver.findElement(By.xpath("//a[@href='/ar']/img[@src='https://pido.nourcode.com/wp-content/uploads/2023/12/nourcode-logo.png']"));
            //WebElement menu = driver.findElement(By.id("main-menu"));
            WebElement heroSection = driver.findElement(By.xpath("(//a[@class='elementor-button elementor-size-sm']/span/span[text()='ماذا نفعل لك'])[1]"));

            // Assertions to confirm visibility
            assertTrue(logo.isDisplayed(), "Logo is not visible on the homepage.");
            //assertTrue(menu.isDisplayed(), "Main menu is not visible on the homepage.");
            assertTrue(heroSection.isDisplayed(), "Hero section is not visible on the homepage.");

            System.out.println("Homepage loaded correctly and all key elements are visible.");
        } catch (Exception e) {
            System.err.println("Error verifying homepage elements: " + e.getMessage());
            throw e; // Fail the test if verification fails
        }
    }







    public void Zooming_Rest(int zoomPercentage) {
            try {
                // Convert zoom percentage to a scale (e.g., 150% -> 1.5)
                double zoomScale = zoomPercentage / 100.0;

                // Use JavaScript Executor to zoom the page
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("document.body.style.zoom='" + zoomScale + "'");

                System.out.println("Zoomed to " + zoomPercentage + "%");

                // Add delay to allow the zoom effect to apply
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }


    /*public void Zooming_Rest(int zoomPercentage2){
        try {
            // Convert zoom percentage to a scale (e.g., 150% -> 1.5)
                 double zoomScale = zoomPercentage2 / 100.0;

                // Use JavaScript Executor to zoom the page
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("document.body.style.zoom='" + zoomScale + "'");

                System.out.println("Zoomed to " + zoomPercentage2 + "%");

                // Add delay to allow the zoom effect to apply
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/

    private boolean checkLayoutAdjustment() {
        // Example: Check if a specific element is visible and properly aligned
        try {
            WebElement IceBurger = driver.findElement(By.id("layout-element-id"));
            // Add logic to verify the layout is adjusted (e.g., dimensions, alignment)
            return IceBurger.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }


    private boolean checkContentLegibility() {
        try {
            WebElement element = driver.findElement(By.id("content-element-id"));
            // Add logic to check if text is legible, e.g., font size or color contrast
            String fontSize = element.getCssValue("font-size");
            return Integer.parseInt(fontSize.replace("px", "")) >= 12; // Example threshold
        } catch (NoSuchElementException | NumberFormatException e) {
            return false;
        }
    }



    public void verifyZoomAdjustments(io.cucumber.datatable.DataTable table) {
        List<Map<String, String>> conditions = table.asMaps(String.class, String.class);

        for (Map<String, String> condition : conditions) {
            String layoutCheck = condition.get("Layout adjusts to fit the zoom");
            String contentCheck = condition.get("Content remains legible");

            // Verify the layout adjustment
            if (layoutCheck != null && !layoutCheck.isEmpty()) {
                boolean isLayoutAdjusted = checkLayoutAdjustment();
                assertTrue(isLayoutAdjusted, "Layout did not adjust to fit the zoom level.");
            }

            // Verify the content legibility
            if (contentCheck != null && !contentCheck.isEmpty()) {
                boolean isContentLegible = checkContentLegibility();
                assertTrue(isContentLegible, "Content is not legible at the given zoom level.");
            }
        }
    }

}

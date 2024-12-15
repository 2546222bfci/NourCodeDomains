package org.example.Pido.Pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import static org.example.Pido.Hooks.driver;

public class P01_NavigatePages {

    private final WebDriver driver;
    private final Wait<WebDriver> wait;

    public P01_NavigatePages(WebDriver driver){
        this.driver = driver;
        this.wait=new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(40))
                .pollingEvery(Duration.ofMillis(2000))
                .ignoring(org.openqa.selenium.NoSuchElementException.class);
    }

    public void navigateToHomePage(){
        driver.navigate()
                .to("https://pido.nourcode.com/ar/");
    }
    public void navigateToHomePageEn(){
        driver.navigate()
                .to("https://pido.nourcode.com/");
    }

    public void openServicesMenu() {
        try {
            // Locate the "Services" menu and wait for it to be visible and clickable
            WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//a[@href='#' and contains(@class, 'elementor-item-anchor') and contains(@class, 'has-submenu')]")
            ));

            System.out.println("Services menu found. Waiting for it to be clickable...");

            // Once visible, wait for it to be clickable and click
            wait.until(ExpectedConditions.elementToBeClickable(servicesMenu)).click();
            System.out.println("Services menu clicked successfully.");

            // Wait for the dropdown menu option (e.g., 'E-commerce website design') to be visible and clickable
            WebElement ecommerceLink = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//a[contains(@href, 'e-commerce-website-design')]")
            ));

        } catch (TimeoutException e) {
            System.err.println("Timed out waiting for the 'Services' menu or 'E-commerce' link to be clickable: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    public void openEcommerceLink(){
        openServicesMenu();
        try {

            // Wait for the dropdown menu option (e.g., 'E-commerce website design') to be visible and clickable
            WebElement ecommerceLink = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("(//a[contains(@href, \"e-commerce-website-design\") and text()=\"تصميم مواقع التجارة الإلكترونية\"])[1]")
            ));

            // Click on the 'E-commerce website design' link
            ecommerceLink.click();
            System.out.println("E-commerce link clicked successfully.");

        } catch (TimeoutException e) {
            System.err.println("Timed out waiting for the 'Services' menu or 'E-commerce' link to be clickable: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }

    }
    public void openEcommerceLinkEn(){
        openServicesMenu();
        try {

            // Wait for the dropdown menu option (e.g., 'E-commerce website design') to be visible and clickable
            WebElement ecommerceLink = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("(//a[contains(@href, \"e-commerce-website-design\") and text()=\"E-commerce website design\"])[1]")
            ));

            // Click on the 'E-commerce website design' link
            ecommerceLink.click();
            System.out.println("E-commerce link clicked successfully.");

        } catch (TimeoutException e) {
            System.err.println("Timed out waiting for the 'Services' menu or 'E-commerce' link to be clickable: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }

    }

    public void openPersonalPage() {
        openServicesMenu(); // Ensure Services menu is opened

        try {
            System.out.println("Attempting to locate 'Personal website design' link...");

            // Locate the 'Personal website design' link
            WebElement personalPage = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//a[contains(text(), 'Personal website design') or contains(@href, 'personal-website-design')]")
            ));

            // Wait for it to be clickable, then click
            wait.until(ExpectedConditions.elementToBeClickable(personalPage)).click();
            System.out.println("Personal website design link clicked successfully.");

        } catch (TimeoutException e) {
            System.err.println("Timed out waiting for the 'Personal website design' link to be visible or clickable: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
    public void openPersonalPageEn() {
        openServicesMenu(); // Ensure Services menu is opened

        try {
            System.out.println("Attempting to locate 'Personal website design' link...");

            // Locate the 'Personal website design' link
            WebElement personalPage = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("(//a[contains(text(), 'Personal website design') or contains(@href, 'personal-website-design')])[1]")
            ));

            // Wait for it to be clickable, then click
            wait.until(ExpectedConditions.elementToBeClickable(personalPage)).click();
            System.out.println("Personal website design link clicked successfully.");

        } catch (TimeoutException e) {
            System.err.println("Timed out waiting for the 'Personal website design' link to be visible or clickable: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    public void openNewspaperPage() {
        openServicesMenu(); // Ensure Services menu is opened

        try {
            System.out.println("Attempting to locate 'Newpaper website design' link...");

            // Locate the 'Newpaper website design' link
            WebElement newpaperPage = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("(//a[contains(@href, \"newpaper-website-design\") and text()=\"تصميم مواقع الأخبار\"])[1]")));

            // Wait for it to be clickable, then click
            wait.until(ExpectedConditions.elementToBeClickable(newpaperPage)).click();
            System.out.println("Newpaper website design link clicked successfully.");

        } catch (TimeoutException e) {
            System.err.println("Timed out waiting for the 'Newpaper website design' link to be visible or clickable: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
    public void openNewspaperPageEn() {
        openServicesMenu(); // Ensure Services menu is opened

        try {
            System.out.println("Attempting to locate 'Newpaper website design' link...");

            // Locate the 'Newpaper website design' link
            WebElement newpaperPage = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("(//a[contains(@href, \"newpaper-website-design\") and text()=\"Newpaper website design\"])[1]")));

            // Wait for it to be clickable, then click
            wait.until(ExpectedConditions.elementToBeClickable(newpaperPage)).click();
            System.out.println("Newpaper website design link clicked successfully.");

        } catch (TimeoutException e) {
            System.err.println("Timed out waiting for the 'Newpaper website design' link to be visible or clickable: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    public void openRealestatePage() {

        openServicesMenu();
        try {
            System.out.println("Attempting to locate 'real estate website design' link...");

            // Simplify the XPath for better reliability
            WebElement realestatePage = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//a[contains(@href, 'real-estate-website-design')]")
            ));

            // Scroll into view in case the element is not in the visible viewport
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", realestatePage);

            // Wait for it to be clickable, then click
            wait.until(ExpectedConditions.elementToBeClickable(realestatePage)).click();

            System.out.println("Real estate website design link clicked successfully.");

        } catch (TimeoutException e) {
            System.err.println("Timed out waiting for the 'Real estate website design' link to be visible or clickable: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
    public void openRealestatePageEn() {

        openServicesMenu();
        try {
            System.out.println("Attempting to locate 'real estate website design' link...");

            // Simplify the XPath for better reliability
            WebElement realestatePage = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("(//a[contains(@href, 'real-estate-website-design')])[1]")
            ));

            // Scroll into view in case the element is not in the visible viewport
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", realestatePage);

            // Wait for it to be clickable, then click
            wait.until(ExpectedConditions.elementToBeClickable(realestatePage)).click();

            System.out.println("Real estate website design link clicked successfully.");

        } catch (TimeoutException e) {
            System.err.println("Timed out waiting for the 'Real estate website design' link to be visible or clickable: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    public void openWebHostingPage() {
        openServicesMenu(); // Ensure Services menu is opened

        try {
            System.out.println("Attempting to locate 'Web Hosting' link...");

            // Locate the 'Web Hosting' link using a simplified XPath
            WebElement webHostingPage = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//a[contains(text(), 'Web Hosting') or contains(@href, 'web-hosting')]")
            ));

            // Scroll into view to ensure the element is within the viewport
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", webHostingPage);

            // Wait until the element is clickable, then try to click it
            wait.until(ExpectedConditions.elementToBeClickable(webHostingPage)).click();

            System.out.println("Web Hosting link clicked successfully.");

        } catch (TimeoutException e) {
            System.err.println("Timed out waiting for the 'Web Hosting' link to be visible or clickable: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
    public void openWebHostingPageEn() {
        openServicesMenu(); // Ensure Services menu is opened

        try {
            System.out.println("Attempting to locate 'Web Hosting' link...");

            // Locate the 'Web Hosting' link using a simplified XPath
            WebElement webHostingPage = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("(//a[contains(text(), 'Web Hosting') or contains(@href, 'web-hosting')])[1]")
            ));

            // Scroll into view to ensure the element is within the viewport
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", webHostingPage);

            // Wait until the element is clickable, then try to click it
            wait.until(ExpectedConditions.elementToBeClickable(webHostingPage)).click();

            System.out.println("Web Hosting link clicked successfully.");

        } catch (TimeoutException e) {
            System.err.println("Timed out waiting for the 'Web Hosting' link to be visible or clickable: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    public void openOurWorksPage() {

        try {
            System.out.println("Attempting to locate 'our works' link...");

            // Locate the 'our works' link
            WebElement OurWorksPage = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("(//a[@href='https://pido.nourcode.com/ar/our-works/'])[1]")
            ));

            // Wait for it to be clickable, then click
            wait.until(ExpectedConditions.elementToBeClickable(OurWorksPage)).click();
            System.out.println(" link clicked successfully.");

        } catch (TimeoutException e) {
            System.err.println("Timed out waiting for the 'Our Works' link to be visible or clickable: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
    public void openOurWorksPageEn() {

        try {
            System.out.println("Attempting to locate 'our works' link...");

            // Locate the 'our works' link
            WebElement OurWorksPage = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("(//a[@href='https://pido.nourcode.com/our-works/'])[1]")
            ));

            // Wait for it to be clickable, then click
            wait.until(ExpectedConditions.elementToBeClickable(OurWorksPage)).click();
            System.out.println(" link clicked successfully.");

        } catch (TimeoutException e) {
            System.err.println("Timed out waiting for the 'Our Works' link to be visible or clickable: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    public void openContactPage() {

        try {
            System.out.println("Attempting to locate 'Contact' link...");

            // Locate the 'Contact' link
            WebElement contactPage = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("(//a[@href='https://pido.nourcode.com/ar/contact/'])[1]")
            ));

            // Wait for it to be clickable, then click
            wait.until(ExpectedConditions.elementToBeClickable(contactPage)).click();
            System.out.println(" link clicked successfully.");

        } catch (TimeoutException e) {
            System.err.println("Timed out waiting for the 'Contact' link to be visible or clickable: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
    public void openContactPageEn() {

        try {
            System.out.println("Attempting to locate 'Contact' link...");

            // Locate the 'Contact' link
            WebElement contactPage = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("(//a[@href='https://pido.nourcode.com/contact/'])[1]")
            ));

            // Wait for it to be clickable, then click
            wait.until(ExpectedConditions.elementToBeClickable(contactPage)).click();
            System.out.println(" link clicked successfully.");

        } catch (TimeoutException e) {
            System.err.println("Timed out waiting for the 'Contact' link to be visible or clickable: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    public void openNewTicketPage() {

        try {
            System.out.println("Attempting to locate 'Contact' link...");

            // Locate the 'New Ticket' link
            WebElement contactPage = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("(//a[@href='https://pido.nourcode.com/ar/new-ticket/'])[1]")
            ));

            // Wait for it to be clickable, then click
            wait.until(ExpectedConditions.elementToBeClickable(contactPage)).click();
            System.out.println(" link clicked successfully.");

        } catch (TimeoutException e) {
            System.err.println("Timed out waiting for the 'New Ticket' link to be visible or clickable: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
    public void openNewTicketPageEn() {

        try {
            System.out.println("Attempting to locate 'Contact' link...");

            // Locate the 'New Ticket' link
            WebElement contactPage = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("(//a[@href='https://pido.nourcode.com/?page_id=1656'])[1]")
            ));

            // Wait for it to be clickable, then click
            wait.until(ExpectedConditions.elementToBeClickable(contactPage)).click();
            System.out.println(" link clicked successfully.");

        } catch (TimeoutException e) {
            System.err.println("Timed out waiting for the 'New Ticket' link to be visible or clickable: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    public void verifyPageTitle(String expected){
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle, expected);
        System.out.println("The title is: "+actualTitle);
        System.out.println("The title is: "+ expected);
    }

    public void languageBtnEn(){

        WebElement languageBtn=wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("(//li[@class='menu-item wpml-ls-slot-29 wpml-ls-item wpml-ls-item-en wpml-ls-menu-item wpml-ls-first-item wpml-ls-last-item menu-item-type-wpml_ls_menu_item menu-item-object-wpml_ls_menu_item menu-item-wpml-ls-29-en'])[1]")));

        languageBtn.click();
    }
    public void languageBtnAR(){

        WebElement languageBtn=wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("(//li[@class='menu-item wpml-ls-slot-29 wpml-ls-item wpml-ls-item-ar wpml-ls-menu-item wpml-ls-first-item wpml-ls-last-item menu-item-type-wpml_ls_menu_item menu-item-object-wpml_ls_menu_item menu-item-wpml-ls-29-ar'])[1]")));

        languageBtn.click();
    }

    public void openREZERVA() {
        try {
            // Wait for the overlay to be present
            WebElement overlay = wait.until(ExpectedConditions.presenceOfElementLocated(By
                    .xpath("//article[@data-id='6786']//div[contains(@class,'eael-entry-overlay')]")));

            // Scroll to the overlay
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", overlay);
            System.out.println("Overlay scrolled into view.");

            // Hover over the element to trigger any hover effects
            Actions actions = new Actions(driver);
            actions.moveToElement(overlay).perform();
            System.out.println("Hovered over the overlay.");

            // Wait for the clickable link to appear after hovering
            WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By
                    .xpath("//article[@data-id='6786']//a[@href='https://pido.nourcode.com/ar/our-works/rezerva-company-website/']")));
            System.out.println("Clickable link found.");

            // Ensure link is in view
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", link);

            // Debug: Highlight the clickable element for debugging
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", link);

            // Force click using JavaScript if needed
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", link);
            System.out.println("Link clicked successfully.");

        } catch (TimeoutException e) {
            System.err.println("Clickable link not found or not visible: " + e.getMessage());
        } catch (ElementNotInteractableException e) {
            System.err.println("Element not interactable. Trying JavaScript click.");
            try {
                WebElement fallbackLink = driver.findElement(By
                        .xpath("//article[@data-id='6786']//a[@href='https://pido.nourcode.com/ar/our-works/rezerva-company-website/']"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", fallbackLink);
                System.out.println("Fallback JavaScript click successful.");
            } catch (Exception ex) {
                System.err.println("Fallback click failed: " + ex.getMessage());
            }
        } catch (Exception e) {
            System.err.println("Unexpected error occurred: " + e.getMessage());
        }
    }
    public void openREZERVaEn() {
        try {
            // Wait for the overlay to be present
            WebElement overlay = wait.until(ExpectedConditions.presenceOfElementLocated(By
                    .xpath("//article[@data-id='1869']//div[contains(@class,'eael-entry-overlay')]")));

            // Scroll to the overlay
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", overlay);
            System.out.println("Overlay scrolled into view.");

            // Hover over the element to trigger any hover effects
            Actions actions = new Actions(driver);
            actions.moveToElement(overlay).perform();
            System.out.println("Hovered over the overlay.");

            // Wait for the clickable link to appear after hovering
            WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By
                    .xpath("//article[@data-id='1869']//a[@href='https://pido.nourcode.com/our-works/rezerva-company-website/']")));
            System.out.println("Clickable link found.");

            // Ensure link is in view
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", link);

            // Debug: Highlight the clickable element for debugging
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", link);

            // Force click using JavaScript if needed
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", link);
            System.out.println("Link clicked successfully.");

        } catch (TimeoutException e) {
            System.err.println("Clickable link not found or not visible: " + e.getMessage());
        } catch (ElementNotInteractableException e) {
            System.err.println("Element not interactable. Trying JavaScript click.");
            try {
                WebElement fallbackLink = driver.findElement(By
                        .xpath("//article[@data-id='1869']//a[@href='https://pido.nourcode.com/our-works/rezerva-company-website/']"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", fallbackLink);
                System.out.println("Fallback JavaScript click successful.");
            } catch (Exception ex) {
                System.err.println("Fallback click failed: " + ex.getMessage());
            }
        } catch (Exception e) {
            System.err.println("Unexpected error occurred: " + e.getMessage());
        }
    }

    public void openBrightonesWorld() {
        try {
            // Wait for the overlay to be present
            WebElement overlay = wait.until(ExpectedConditions.presenceOfElementLocated(By
                    .xpath("//article[@data-id='6787']//div[contains(@class,'eael-entry-overlay')]")));

            // Scroll to the overlay
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", overlay);
            System.out.println("Overlay scrolled into view.");

            // Hover over the element to trigger any hover effects
            Actions actions = new Actions(driver);
            actions.moveToElement(overlay).perform();
            System.out.println("Hovered over the overlay.");

            // Wait for the clickable link to appear after hovering
            WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By
                    .xpath("//article[@data-id='6787']//a[@href='https://pido.nourcode.com/ar/our-works/e-commerce-website-brightones-world/']")));
            System.out.println("Clickable link found.");


            // Ensure link is in view
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", link);

            // Debug: Highlight the clickable element for debugging
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", link);

            // Force click using JavaScript if needed
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", link);
            System.out.println("Link clicked successfully.");

        } catch (TimeoutException e) {
            System.err.println("Clickable link not found or not visible: " + e.getMessage());
        } catch (ElementNotInteractableException e) {
            System.err.println("Element not interactable. Trying JavaScript click.");
            try {
                WebElement fallbackLink = driver.findElement(By
                        .xpath("//article[@data-id='6787']//a[@href='https://pido.nourcode.com/ar/our-works/e-commerce-website-brightones-world/']"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", fallbackLink);
                System.out.println("Fallback JavaScript click successful.");
            } catch (Exception ex) {
                System.err.println("Fallback click failed: " + ex.getMessage());
            }
        } catch (Exception e) {
            System.err.println("Unexpected error occurred: " + e.getMessage());
        }
    }
    public void openBrightonesWorldEn() {
        try {
            // Wait for the overlay to be present
            WebElement overlay = wait.until(ExpectedConditions.presenceOfElementLocated(By
                    .xpath("//article[@data-id='2247']//div[contains(@class,'eael-entry-overlay')]")));

            // Scroll to the overlay
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", overlay);
            System.out.println("Overlay scrolled into view.");

            // Hover over the element to trigger any hover effects
            Actions actions = new Actions(driver);
            actions.moveToElement(overlay).perform();
            System.out.println("Hovered over the overlay.");

            // Wait for the clickable link to appear after hovering
            WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By
                    .xpath("//article[@data-id='2247']//a[@href='https://pido.nourcode.com/our-works/e-commerce-website-brightones-world/']")));
            System.out.println("Clickable link found.");


            // Ensure link is in view
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", link);

            // Debug: Highlight the clickable element for debugging
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", link);

            // Force click using JavaScript if needed
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", link);
            System.out.println("Link clicked successfully.");

        } catch (TimeoutException e) {
            System.err.println("Clickable link not found or not visible: " + e.getMessage());
        } catch (ElementNotInteractableException e) {
            System.err.println("Element not interactable. Trying JavaScript click.");
            try {
                WebElement fallbackLink = driver.findElement(By
                        .xpath("//article[@data-id='2247']//a[@href='https://pido.nourcode.com/our-works/e-commerce-website-brightones-world/']"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", fallbackLink);
                System.out.println("Fallback JavaScript click successful.");
            } catch (Exception ex) {
                System.err.println("Fallback click failed: " + ex.getMessage());
            }
        } catch (Exception e) {
            System.err.println("Unexpected error occurred: " + e.getMessage());
        }
    }

    public void openElsalhya() {
        try {
            // Wait for the overlay to be present
            WebElement overlay = wait.until(ExpectedConditions.presenceOfElementLocated(By
                    .xpath("//article[@data-id='6788']//div[contains(@class,'eael-entry-overlay')]")));

            // Scroll to the overlay
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", overlay);
            System.out.println("Overlay scrolled into view.");

            // Hover over the element to trigger any hover effects
            Actions actions = new Actions(driver);
            actions.moveToElement(overlay).perform();
            System.out.println("Hovered over the overlay.");

            // Wait for the clickable link to appear after hovering
            WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By
                    .xpath("//article[@data-id='6788']//a[@href='https://pido.nourcode.com/ar/our-works/elsalhya-garden-website/']")));
            System.out.println("Clickable link found.");

            // Ensure link is in view
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", link);

            // Debug: Highlight the clickable element for debugging
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", link);

            // Force click using JavaScript if needed
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", link);
            System.out.println("Link clicked successfully.");

        } catch (TimeoutException e) {
            System.err.println("Clickable link not found or not visible: " + e.getMessage());
        } catch (ElementNotInteractableException e) {
            System.err.println("Element not interactable. Trying JavaScript click.");
            try {
                WebElement fallbackLink = driver.findElement(By
                        .xpath("//article[@data-id='6788']//a[@href='https://pido.nourcode.com/ar/our-works/elsalhya-garden-website/']"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", fallbackLink);
                System.out.println("Fallback JavaScript click successful.");
            } catch (Exception ex) {
                System.err.println("Fallback click failed: " + ex.getMessage());
            }
        } catch (Exception e) {
            System.err.println("Unexpected error occurred: " + e.getMessage());
        }
    }
    public void openElsalhyaEn() {
        try {
            // Wait for the overlay to be present
            WebElement overlay = wait.until(ExpectedConditions.presenceOfElementLocated(By
                    .xpath("//article[@data-id='2282']//div[contains(@class,'eael-entry-overlay')]")));

            // Scroll to the overlay
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", overlay);
            System.out.println("Overlay scrolled into view.");

            // Hover over the element to trigger any hover effects
            Actions actions = new Actions(driver);
            actions.moveToElement(overlay).perform();
            System.out.println("Hovered over the overlay.");

            // Wait for the clickable link to appear after hovering
            WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By
                    .xpath("//article[@data-id='2282']//a[@href='https://pido.nourcode.com/our-works/elsalhya-garden-website/']")));
            System.out.println("Clickable link found.");

            // Ensure link is in view
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", link);

            // Debug: Highlight the clickable element for debugging
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", link);

            // Force click using JavaScript if needed
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", link);
            System.out.println("Link clicked successfully.");

        } catch (TimeoutException e) {
            System.err.println("Clickable link not found or not visible: " + e.getMessage());
        } catch (ElementNotInteractableException e) {
            System.err.println("Element not interactable. Trying JavaScript click.");
            try {
                WebElement fallbackLink = driver.findElement(By
                        .xpath("//article[@data-id='2282']//a[@href='https://pido.nourcode.com/our-works/elsalhya-garden-website/']"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", fallbackLink);
                System.out.println("Fallback JavaScript click successful.");
            } catch (Exception ex) {
                System.err.println("Fallback click failed: " + ex.getMessage());
            }
        } catch (Exception e) {
            System.err.println("Unexpected error occurred: " + e.getMessage());
        }
    }

    public void openAmirGroup() {

        try {
            // Wait for the overlay to be present
            WebElement overlay = wait.until(ExpectedConditions.presenceOfElementLocated(By
                    .xpath("//article[@data-id='6789']//div[contains(@class,'eael-entry-overlay')]")));

            // Scroll to the overlay
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", overlay);
            System.out.println("Overlay scrolled into view.");

            // Hover over the element to trigger any hover effects
            Actions actions = new Actions(driver);
            actions.moveToElement(overlay).perform();
            System.out.println("Hovered over the overlay.");

            // Wait for the clickable link to appear after hovering
            WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By
                    .xpath("//article[@data-id='6789']//a[@href='https://pido.nourcode.com/ar/our-works/amir-groub-website/']")));
            System.out.println("Clickable link found.");

            // Ensure link is in view
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", link);

            // Debug: Highlight the clickable element for debugging
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", link);

            // Force click using JavaScript if needed
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", link);
            System.out.println("Link clicked successfully.");

        } catch (TimeoutException e) {
            System.err.println("Clickable link not found or not visible: " + e.getMessage());
        } catch (ElementNotInteractableException e) {
            System.err.println("Element not interactable. Trying JavaScript click.");
            try {
                WebElement fallbackLink = driver.findElement(By
                        .xpath("//article[@data-id='6789']//a[@href='https://pido.nourcode.com/ar/our-works/amir-groub-website/']"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", fallbackLink);
                System.out.println("Fallback JavaScript click successful.");
            } catch (Exception ex) {
                System.err.println("Fallback click failed: " + ex.getMessage());
            }
        } catch (Exception e) {
            System.err.println("Unexpected error occurred: " + e.getMessage());
        }

    }
    public void openAmirGroupEn() {

        try {
            // Wait for the overlay to be present
            WebElement overlay = wait.until(ExpectedConditions.presenceOfElementLocated(By
                    .xpath("//article[@data-id='2280']//div[contains(@class,'eael-entry-overlay')]")));

            // Scroll to the overlay
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", overlay);
            System.out.println("Overlay scrolled into view.");

            // Hover over the element to trigger any hover effects
            Actions actions = new Actions(driver);
            actions.moveToElement(overlay).perform();
            System.out.println("Hovered over the overlay.");

            // Wait for the clickable link to appear after hovering
            WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By
                    .xpath("//article[@data-id='2280']//a[@href='https://pido.nourcode.com/our-works/amir-groub-website/']")));
            System.out.println("Clickable link found.");

            // Ensure link is in view
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", link);

            // Debug: Highlight the clickable element for debugging
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", link);

            // Force click using JavaScript if needed
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", link);
            System.out.println("Link clicked successfully.");

        } catch (TimeoutException e) {
            System.err.println("Clickable link not found or not visible: " + e.getMessage());
        } catch (ElementNotInteractableException e) {
            System.err.println("Element not interactable. Trying JavaScript click.");
            try {
                WebElement fallbackLink = driver.findElement(By
                        .xpath("//article[@data-id='2280']//a[@href='https://pido.nourcode.com/our-works/amir-groub-website/']"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", fallbackLink);
                System.out.println("Fallback JavaScript click successful.");
            } catch (Exception ex) {
                System.err.println("Fallback click failed: " + ex.getMessage());
            }
        } catch (Exception e) {
            System.err.println("Unexpected error occurred: " + e.getMessage());
        }

    }

    public void openMaka() {
        try {
            // Wait for the overlay to be present
            WebElement overlay = wait.until(ExpectedConditions.presenceOfElementLocated(By
                    .xpath("//article[@data-id='6790']//div[contains(@class,'eael-entry-overlay')]")));

            // Scroll to the overlay
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", overlay);
            System.out.println("Overlay scrolled into view.");

            // Hover over the element to trigger any hover effects
            Actions actions = new Actions(driver);
            actions.moveToElement(overlay).perform();
            System.out.println("Hovered over the overlay.");

            // Wait for the clickable link to appear after hovering
            WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By
                    .xpath("//article[@data-id='6790']//a[@href='https://pido.nourcode.com/ar/our-works/makka-real-state/']")));
            System.out.println("Clickable link found.");

            // Ensure link is in view
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", link);

            // Debug: Highlight the clickable element for debugging
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", link);

            // Force click using JavaScript if needed
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", link);
            System.out.println("Link clicked successfully.");

        } catch (TimeoutException e) {
            System.err.println("Clickable link not found or not visible: " + e.getMessage());
        } catch (ElementNotInteractableException e) {
            System.err.println("Element not interactable. Trying JavaScript click.");
            try {
                WebElement fallbackLink = driver.findElement(By
                        .xpath("//article[@data-id='6790']//a[@href='https://pido.nourcode.com/ar/our-works/makka-real-state/']"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", fallbackLink);
                System.out.println("Fallback JavaScript click successful.");
            } catch (Exception ex) {
                System.err.println("Fallback click failed: " + ex.getMessage());
            }
        } catch (Exception e) {
            System.err.println("Unexpected error occurred: " + e.getMessage());
        }

    }
    public void openMakaEn() {
        try {
            // Wait for the overlay to be present
            WebElement overlay = wait.until(ExpectedConditions.presenceOfElementLocated(By
                    .xpath("//article[@data-id='2278']//div[contains(@class,'eael-entry-overlay')]")));

            // Scroll to the overlay
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", overlay);
            System.out.println("Overlay scrolled into view.");

            // Hover over the element to trigger any hover effects
            Actions actions = new Actions(driver);
            actions.moveToElement(overlay).perform();
            System.out.println("Hovered over the overlay.");

            // Wait for the clickable link to appear after hovering
            WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By
                    .xpath("//article[@data-id='2278']//a[@href='https://pido.nourcode.com/our-works/makka-real-state/']")));
            System.out.println("Clickable link found.");

            // Ensure link is in view
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", link);

            // Debug: Highlight the clickable element for debugging
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", link);

            // Force click using JavaScript if needed
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", link);
            System.out.println("Link clicked successfully.");

        } catch (TimeoutException e) {
            System.err.println("Clickable link not found or not visible: " + e.getMessage());
        } catch (ElementNotInteractableException e) {
            System.err.println("Element not interactable. Trying JavaScript click.");
            try {
                WebElement fallbackLink = driver.findElement(By
                        .xpath("//article[@data-id='2278']//a[@href='https://pido.nourcode.com/our-works/makka-real-state/']"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", fallbackLink);
                System.out.println("Fallback JavaScript click successful.");
            } catch (Exception ex) {
                System.err.println("Fallback click failed: " + ex.getMessage());
            }
        } catch (Exception e) {
            System.err.println("Unexpected error occurred: " + e.getMessage());
        }

    }

   /* public void showBtn() {
        try {
            // Wait for the button container to appear in the DOM
            WebElement buttonContainer = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//div[contains(@class,'eael-load-more-button-wrap')]")
            ));
            System.out.println("Button container found in the DOM.");

            // Scroll to the button container to make it visible
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", buttonContainer);
            System.out.println("Scrolled to button container.");

            // Wait for the button itself to be present
            WebElement showBtn = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//div[contains(@class,'eael-load-more-button-wrap')]//button[contains(@class,'eael-load-more-button')]")
            ));
            System.out.println("Button located in the DOM.");

            // Highlight the button for debugging
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", showBtn);

            // Use explicit wait to ensure button is clickable
            wait.until(ExpectedConditions.elementToBeClickable(showBtn));
            System.out.println("Button is clickable.");

            // Handle potential intercepted clicks
            try {
                showBtn.click();
                System.out.println("Button clicked successfully.");
            } catch (ElementClickInterceptedException e) {
                System.err.println("Click intercepted. Trying JavaScript click.");
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", showBtn);
                System.out.println("Fallback JavaScript click successful.");
            }
        } catch (TimeoutException e) {
            System.err.println("Timeout: Element not found or not clickable within the specified timeout.");
            captureScreenshot("TimeoutError");
        } catch (ElementNotInteractableException e) {
            System.err.println("Element not interactable. Attempting fallback.");
            fallbackClick();
        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
        }
    }*/

    public void showBtn() {
        try {
            // Wait for the button container to appear in the DOM and be visible
            WebElement showBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//div[@class='eael-load-more-button-wrap']//button[@class='eael-load-more-button']")
            ));

            ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", showBtn);

            showBtn.click();

            } catch (Exception ex) {
            throw new RuntimeException(ex);
        }


    }


    private void fallbackClick() {
        try {
            WebElement fallbackBtn = driver.findElement(
                    By.xpath("//div[contains(@class,'eael-load-more-button-wrap')]//button[contains(@class,'eael-load-more-button')]")
            );
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", fallbackBtn);
            System.out.println("Fallback JavaScript click successful.");
        } catch (Exception ex) {
            System.err.println("Fallback click failed: " + ex.getMessage());
        }
    }

    private void captureScreenshot(String fileName) {
        try {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File("screenshots/" + fileName + ".png"));
            System.out.println("Screenshot captured: " + fileName);
        } catch (IOException e) {
            System.err.println("Failed to capture screenshot: " + e.getMessage());
        }
    }

    public void openEldawry() {

        try {
            // Wait for the overlay to be present
            WebElement overlay = wait.until(ExpectedConditions.presenceOfElementLocated(By
                    .xpath("//article[@data-id='6791']//div[contains(@class,'eael-entry-overlay')]")));

            // Scroll to the overlay
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", overlay);
            System.out.println("Overlay scrolled into view.");

            // Hover over the element to trigger any hover effects
            Actions actions = new Actions(driver);
            actions.moveToElement(overlay).perform();
            System.out.println("Hovered over the overlay.");

            // Wait for the clickable link to appear after hovering
            WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By
                    .xpath("//article[@data-id='6791']//a[@href='https://pido.nourcode.com/ar/our-works/eldawry-newspaper-website/']")));
            System.out.println("Clickable link found.");

            // Ensure link is in view
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", link);

            // Debug: Highlight the clickable element for debugging
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", link);

            // Force click using JavaScript if needed
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", link);
            System.out.println("Link clicked successfully.");

        } catch (TimeoutException e) {
            System.err.println("Clickable link not found or not visible: " + e.getMessage());
        } catch (ElementNotInteractableException e) {
            System.err.println("Element not interactable. Trying JavaScript click.");
            try {
                WebElement fallbackLink = driver.findElement(By
                        .xpath("//article[@data-id='6791']//a[@href='https://pido.nourcode.com/ar/our-works/eldawry-newspaper-website/']"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", fallbackLink);
                System.out.println("Fallback JavaScript click successful.");
            } catch (Exception ex) {
                System.err.println("Fallback click failed: " + ex.getMessage());
            }
        } catch (Exception e) {
            System.err.println("Unexpected error occurred: " + e.getMessage());
        }
    }
    public void openEldawryEn() {

        try {
            // Wait for the overlay to be present
            WebElement overlay = wait.until(ExpectedConditions.presenceOfElementLocated(By
                    .xpath("//article[@data-id='2276']//div[contains(@class,'eael-entry-overlay')]")));

            // Scroll to the overlay
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", overlay);
            System.out.println("Overlay scrolled into view.");

            // Hover over the element to trigger any hover effects
            Actions actions = new Actions(driver);
            actions.moveToElement(overlay).perform();
            System.out.println("Hovered over the overlay.");

            // Wait for the clickable link to appear after hovering
            WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By
                    .xpath("//article[@data-id='2276']//a[@href='https://pido.nourcode.com/our-works/eldawry-newspaper-website/']")));
            System.out.println("Clickable link found.");

            // Ensure link is in view
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", link);

            // Debug: Highlight the clickable element for debugging
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", link);

            // Force click using JavaScript if needed
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", link);
            System.out.println("Link clicked successfully.");

        } catch (TimeoutException e) {
            System.err.println("Clickable link not found or not visible: " + e.getMessage());
        } catch (ElementNotInteractableException e) {
            System.err.println("Element not interactable. Trying JavaScript click.");
            try {
                WebElement fallbackLink = driver.findElement(By
                        .xpath("//article[@data-id='2276']//a[@href='https://pido.nourcode.com/our-works/eldawry-newspaper-website/']"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", fallbackLink);
                System.out.println("Fallback JavaScript click successful.");
            } catch (Exception ex) {
                System.err.println("Fallback click failed: " + ex.getMessage());
            }
        } catch (Exception e) {
            System.err.println("Unexpected error occurred: " + e.getMessage());
        }
    }

    public void openKhaledElnagar() {
        try {
            // Wait for the overlay to be present
            WebElement overlay = wait.until(ExpectedConditions.presenceOfElementLocated(By
                    .xpath("//article[@data-id='6792']//div[contains(@class,'eael-entry-overlay')]")));

            // Scroll to the overlay
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", overlay);
            System.out.println("Overlay scrolled into view.");

            // Hover over the element to trigger any hover effects
            Actions actions = new Actions(driver);
            actions.moveToElement(overlay).perform();
            System.out.println("Hovered over the overlay.");

            // Wait for the clickable link to appear after hovering
            WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By
                    .xpath("//article[@data-id='6792']//a[@href='https://pido.nourcode.com/ar/our-works/khaled-elngar-personal-website/']")));
            System.out.println("Clickable link found.");

            // Ensure link is in view
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", link);

            // Debug: Highlight the clickable element for debugging
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", link);

            // Force click using JavaScript if needed
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", link);
            System.out.println("Link clicked successfully.");

        } catch (TimeoutException e) {
            System.err.println("Clickable link not found or not visible: " + e.getMessage());
        } catch (ElementNotInteractableException e) {
            System.err.println("Element not interactable. Trying JavaScript click.");
            try {
                WebElement fallbackLink = driver.findElement(By
                        .xpath("//article[@data-id='6792']//a[@href='https://pido.nourcode.com/ar/our-works/khaled-elngar-personal-website/']"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", fallbackLink);
                System.out.println("Fallback JavaScript click successful.");
            } catch (Exception ex) {
                System.err.println("Fallback click failed: " + ex.getMessage());
            }
        } catch (Exception e) {
            System.err.println("Unexpected error occurred: " + e.getMessage());
        }
    }
    public void openKhaledElnagarEn() {
        try {
            // Wait for the overlay to be present
            WebElement overlay = wait.until(ExpectedConditions.presenceOfElementLocated(By
                    .xpath("//article[@data-id='2274']//div[contains(@class,'eael-entry-overlay')]")));

            // Scroll to the overlay
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", overlay);
            System.out.println("Overlay scrolled into view.");

            // Hover over the element to trigger any hover effects
            Actions actions = new Actions(driver);
            actions.moveToElement(overlay).perform();
            System.out.println("Hovered over the overlay.");

            // Wait for the clickable link to appear after hovering
            WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By
                    .xpath("//article[@data-id='2274']//a[@href='https://pido.nourcode.com/our-works/khaled-elngar-personal-website/']")));
            System.out.println("Clickable link found.");

            // Ensure link is in view
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", link);

            // Debug: Highlight the clickable element for debugging
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", link);

            // Force click using JavaScript if needed
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", link);
            System.out.println("Link clicked successfully.");

        } catch (TimeoutException e) {
            System.err.println("Clickable link not found or not visible: " + e.getMessage());
        } catch (ElementNotInteractableException e) {
            System.err.println("Element not interactable. Trying JavaScript click.");
            try {
                WebElement fallbackLink = driver.findElement(By
                        .xpath("//article[@data-id='2274']//a[@href='https://pido.nourcode.com/our-works/khaled-elngar-personal-website/']"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", fallbackLink);
                System.out.println("Fallback JavaScript click successful.");
            } catch (Exception ex) {
                System.err.println("Fallback click failed: " + ex.getMessage());
            }
        } catch (Exception e) {
            System.err.println("Unexpected error occurred: " + e.getMessage());
        }
    }

    public void openLegalSupport() {
        try {
            // Wait for the overlay to be present
            WebElement overlay = wait.until(ExpectedConditions.presenceOfElementLocated(By
                    .xpath("//article[@data-id='6793']//div[contains(@class,'eael-entry-overlay')]")));

            // Scroll to the overlay
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", overlay);
            System.out.println("Overlay scrolled into view.");

            // Hover over the element to trigger any hover effects
            Actions actions = new Actions(driver);
            actions.moveToElement(overlay).perform();
            System.out.println("Hovered over the overlay.");

            // Wait for the clickable link to appear after hovering
            WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By
                    .xpath("//article[@data-id='6793']//a[@href='https://pido.nourcode.com/ar/our-works/legal-support-website-design/']")));
            System.out.println("Clickable link found.");

            // Ensure link is in view
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", link);

            // Debug: Highlight the clickable element for debugging
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", link);

            // Force click using JavaScript if needed
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", link);
            System.out.println("Link clicked successfully.");

        } catch (TimeoutException e) {
            System.err.println("Clickable link not found or not visible: " + e.getMessage());
        } catch (ElementNotInteractableException e) {
            System.err.println("Element not interactable. Trying JavaScript click.");
            try {
                WebElement fallbackLink = driver.findElement(By
                        .xpath("//article[@data-id='6793']//a[@href='https://pido.nourcode.com/ar/our-works/legal-support-website-design/']"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", fallbackLink);
                System.out.println("Fallback JavaScript click successful.");
            } catch (Exception ex) {
                System.err.println("Fallback click failed: " + ex.getMessage());
            }
        } catch (Exception e) {
            System.err.println("Unexpected error occurred: " + e.getMessage());
        }
    }
    public void openLegalSupporten() {
        try {
            // Wait for the overlay to be present
            WebElement overlay = wait.until(ExpectedConditions.presenceOfElementLocated(By
                    .xpath("//article[@data-id='2511']//div[contains(@class,'eael-entry-overlay')]")));

            // Scroll to the overlay
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", overlay);
            System.out.println("Overlay scrolled into view.");

            // Hover over the element to trigger any hover effects
            Actions actions = new Actions(driver);
            actions.moveToElement(overlay).perform();
            System.out.println("Hovered over the overlay.");

            // Wait for the clickable link to appear after hovering
            WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By
                    .xpath("//article[@data-id='2511']//a[@href='https://pido.nourcode.com/our-works/legal-support-website-design/']")));
            System.out.println("Clickable link found.");

            // Ensure link is in view
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", link);

            // Debug: Highlight the clickable element for debugging
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", link);

            // Force click using JavaScript if needed
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", link);
            System.out.println("Link clicked successfully.");

        } catch (TimeoutException e) {
            System.err.println("Clickable link not found or not visible: " + e.getMessage());
        } catch (ElementNotInteractableException e) {
            System.err.println("Element not interactable. Trying JavaScript click.");
            try {
                WebElement fallbackLink = driver.findElement(By
                        .xpath("//article[@data-id='2511']//a[@href='https://pido.nourcode.com/our-works/legal-support-website-design/']"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", fallbackLink);
                System.out.println("Fallback JavaScript click successful.");
            } catch (Exception ex) {
                System.err.println("Fallback click failed: " + ex.getMessage());
            }
        } catch (Exception e) {
            System.err.println("Unexpected error occurred: " + e.getMessage());
        }
    }
}


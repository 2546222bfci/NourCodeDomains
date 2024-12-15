package org.example.Webber.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import java.time.Duration;

public class P01_NavigatingWebberPages {
    private final WebDriver driver;
    private final Wait<WebDriver> wait;

    public P01_NavigatingWebberPages(WebDriver driver) {
        this.driver = driver;
        this.wait=new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(40))
                .pollingEvery(Duration.ofMillis(2000))
                .ignoring(org.openqa.selenium.NoSuchElementException.class);
    }


    public void verifyPageTitle(String expected){
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle, expected);
        System.out.println("The title is: "+actualTitle);
        System.out.println("The title is: "+ expected);
    }

    private void openPage(String pagetUrl) {
        try {
            // Wait for the project link to be present in the DOM
            WebElement page = wait.until(ExpectedConditions.visibilityOfElementLocated(By
                    .xpath("//a[@href='" + pagetUrl + "']")));

            wait.until(ExpectedConditions.elementToBeClickable(page)).click();
            System.out.println(" link clicked successfully.");


        } catch (TimeoutException e) {
            System.err.println("Timeout: Unable to locate or interact with the page link: " + pagetUrl);
        } catch (Exception e) {
            System.err.println("Error while opening page: " + pagetUrl + " - " + e.getMessage());
        }

    }
    public void openHomepage() {

        openPage("https://webber.link/");
    }
    public void openServicePage() {

        openPage("https://webber.link/services/");

    }
    public void openOurWorksPage(){

        openPage("https://webber.link/works/");
    }
    public void hoveringServiceMenu(){
        try {
            // Locate the "Services" menu and wait for it to be visible
            WebElement servicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//li[@id='menu-item-181']/a")
            ));

            System.out.println("Services menu found. Hovering over it to display the submenu...");

            // Use Actions to hover over the "Services" menu
            Actions actions = new Actions(driver);
            actions.moveToElement(servicesMenu).perform();

            System.out.println("Hover action performed successfully. Submenu should now be visible.");

            // Optionally, wait for a submenu item to be visible (e.g., 'تصميم متجر الكتروني')
            WebElement ecommerceLink = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//li[@id='menu-item-186']/a")
            ));

            System.out.println("Submenu is visible. Specific submenu item ('تصميم متجر الكتروني') is accessible.");

        } catch (TimeoutException e) {
            System.err.println("Timed out waiting for the 'Services' menu or submenu to be visible: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    public void openServicesPages(String partialHref) {
        try {
            // Ensure the "Services" menu is opened
            hoveringServiceMenu();
            System.out.println("Services menu opened.");

            // Locate the link for the specified page using partial href
            WebElement page = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//li[contains(@class, 'menu-item-object-services')]//a[contains(@href, '" + partialHref + "')]")
            ));

            // Wait for the link to be clickable and click it
            wait.until(ExpectedConditions.elementToBeClickable(page)).click();
            System.out.println("Page link with href containing '" + partialHref + "' clicked successfully.");

        } catch (TimeoutException e) {
            System.err.println("Timeout: Unable to locate or interact with the page link: " + partialHref);
        } catch (Exception e) {
            System.err.println("Error while opening page: " + partialHref + " - " + e.getMessage());
        }
    }

    public void openHostingService(){
        openServicesPages("%d8%a7%d8%b3%d8%aa%d8%b6%d8%a7%d9%81%d8%a9-%d9%85%d9%88%d8%a7%d9%82%d8%b9-%d8%a7%d9%84%d8%a7%d9%86%d8%aa%d8%b1%d9%86%d8%aa");
    }

    public void openPersonalService(){
        openServicesPages("%d8%aa%d8%b5%d9%85%d9%8a%d9%85-%d9%85%d9%88%d9%82%d8%b9-%d8%b4%d8%ae%d8%b5%d9%8a");
    }

    public void openCompanyServices(){
        openServicesPages("%d8%aa%d8%b5%d9%85%d9%8a%d9%85-%d9%85%d9%88%d9%82%d8%b9-%d8%b4%d8%b1%d9%83%d8%a9");
    }

    public void openNewPaperServices(){
        openServicesPages("%d8%aa%d8%b5%d9%85%d9%8a%d9%85-%d8%aa%d8%b7%d8%a8%d9%8a%d9%82%d8%a7%d8%aa-%d8%a7%d9%84%d8%ac%d9%88%d8%a7%d9%84");
    }

    public void openEcommerceService(){
        openServicesPages("%d8%aa%d8%b5%d9%85%d9%8a%d9%85-%d9%85%d8%aa%d8%ac%d8%b1-%d8%a7%d9%84%d9%83%d8%aa%d8%b1%d9%88%d9%86%d9%8a");
    }

    public void openRealEstateService(){
        openServicesPages("%d8%aa%d8%b5%d9%85%d9%8a%d9%85-%d9%85%d9%88%d9%82%d8%b9-%d8%b9%d9%82%d8%a7%d8%b1%d9%8a");
    }


   public void clickOnContact(){
        WebElement contactUs=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='#contact']")));
        contactUs.click();
   }

    public void verifySectionTitle(String expectedTitle) {
        try {
            // Locate the section title element using its XPath
            WebElement sectionTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//h1[@class='main-header' and contains(., 'تواصل') and contains(., 'معنا')]")
            ));

            // Get the text of the element
            String actualTitle = sectionTitle.getText().trim();

            // Assert the title matches the expected value
            if (actualTitle.equals(expectedTitle)) {
                System.out.println("Section title verified successfully: " + actualTitle);
            } else {
                System.err.println("Section title does not match. Expected: " + expectedTitle + ", but found: " + actualTitle);
            }
        } catch (TimeoutException e) {
            System.err.println("Timeout: Unable to locate the section title: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    public void clickOnTheLogo(){
        WebElement logo=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='navbar-brand' and @title='ويبر']")));
        logo.click();
    }

}

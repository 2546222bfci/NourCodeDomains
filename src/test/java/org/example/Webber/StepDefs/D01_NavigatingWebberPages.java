package org.example.Webber.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pido.Pages.P01_NavigatePages;
import org.example.Webber.Pages.P01_NavigatingWebberPages;
import org.openqa.selenium.WebDriver;

import static org.example.Webber.hooksWebber.driver;

public class D01_NavigatingWebberPages {

    P01_NavigatingWebberPages navigatingWebberPages=new P01_NavigatingWebberPages(driver);
    //P01_NavigatePages navigatePidoPages= new P01_NavigatePages(driver);

    @Given("navigate to the Webber homepage")
    public void navigateToTheWebberHomepage() {

        navigatingWebberPages.openHomepage();

    }
    

    @Then("verify the webber homepage title is {string}")
    public void verifyTheWebberHomepageTitleIsExpected(String expected) {

        navigatingWebberPages.verifyPageTitle(expected);

    }

    @When("open Webber service page")
    public void openWebberServiceMenu() {
        navigatingWebberPages.openServicePage();
    }

    @Then("verify webbre service page title is {string}")
    public void verifyServivePageTitleIsPageTitle(String pageTitle) {

        navigatingWebberPages.verifyPageTitle(pageTitle);
    }

    @When("Hovering Webber service menu")
    public void hoveringWebberServiceMenu() {

        navigatingWebberPages.hoveringServiceMenu();
    }

    @When("open webber Web Hosting page")
    public void openWebberWebHostingPage() {
        navigatingWebberPages.openHostingService();

    }

    @When("open webber Personal website design page")
    public void openWebberPersonalWebsiteDesignPage() {

        navigatingWebberPages.openPersonalService();

    }

    @When("open webber Company website design page")
    public void openWebberCompanyWebsiteDesignPage() {
        navigatingWebberPages.openCompanyServices();
        
    }

    @When("open webber Newpaper website design page")
    public void openWebberNewpaperWebsiteDesignPage() {
        navigatingWebberPages.openNewPaperServices();
    }

    @When("open webber E-commerce website design page")
    public void openWebberECommerceWebsiteDesignPage() {

        navigatingWebberPages.openEcommerceService();
    }

    @When("open webber Real estate website design page")
    public void openWebberRealEstateWebsiteDesignPage() {

        navigatingWebberPages.openRealEstateService();
        
    }

    @When("open webber our works page")
    public void openWebberOurWorksPage() {

        navigatingWebberPages.openOurWorksPage();
    }


    @Then("verify Web Hosting page title is {string} for webber")
    public void verifyWebHostingPageTitleIsPageTitleForWebber(String pageTitle) {

        navigatingWebberPages.verifyPageTitle(pageTitle);
    }

    @Then("verify the Personal website page title is {string} for webber")
    public void verifyThePersonalWebsitePageTitleIsPageTitleForWebber(String pageTitle) {
        navigatingWebberPages.verifyPageTitle(pageTitle);
    }

    @Then("verify the Company website page title is {string} for webber")
    public void verifyTheCompanyWebsitePageTitleIsPageTitleForWebber(String pageTitle) {
        navigatingWebberPages.verifyPageTitle(pageTitle);
    }

    @Then("verify Newpaper page title is {string} for webber")
    public void verifyNewpaperPageTitleIsPageTitleForWebber(String pageTitle) {
        navigatingWebberPages.verifyPageTitle(pageTitle);
    }

    @Then("verify the E-commerce website title is {string} for webber")
    public void verifyTheECommerceWebsiteTitleIsPageTitleForWebber(String pageTitle) {
        navigatingWebberPages.verifyPageTitle(pageTitle);
    }

    @Then("verify Real estate page title is {string} for webber")
    public void verifyRealEstatePageTitleIsPageTitleForWebber(String pageTitle) {
        navigatingWebberPages.verifyPageTitle(pageTitle);
    }

    @When("click on Contact us at the menu")
    public void openWebberContactPage() {

        navigatingWebberPages.clickOnContact();
    }


    @Then("Scroll to contact us section verifying section title {string}")
    public void scrollToContactUsSectionVerifyingSectionTitlePageTitle(String sectionTitle) {
        navigatingWebberPages.verifySectionTitle(sectionTitle);
    }

    @Then("verify Our Work page title {string} for webber")
    public void verifyOurWorkPageTitlePageTitleForWebber(String pageTitle) {
        navigatingWebberPages.verifyPageTitle(pageTitle);
    }

    @When("click on the logo")
    public void clickOnTheLogo() {

        navigatingWebberPages.clickOnTheLogo();
    }
}

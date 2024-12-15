package org.example.Pido.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pido.Pages.P01_NavigatePages;
import static org.example.Pido.Hooks.driver;

public class D01_NavigatePages {

    P01_NavigatePages navigatePages=new P01_NavigatePages(driver);

    @Given("navigate to the Pido homepage")
    public void navigateToThePidoHomepage() {

        navigatePages.navigateToHomePage();
    }

    @Given("navigate to the Pido homepage in en")
    public void navigateToThePidoHomepageInEn() {

        navigatePages.navigateToHomePageEn();
    }

    @Then("verify the homepage title is {string}")
    public void verifyHomeTitle(String expected) {

        navigatePages.verifyPageTitle(expected);
    }

    @Then("verify the homepage title is {string} in en")
    public void verifyHomeTitleinen(String expected) {

        navigatePages.verifyPageTitle(expected);
    }

    @When("open service menu")
    public void openServiceMenu() {

        navigatePages.openServicesMenu();
    }
    
    @And("open E-commerce website design page")
    public void openECommerceWebsiteDesign() {

        navigatePages.openEcommerceLink();
    }

    @And("open E-commerce website design page in en")
    public void openECommerceWebsiteDesigninen() {

        navigatePages.openEcommerceLinkEn();
    }

    @Then("verify the E-commerce website title is {string}")
    public void verifyTheECommerceWebsiteTitleIs(String pageTitle) {

        navigatePages.verifyPageTitle(pageTitle);
    }

    @Then("verify the E-commerce website title is {string} in en")
    public void verifyTheECommerceWebsiteTitleIsinen(String pageTitle) {

        navigatePages.verifyPageTitle(pageTitle);
    }

    @When("open Personal website design page")
    public void openPersonalWebsiteDesignPage() {

        navigatePages.openPersonalPage();
    }

    @When("open Personal website design page in en")
    public void openPersonalWebsiteDesignPageinen() {

        navigatePages.openPersonalPageEn();
    }

    @Then("verify the Personal website page title is {string}")
    public void verifyThePersonalWebsitePageTitleIs(String pageTitle) {

        navigatePages.verifyPageTitle(pageTitle);
    }

    @Then("verify the Personal website page title is {string} in en")
    public void verifyThePersonalWebsitePageTitleIsinen(String pageTitle) {

        navigatePages.verifyPageTitle(pageTitle);
    }

    @When("open Newpaper website design page")
    public void openPersonalNewpaperWebsiteDesignPage() {

      navigatePages.openNewspaperPage();
    }

    @When("open Newpaper website design page in en")
    public void openPersonalNewpaperWebsiteDesignPageinen() {

        navigatePages.openNewspaperPageEn();
    }

    @Then("verify Newpaper page title is {string}")
    public void verifyNewpaperPageTitleIs(String pageTitle) {

        navigatePages.verifyPageTitle(pageTitle);
    }

    @Then("verify Newpaper page title is {string} in en")
    public void verifyNewpaperPageTitleIsinen(String pageTitle) {

        navigatePages.verifyPageTitle(pageTitle);
    }

    @When("open Real estate website design page")
    public void openRealEstateWebsiteDesignPage() {

        navigatePages.openRealestatePage();
    }

    @When("open Real estate website design page in en")
    public void openRealEstateWebsiteDesignPageinen() {

        navigatePages.openRealestatePageEn();
    }

   
    
    @Then("verify Real estate page title is {string}")
    public void verifyRealEstatePageTitleIs(String pageTitle) {

        navigatePages.verifyPageTitle(pageTitle);
    }

    @Then("verify Real estate page title is {string} in en")
    public void verifyRealEstatePageTitleIsinen(String pageTitle) {

        navigatePages.verifyPageTitle(pageTitle);
    }

    @When("open Web Hosting page")
    public void openWebHostingPage() {

        navigatePages.openWebHostingPage();
    }

    @When("open Web Hosting page in en")
    public void openWebHostingPageinen() {

        navigatePages.openWebHostingPageEn();
    }

    @Then("verify Web Hosting page title is {string}")
    public void verifyWebHostingPageTitleIs(String pageTitle) {

        navigatePages.verifyPageTitle(pageTitle);
    }

    @Then("verify Web Hosting page title is {string} in en")
    public void verifyWebHostingPageTitleIsinen(String pageTitle) {

        navigatePages.verifyPageTitle(pageTitle);
    }

    @When("open our works page")
    public void openOurWorksPage() {

        navigatePages.openOurWorksPage();
    }

    @When("open our works page in en")
    public void openOurWorksPageinen() {

        navigatePages.openOurWorksPageEn();
    }

    @Then("verify Our Work page title {string}")
    public void verifyItsTitle(String pageTitle) {

        navigatePages.verifyPageTitle(pageTitle);
    }

    @Then("verify Our Work page title {string} in en")
    public void verifyItsTitleinen(String pageTitle) {

        navigatePages.verifyPageTitle(pageTitle);
    }

    @When("open Contact page")
    public void openContactPage() {

        navigatePages.openContactPage();
    }

    @When("open Contact page in en")
    public void openContactPageinen() {

        navigatePages.openContactPageEn();
    }

    @Then("verify Contact page title {string}")
    public void verifyContactPageTitle(String pageTitle) {

        navigatePages.verifyPageTitle(pageTitle);
    }

    @Then("verify Contact page title {string} in en")
    public void verifyContactPageTitleinen(String pageTitle) {

        navigatePages.verifyPageTitle(pageTitle);
    }

    @When("open New Ticket page")
    public void openNewTicketPage() {

        navigatePages.openNewTicketPage();
    }

    @When("open New Ticket page in en")
    public void openNewTicketPageinen() {

        navigatePages.openNewTicketPageEn();
    }

    @Then("verify New Ticket page title {string}")
    public void verifyNewTicketPageTitle(String pageTitle) {

        navigatePages.verifyPageTitle(pageTitle);
    }

    @Then("verify New Ticket page title {string} in en")
    public void verifyNewTicketPageTitleinen(String pageTitle) {

        navigatePages.verifyPageTitle(pageTitle);
    }
    

    @When("click on language Ar button it switches to En site")
    public void clickOnLanguageArButtonItSwitchesToEnSite() {

        navigatePages.languageBtnEn();
    }

    @When("click on language Ar button it switches to Ar site")
    public void clickOnLanguageArButtonItSwitchesToEnSiteAr() {

        navigatePages.languageBtnAR();
    }


    @Then("verify that the site title become in arabic {string}")
    public void verifyThatTheSiteTitleBecomeInEnglish(String arg0) {

        navigatePages.verifyPageTitle(arg0);
    }

    @Then("verify that the site title become in english {string} in en")
    public void verifyThatTheSiteTitleBecomeInEnglishInEn(String arg0) {

        navigatePages.verifyPageTitle(arg0);
    }

    @And("open E-commerce website Brightones world")
    public void openECommerceWebsiteBrightonesWorld() {

        navigatePages.openBrightonesWorld();
    }

    @And("open REZERVA Company website")
    public void openREZERVACompanyWebsite() {

        navigatePages.openREZERVA();
    }

    @And("open Elsalhya garden website")
    public void openElsalhyaGardenWebsite() {

        navigatePages.openElsalhya();
    }

    @And("open Amir groub website")
    public void openAmirGroubWebsite() {

        navigatePages.openAmirGroup();
    }

    @And("open Makka Real state")
    public void openMakkaRealState() {

        navigatePages.openMaka();
    }

    @And("open eldawry newspaper website")
    public void openEldawryNewspaperWebsite() {

        navigatePages.openEldawry();
    }

    @And("open Khaled Elngar Personal Website")
    public void openKhaledElngarPersonalWebsite() {

        navigatePages.openKhaledElnagar();
    }

    @And("open Legal Support Website design")
    public void openLegalSupportWebsiteDesign() {
        navigatePages.openLegalSupport();
    }

    @Then("Verify {string}")
    public void verify(String expectedPageTitle) {

        navigatePages.verifyPageTitle(expectedPageTitle);

        try {
            Thread.sleep(2000); // Delay for 2 seconds (2000 milliseconds)
        } catch (InterruptedException e) {
            System.err.println("Interrupted while waiting: " + e.getMessage());
        }

        driver.navigate().back();
    }

    @When("click on the show all button")
    public void clickOnTheShowAllButton() {

        navigatePages.showBtn();
    }


    @And("open E-commerce website Brightones world in en")
    public void openECommerceWebsiteBrightonesWorldInEn() {

        navigatePages.openBrightonesWorldEn();
    }

    @And("open REZERVA Company website in en")
    public void openREZERVACompanyWebsiteInEn() {

        navigatePages.openREZERVaEn();
    }

    @And("open Elsalhya garden website in en")
    public void openElsalhyaGardenWebsiteInEn() {

        navigatePages.openElsalhyaEn();
    }

    @And("open Amir groub website in en")
    public void openAmirGroubWebsiteInEn() {

    navigatePages.openAmirGroupEn();
    }

    @And("open Makka Real state in en")
    public void openMakkaRealStateInEn() {

        navigatePages.openMakaEn();
    }

    @And("open eldawry newspaper website in en")
    public void openEldawryNewspaperWebsiteInEn() {

        navigatePages.openEldawryEn();
    }

    @And("open Khaled Elngar Personal Website in en")
    public void openKhaledElngarPersonalWebsiteInEn() {

        navigatePages.openKhaledElnagarEn();
    }

    @And("open Legal Support Website design in en")
    public void openLegalSupportWebsiteDesignInEn() {

        navigatePages.openLegalSupporten();
    }


}

package org.example.Pido.StepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pido.Pages.P02_ZoomResponsiveness;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static org.example.Pido.Hooks.driver;

public class D02_ZoomResponsiveness {

    P02_ZoomResponsiveness p02ZoomResponsiveness=new P02_ZoomResponsiveness(driver);

    @Then("verify the homepage loads correctly and all elements are visible")
    public void Verify_ZoomResponsiveness() {
        p02ZoomResponsiveness.verifyHomepageLoadsCorrectly();
    }

    @When("zooming in to {int}%")
    public void zoomingInTo(int  zoomPercentage) {

       p02ZoomResponsiveness.Zooming_Rest(zoomPercentage);

    }

    @When("zooming out to {int}%")
    public void zoomingOutTo(int zoomingPercentage) {
        p02ZoomResponsiveness.Zooming_Rest(zoomingPercentage);
    }

    @Then("verifying that:")
    public void verifyingThat() {
    }

    @When("reset zoom to {int}%")
    public void resetZoomTo(int rest) {
        p02ZoomResponsiveness.Zooming_Rest(rest);
    }
}

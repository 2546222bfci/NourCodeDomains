Feature: Navigation and Page Verification on Rezerva Website

    Scenario: navigation and page titles for all main sections on Rezerva website
        Given nvigate the Rezerva homepage

        When  navigate to the rezerva home page
        Then  verify the page title is "rezerva"

        When  scroll to the "Who We Are" section contains
        Then  the "Who We Are" header link should have a border highlight

        When  scroll to the "Our Services" section
        Then  the "Our Services" header link should have a border highlight

        When  scroll to the "Our Team" section
        Then  the "Our Team" header link should have a border highlight

        When  scroll to the "Our Clients" section
        Then  the "Our Clients" header link should have a border highlight

        When  navigate to the "Dashboard Guidelines" page
        Then  should see the page title as "dashboard guidelines – rezerva"

        When  scroll to the "Contact Us" section
        Then  the "Contact Us" header link should have a border highlight
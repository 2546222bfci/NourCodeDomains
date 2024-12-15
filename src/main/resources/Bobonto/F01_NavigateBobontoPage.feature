Feature: Navigate through website pages and verify content

    Background:
        Given  the website home page

    @navigation
    Scenario Outline: Navigate to each page from the navigation bar and verify elements
        When  click on "<menu_item>" in the navigation bar
        Then  should be redirected to the "<page_url>"
        And   should see "<expected_element>" on the page

        Examples:
            | menu_item     | page_url       | expected_element        |
            | Home          | /home          | "Welcome to Bobonto"    |
            | Opportunities | /opportunities | "Explore Opportunities" |
            | Events        | /events        | "Upcoming Events"       |
            | Blog          | /blog          | "Latest Blog Posts"     |
            | News          | /news          | "Recent News"           |
            | Categories    | /categories    | "Explore Categories"    |
            | About         | /about         | "About Us"              |
            | Contact us    | /contact-us    | "Get in Touch"          |

    @login
    Scenario: Login button is visible on the navigation bar
        Then  the "Login" button in the navigation bar

    @language
    Scenario: Language switch button is visible
        Then  the language button "Fi" in the navigation bar

Feature: Navigate through website pages and verify content

    Scenario Outline: Navigate to each page from the navigation bar and verify elements

        Given navigate to the Webber homepage
        Then verify the webber homepage title is <expected>

        When open Webber service page
        Then verify webbre service page title is <pageTitle0>

        When Hovering Webber service menu

        When open webber Web Hosting page
        Then verify Web Hosting page title is <pageTitle1> for webber

        When open webber Personal website design page
        Then verify the Personal website page title is <pageTitle2> for webber

        When open webber Company website design page
        Then verify the Company website page title is <pageTitle3> for webber

        When open webber Newpaper website design page
        Then verify Newpaper page title is <pageTitle4> for webber

        When  open webber E-commerce website design page
        Then verify the E-commerce website title is <pageTitle5> for webber

        When open webber Real estate website design page
        Then verify Real estate page title is <pageTitle6> for webber

        When open webber our works page
        Then verify Our Work page title <pageTitle7> for webber

        When click on Contact us at the menu
        Then Scroll to contact us section verifying section title <pageTitle8>

        When click on the logo
        Then verify the webber homepage title is <expected>


        Examples:

            | expected   | pageTitle0 |pageTitle1                       | pageTitle2                    | pageTitle3                      | pageTitle4                | pageTitle5          | pageTitle6             | pageTitle7              | pageTitle8 |

            | "ويبر – لتصميم المواقع"|   "الخدمات – ويبر"       |  "استضافة مواقع – ويبر"   |"تصميم موقع شخصي – ويبر"|"تصميم موقع شركة – ويبر"|"تصميم موقع إخباري – ويبر"|"تصميم متجر الكتروني – ويبر"|"تصميم موقع عقاري – ويبر"|"أعمالنا – ويبر"|"تواصل معنا"|


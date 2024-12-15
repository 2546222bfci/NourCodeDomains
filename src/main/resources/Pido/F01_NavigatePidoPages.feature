Feature: Test the navigation and functionality of Pido website
    Scenario Outline: Verify that all key pages on Pido Arabic website load successfully

        Given navigate to the Pido homepage
        Then verify the homepage title is <expected>

        When open service menu

        And  open E-commerce website design page
        Then verify the E-commerce website title is <pageTitle>

        When open Real estate website design page
        Then verify Real estate page title is <pageTitle1>

        When open Personal website design page
        Then verify the Personal website page title is <pageTitle2>

        When open Newpaper website design page
        Then verify Newpaper page title is <pageTitle3>

        When open Web Hosting page
        Then verify Web Hosting page title is <pageTitle4>

        When open our works page
        Then verify Our Work page title <pageTitle5>

        When open Contact page
        Then verify Contact page title <pageTitle6>

        When open New Ticket page
        Then verify New Ticket page title <pageTitle7>

        When  navigate to the Pido homepage

        When click on language Ar button it switches to En site
        Then verify that the site title become in arabic <pageTitle8>

        Examples:
            | expected  | pageTitle                                   | pageTitle1                       | pageTitle2                    | pageTitle3                      | pageTitle4                | pageTitle5          | pageTitle6             | pageTitle7              | pageTitle8 |
            | "نور كود" | "تصميم مواقع التجارة الإلكترونية – نور كود" | "تصميم مواقع العقارات – نور كود" | "تصميم مواقع شخصية – نور كود" | "تصميم مواقع الأخبار – نور كود" | "استضافة الويب – نور كود" | "أعمالنا – نور كود" | "تواصل معنا – نور كود" | "تذكرة جديدة – نور كود" | "Nourcode" |


    Scenario Outline: Verify that all key pages on Pido English website load successfully
        Given navigate to the Pido homepage in en
        Then verify the homepage title is <expected> in en

        When open service menu

        And  open E-commerce website design page in en
        Then verify the E-commerce website title is <pageTitle> in en

        When open Real estate website design page in en
        Then verify Real estate page title is <pageTitle1> in en

        When open Personal website design page in en
        Then verify the Personal website page title is <pageTitle2> in en

        When open Newpaper website design page in en
        Then verify Newpaper page title is <pageTitle3> in en

        When open Web Hosting page in en
        Then verify Web Hosting page title is <pageTitle4> in en

        When open our works page in en
        Then verify Our Work page title <pageTitle5> in en

        When open Contact page in en
        Then verify Contact page title <pageTitle6> in en

        When open New Ticket page in en
        Then verify New Ticket page title <pageTitle7> in en

        When  navigate to the Pido homepage in en

        When click on language Ar button it switches to Ar site
        Then verify that the site title become in english <pageTitle8> in en
        Examples:
            | expected   | pageTitle                              | pageTitle1                           | pageTitle2                           | pageTitle3                              | pageTitle4               | pageTitle5             | pageTitle6           | pageTitle7              | pageTitle8 |
            | "Nourcode" | "E-commerce website design – Nourcode" | "Real estate website design – Nourcode" | "Personal website design – Nourcode" | "Newpaper website design – Nourcode" | "Web Hosting – Nourcode" | "Our Works – Nourcode" | "Contact – Nourcode" | "New Ticket – Nourcode" | "نور كود"  |



    Scenario Outline: navigate the projectes from the our work page at the ar site

        When open our works page

        And open E-commerce website Brightones world
        Then Verify "<projectTitle1>"

        And open REZERVA Company website
        Then Verify "<projectTitle2>"

        And  open Elsalhya garden website
        Then Verify "<projectTitle3>"

        And  open Amir groub website
        Then Verify "<projectTitle4>"

        And  open Makka Real state
        Then Verify "<projectTitle5>"

        When click on the show all button
        And  open eldawry newspaper website
        Then Verify "<projectTitle6>"

        When click on the show all button
        And open Khaled Elngar Personal Website
        Then Verify "<projectTitle7>"

        #When click on the show all button
        And open Legal Support Website design
        Then Verify "<projectTitle8>"

        Examples:
            | projectTitle1 | projectTitle2 | projectTitle3 | projectTitle4 | projectTitle5 | projectTitle6 | projectTitle7 | projectTitle8 |
            | موقع التجارة الإلكترونية Brightones World – نور كود              |   موقع شركة REZERVA – نور كود            |     موقع Elsalhya garden – نور كود          |   موقع Amir groub – نور كود            |    موقع مكة العقارية – نور كود           |      موقع eldawry newspaper – نور كود         |  الموقع الشخصي لخالد النجار – نور كود             |    تصميم موقع دعم قانوني – نور كود           |




    Scenario Outline: navigate the projectes from the our work page at the en site

        Given navigate to the Pido homepage in en

        When open our works page in en

        And open E-commerce website Brightones world in en
        Then Verify "<projectTitle1>"

        And open REZERVA Company website in en
        Then Verify "<projectTitle2>"

        And open Elsalhya garden website in en
        Then Verify "<projectTitle3>"

        And open Amir groub website in en
        Then Verify "<projectTitle4>"

        And open Makka Real state in en
        Then Verify "<projectTitle5>"

        When click on the show all button
        And open eldawry newspaper website in en
        Then Verify "<projectTitle6>"

        When click on the show all button
        And open Khaled Elngar Personal Website in en
        Then Verify "<projectTitle7>"

        #When click on the show all button
        And open Legal Support Website design in en
        Then Verify "<projectTitle8>"

        Examples:
            | projectTitle1 | projectTitle2 | projectTitle3 | projectTitle4 | projectTitle5 | projectTitle6 | projectTitle7 | projectTitle8 |
            | E-commerce website Brightones world – Nourcode              |  REZERVA Company website – Nourcode            |     Elsalhya garden website – Nourcode          |   Amir groub website – Nourcode            |    Makka Real state – Nourcode           |      eldawry newspaper website – Nourcode         |  Khaled Elngar Personal Website – Nourcode             |    Legal Support Website design – Nourcode           |

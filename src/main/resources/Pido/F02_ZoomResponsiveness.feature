Feature: Verify responsiveness of the homepage by zooming in and out

    Scenario: Test zoom levels and check layout adjustments

        Given navigate to the Pido homepage

        Then  verify the homepage loads correctly and all elements are visible

        When  zooming in to 150%

       # Then verifying that:
           # | Condition                      |
            #| Layout adjusts to fit the zoom |
           # | Content remains legible |


        When zooming out to 50%
        #Then verifying that:
         #   | Condition                          |
          #  | Layout adjusts to fit the zoom |
           # | Content remains legible |

        When  reset zoom to 100%
        #Then I verify that the page is restored to its original state
        #And I check responsiveness:
         #   | Observation                         |
          #  | Layout adjusts properly at all zoom |
           # | No overlapping or layout issues |

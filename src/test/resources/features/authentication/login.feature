Feature: Back Office - Sign In

  Background: Navigate to backoffice
    Given Navigate to login screen

  Scenario Outline: Sign In - Successful Login to backoffice
    When I use Valid username "<username>" and Valid password "<password>"
    Then Click on Ok button

    Examples: Login Credentials
      | username        | password     |
      | root@ordyx.com  | BestDevTeam! |


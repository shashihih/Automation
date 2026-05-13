Feature: BBC Website Testing

  Scenario: Verify BBC News page title

    Given User opens BBC website
    When User clicks on News link
    Then Verify page title contains "News"
Feature: Custom Test
  This feature provides a basic test

#  Use vm options to import properties from the plugin: -Dcucumber.plugin=com.ruppyrup.CucumberSecretsPlugin
  Scenario: get the correct output from parameters
    Given there the bean is created
    When the message is produced
    Then I will receive the correct message
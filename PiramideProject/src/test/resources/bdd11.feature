#Author: brunin.lolzero@gmail.com

@execute
Feature: Validate the information of my API
  Me as QA tester want to validate some information from an API

	Background: Access api
	Given that I access api to get to consult an information

  Scenario: Validate status code
   Then I validate return code 
 
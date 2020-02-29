Feature: Testing basics

Scenario: 1.I want to test get request
Given race ciricute application is running
When I hit get request to get response
Then I validate ciricute "MRData.limit" value as "30" present
Then I validate ciricute "MRData.total" value as "20" present
Then I validate ciricute "MRData.CircuitTable.Circuits[0].circuitId" value as "albert_park" present
 

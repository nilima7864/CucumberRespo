Feature: Testing basics

Scenario: 3.I want to test google is up and running
Given google have website
When hit google application
Then I validate status code

Scenario: 4.I want to test Ergast is up and running
Given Ergast have website
When hit Ergast application
Then validate status code of Ergast


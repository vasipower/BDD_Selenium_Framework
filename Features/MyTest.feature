Feature: Reset functionality on login page of Application


Scenario Outline: Verification of reset button with numbers of credential

Given Open the Firefox and launch the application

When User enters "<username>" and "<password>" 


Then Reset the credential

Examples:                      		

   
    | username  | password  | 
    | vasisolar@gmail.com | 8892932010 |
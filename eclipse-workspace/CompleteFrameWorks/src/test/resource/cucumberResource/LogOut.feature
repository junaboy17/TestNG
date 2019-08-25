Feature: We want to test Letskode it 

User should able to use the website functionality Use

Background: Open browser and Go To Web Site
					Given I open "Chrome" and got to "https://letskodeit.teachable.com/"
					
Scenario: Test LogOut 

				When I start log in with "nightgroup@gmail.com" and "night123"
				And  I click log out
				Then I should see LogIn
					
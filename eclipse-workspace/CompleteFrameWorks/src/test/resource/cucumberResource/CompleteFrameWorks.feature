Feature: We want to test Letskode it 

User should able to use the website functionality Use

Background: Open browser and Go To Web Site
					Given I open "Chrome" and got to "https://letskodeit.teachable.com/"
	
Scenario: test logIn

					When I start log in with "nightgroup@gmail.com" and "night123"
					Then I should see My Courses
					
					
				
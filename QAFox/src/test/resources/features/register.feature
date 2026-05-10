Feature: M_VIGNESHWARANN_5TH_MAY_QAFox_RegisterFearure

	Background:
		Given the user launches the application
		
	@ValidRegistration
	Scenario: Verify registration with valid credentials
	
	 Given the user is on register page
	 When the user enters the valid cedentials
	 | Johnn | WWick | jwjwjw@gmail.com | 7485961232 | admin | admin | 
	 And click continue
	 Then the greet message should appear as "Your Account Has Been Created!";
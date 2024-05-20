package resources;

public class testData {
		
//----------------------------------Registreion--------------------------------------	
	public static String firstname="gaurav";
	public static String lastname="arundekar";
	public static String telephone="4561237891";
	public static String password="Secure12345";
	
	//trash data
	
	public static String trash="sadfasd";
	
	public static String MsgAccountCreated="Your Account Has Been Created!";
	
	
//----------------------------------Assertion--------------------------------------	
	public static String ExistExpected="Warning: E-Mail Address is already registered!";
	
	//Error assertion
	
	public static String ExpectedFn="First Name must be between 1 and 32 characters!";
	public static String ExpectedLn="Last Name must be between 1 and 32 characters!";
	public static String ExpectedEmail="E-Mail Address does not appear to be valid!";
	public static String ExpectedTel="Telephone must be between 3 and 32 characters!";
	public static String ExpectedPassword="Password must be between 4 and 20 characters!";
	
	
	//-------------------------------login aseertion--------------------------------
	public static String LoginSuccesfulExpected = "My Account";
	public static String ExpectedNoFound="Warning: No match for E-Mail Address and/or Password.";
	public static String EmptyFildExpected="Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.";
	
	
	
}

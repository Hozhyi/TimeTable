public class IncorrectAuthorizationData extends Exception 
{
	public String L, P;
	IncorrectAuthorizationData(String L, String P) 
	{ 
		this.L = L;
		this.P = P;
	}
	
	//override toString() method
	public String toString() 
	{
		return "Account login '" + L + "' and password '" + P + "' not found!"; 
	}
}

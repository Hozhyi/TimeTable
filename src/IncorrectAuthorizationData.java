public class IncorrectAuthorizationData extends Exception 
{
	public String L, P;
	IncorrectAuthorizationData(String L, String P) 
	{ 
		this.L = L;
		this.P = P;
	}
	
	public String toString() 
	{
		return "ќбл≥ковий запис з лог≥ном '" + L + "' та паролем '" + P + "' не знайдено!"; 
	}
}

import java.util.*;
import java.io.*;

public class Subject 
{
	 //private String name;
	 
	 public String getName(int n) 
	 {
		int i = 0;
		Scanner sc;
		try 
		{
		   sc = new Scanner(new File("res//subjects.txt")); 
		}
		catch(Exception ex) 
		{
			return "";
		}
		String S;
		while (sc.hasNext())
		{
			i++;
			S = sc.nextLine();
			if (i == n) 
			{
				sc.close();
				return S;
			}
		}
		sc.close();
		return "";
	 }

	/*	
	 public void Subject(String name) 
	 {
		 
	 }
	 */
}

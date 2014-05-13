import java.io.File;
import java.util.Scanner;

public class Lecturer 
{
/*
  private String name;

  private String degree;

  public void Lecturer(String name, String degree) 
  {
	  
  }
*/
  public String getName(int n) 
  {
	    int i = 0;
		Scanner sc;
		try 
		{
		   sc = new Scanner(new File("res//Lecturers.txt")); 
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

  public String getDegree() 
  {
	  return null;
  }

  public void changeDegree(String s) 
  {
	  
  }

}
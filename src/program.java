import java.util.*;
import java.io.*;

public class program 
{
	static int type = 0;
	static int number = 0;
	static String Gn = "KM-11";
	static int Y = 2011;
	static ArrayList<Student> stud = new ArrayList<Student>();
	static Scanner scn;
	public static void main(String args[])
	{
		System.out.println("Enter '1' to watch your profile or '2' to watch timetable:");
		scn = new Scanner(System.in);
		String s = scn.nextLine();
		if (s.equals("1")) watch_profile();
		else if (s.equals("2")) watch_timetable();
	}
	
	public static void watch_timetable()
	{
		Timetable tt = new Timetable("res\\timetable.txt");
		tt.show_timetable();
	}
	
	public static void watch_profile()
	{
		String Login;
		String Password;
		do 
		{
		scn = new Scanner(System.in);
		System.out.println("Enter login:");
		Login = scn.nextLine();
		System.out.println("Enter password:");
		Password = scn.nextLine();
		
		try
		{
			authorization(Login,Password);
			break;
		}
		catch(Exception ex)
		{
			System.out.println(ex + " Спробуйте знову!");
			continue;
		}
		
		}
		while (true);
		
		
		init_list();
		//System.out.println(type + " " + number);
		if (type == 0) user_profile();
		else admin_profile();
	}
	
	public static void init_list()
	{
		Scanner s;
		try
		{
		    s = new Scanner(new File("res\\students.txt"));
		}
		catch(Exception ex) { return; }
		while(s.hasNext()) stud.add(new Student(s.nextLine(), Gn, Y));
		s.close();
	}
	
	public static void admin_profile()
	{
		System.out.println("Administrator");
		for(Student l: stud) System.out.println(l.name);
	}
	
	public static void user_profile()
	{
		System.out.println("User: " + stud.get(number - 1).name + ". Group: " + 
	    stud.get(number - 1).GroupName + ". Created in " + stud.get(number - 1).year + ".");
	}
	
	public static boolean authorization(String L, String P) throws IncorrectAuthorizationData
	{
		try
		{
			scn = new Scanner(new File("res\\author.txt"));
		}
		catch(Exception ex)
		{
			System.out.println("File is not found!");
			return false;
		}
		String d;
		int h = 0;
		while (scn.hasNext())
		{
		   d = scn.next();
		   String[] S = d.split("\\|");
		   h++;
		   if (!(S[0].equals(L)) || !(S[1].equals(P))) continue;
		   type = (S[2].equals("a") ? 1 : 0);
		   number = h - 1;
		   scn.close();
		   return true;
		}
		scn.close();
		throw new IncorrectAuthorizationData(L, P);
		//return false;
	}

}

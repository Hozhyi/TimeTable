import java.util.*;
import java.io.File;

public class Timetable
{
	String s;
	//static Lesson[] ls = new Lesson[20];
	static Lesson ls;
	static String[] week = {"Понеділок","Вівторок","Середа","Четверг","П'ятниця","Субота"};
	
	public Timetable(String s)
	{
		this.s = s;
	}
	
	public void show_timetable()
	{
		Scanner sc;
		String[] t;
		int n = 0;
		try
		{
		    sc = new Scanner(new File(s));
		}
		catch (Exception ex) 
		{
			return;
		}
		while (sc.hasNext()) 
		{
			System.out.println(week[n]);
			for(int i = 0; i <6; i++)
			{
				t = (sc.nextLine().split("\\|"));
				if (t.length != 5) continue;
				ls = new Lesson(Integer.parseInt(t[1]), Integer.parseInt(t[2]));
				System.out.println(t[0] + ". " + ls.getNS() + " / " +
				ls.getNL() + " / " + t[3]);
			}
			n++;
		}
		sc.close();
	}
}

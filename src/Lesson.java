public class Lesson 
{

  public String auditory;

  public int num1, num2;
  
  public Subject SB = new Subject();
  public Lecturer L = new Lecturer();
  
  public Lesson(int num1, int num2) 
  {
	  this.num1 = num1;
	  this.num2 = num2;
  }
  
  public String getNS()
  {
	  return SB.getName(num1);
  }

  public String getNL()
  {
	  return L.getName(num2);
  }
  
  public String getAuditory() 
  {
     return null;
  }

  public int getNumberOfLesson() 
  {
     return 0;
  }

}
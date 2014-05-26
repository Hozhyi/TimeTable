package Students;

public class Group {
    private final String mName;
    private final int mYearOfCreating;
    private int mNumberOfStudent = 0;
//-------------------------------------------------
    public Group(String name, int year){
        //required to make exceptions!!!!
        mName = name;
        mYearOfCreating = year;
    }

    public String getName(){
        return mName;
    }

    public int getNumberOfStudent(){
        return mNumberOfStudent;
    }

    public int getYearOfCreating(){
        return mYearOfCreating;
    }
}

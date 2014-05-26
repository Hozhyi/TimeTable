package Students;

public class Student{
    private final String mName;
    private Group group;
//----------------------------
    public Student(String name,Group _group){
        group = _group;
        if (name != "") {
            mName = name;
        } else {
            mName = "Error: name is empty";
        }
    }
    public String getName(){
        return mName;
    }
}

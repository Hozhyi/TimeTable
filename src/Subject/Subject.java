package Subject;

public class Subject {
    private final String mName;
//-------------------------------
    public Subject (String name){
        if ( name != "" ){
            mName = name;
        } else {
            mName = "Error: subject name is empty";
        }
    }

    public String getName () {
        return mName;
    }
}

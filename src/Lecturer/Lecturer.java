package Lecturer;

public class Lecturer {
    private final String mName;
    private String mDegree = "Error: degree isn't point";
//-----------------------------------

    public Lecturer(String name) {
        this(name,"minimum degree");
    }

    public Lecturer(String name, String degree){
        setDegree(name);

        if (name != ""){
            mName = name;
        } else {
            mName = "Error: name is empty";
        }
    }

    public String getName (){
        return mName;
    }

    public String getDegree (){
        return mDegree;
    }

    public void setDegree(String degree){
        if (degree != "") {
            mDegree = degree;
        }
    }
}

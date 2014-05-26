package Graduates;

import java.util.ArrayList;

public class Graduates {
    private ArrayList<Graduate> graduates = new ArrayList<Graduate>();
//------------------------------------------------------------------
    public void addGraduate(Graduate graduate){
        graduates.add(graduate);
        return;
    }
}

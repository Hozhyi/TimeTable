package Lessons;

import java.util.ArrayList;

public class TimeTable{
    private ArrayList<Lesson> lessons;
//---------------------------------------------
    public void addLesson(Lesson _lesson){
        lessons.add(_lesson);
    }

    public void remLesson(Lesson _lesson){
        lessons.remove(_lesson);
        return;
    }
}

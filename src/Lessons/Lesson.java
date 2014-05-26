package Lessons;

import Lecturer.Lecturer;
import Students.Group;
import Subject.Subject;

import java.util.ArrayList;

public class Lesson {
    private Subject subject;
    private Lecturer lecturer;
    private ArrayList<Group> groups;
    private String auditory;
    private int numberOfLesson;
//------------------------------------
    public Lesson(String _auditory, int _numberOfLesson, Lecturer _lecturer, Group _group){
        auditory = _auditory;
        numberOfLesson = _numberOfLesson;
        lecturer = _lecturer;
        groups = new ArrayList<Group>();
        groups.add(_group);
//        довбаний бидлокод, бо того шо не мона зробити так:
//
//        ArrayList<Students.Group> _groups = new ArrayList<Students.Group>();
//        _groups.add(_group);
//        this(_auditory,_numberOfLesson,_lecturer,_groups);
//        бо довбаний this не може визиватись не першим
    }

    public Lesson(String _auditory, int _numberOfLesson, Lecturer _lecturer, ArrayList<Group> _groups){
        auditory = _auditory;
        numberOfLesson = _numberOfLesson;
        lecturer = _lecturer;
        groups = _groups;
    }

    public String getAuditory(){
        return auditory;
    }

    public int getNumberOfLesson(){
        return numberOfLesson;
    }

    public void setAuditory(String _auditory){
        auditory = _auditory;
        return;
    }

    public void addGroup (Group _group){
        groups.add(_group);
        return;
    }

    public void remGroup(Group _group){
        groups.remove(_group);
        return;
    }
}

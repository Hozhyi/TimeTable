package Graduates;
import Students.Student;
import Subject.Subject;
import Lecturer.Lecturer;


public class Graduate {
    private Student student;
    private Subject subject;
    private Lecturer lecturer;
    private String graduate;
    private String forWhat;

    //--------------------------------
    public Graduate(String _graduate, Student _student, Subject _subject, Lecturer _lecturer){
        this(_graduate,_student,_subject,_lecturer,"DB");
    }
    public Graduate(String _graduate, Student _student, Subject _subject, Lecturer _lecturer,String _forWhat){
        student = _student;
        subject = _subject;
        lecturer = _lecturer;
        graduate = _graduate;
        forWhat = _forWhat;
    }

    public void setGraduate(String _graduate){
        graduate = _graduate;
    }
}

package school;

import java.util.ArrayList;
import java.util.List;

public class School {
    private static School instance = new School();
    private static String SCHOOL_NAME = "Good School";
    private ArrayList<Subject> subjectList = new ArrayList<Subject>();
    private ArrayList<Student> studentList = new ArrayList<Student>();
    private School(){
    }
    public static School getInstance(){
        if(instance == null){
            instance = new School();
        }
        return instance;
    }

    public void addSubject(Subject subject){
        subjectList.add(subject);
    }

    public void addStudent(Student student){
        studentList.add(student);
    }
    public ArrayList<Subject> getSubjectList() {
        return subjectList;
    }

    public ArrayList<Student> getStudentList(){
        return studentList;
    }
}

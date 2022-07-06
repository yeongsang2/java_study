package school;

import java.util.ArrayList;
import java.util.List;
import utils.Define;

public class Subject {

    private int subjectId;
    private String subjectName;
    private int gradeType;
    private List<Student> studentList = new ArrayList<Student>();
    public Subject(){

    }
    public Subject(String subjectName,int subjectId) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.gradeType = Define.AB_TYPE;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getGradeType() {
        return gradeType;
    }

    public void setGradeType(int gradeType) {
        this.gradeType = gradeType;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void register(Student student){
        studentList.add(student);
    }
}

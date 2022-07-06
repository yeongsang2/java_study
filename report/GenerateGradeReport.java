package report;

import grade.*;
import school.*;
import utils.Define;


import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class GenerateGradeReport {
    School school = School.getInstance();
    public static final String TITLE = " 수강생 학점 \t\t\n";
    public static final String HEADER =" 이름 | 학번 | 필수과목 | 점수 \n ";
    public static final String LINE = "-------------------------------\n";

    private StringBuffer buffer = new StringBuffer();

    public String getReport(){
        ArrayList<Subject> subjectList =  school.getSubjectList();

        for(Subject subject : subjectList) {
            System.out.println(subject.getSubjectName());
        }
        for(Subject subject : subjectList){
            makeHeader(subject);
            makeBody(subject);
            makeFooter();
        }
        String result = buffer.toString();
        return result;
    }

    public void makeHeader(Subject subject){
        buffer.append(GenerateGradeReport.LINE);
        buffer.append("\t" +  subject.getSubjectName());
        buffer.append(GenerateGradeReport.TITLE);
        buffer.append(GenerateGradeReport.HEADER);
        buffer.append(GenerateGradeReport.LINE);
    }


    public void makeBody(Subject subject){

        ArrayList<Student> studentList = school.getStudentList();
        for(Student student : studentList){
            System.out.println(student.getStudentName());
        }
        for(int i= 0; i< studentList.size(); i++){

            Student student = studentList.get(i);
            buffer.append(student.getStudentName());
            buffer.append(" | ");
            buffer.append(student.getStudentId());
            buffer.append(" | ");
            buffer.append(student.getMajor().getSubjectName() + '\t');
            buffer.append(" | ");

            getScoreGrade(student, subject.getSubjectId()); //학생별 수강 과목 학점 계산

            buffer.append("\n");
            buffer.append(LINE);

        }

    }

    public  void getScoreGrade(Student student, int subjectId){
        ArrayList<Score> scoreList = student.getScoreList();
        int majorId = student.getMajor().getSubjectId();

        GradeEvaluation[] gradeEvaluations ={
                new BasicEvaluation(),
                new MajorEvaluation()
        };
        for(int i =0; i< scoreList.size(); i++){
            Score score = scoreList.get(i);
            if(score.getSubject().getSubjectId() == subjectId) {
                String grade;
                if(score.getSubject().getSubjectId() == majorId){
                    grade =  gradeEvaluations[Define.SAB_TYPE].getGrade(score.getPoint());
                }else {
                    grade = gradeEvaluations[Define.AB_TYPE].getGrade(score.getPoint());
                }
                    buffer.append((score.getPoint()));
                    buffer.append((" | "));
                    buffer.append(grade);
                    buffer.append(" | ");
                }
            }
        }
    public void makeFooter(){
        buffer.append("\n");
    }


}

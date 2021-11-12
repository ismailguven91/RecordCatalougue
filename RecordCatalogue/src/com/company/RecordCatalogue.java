package com.company;

import java.util.ArrayList;
import java.util.List;

public class RecordCatalogue {

    //States
    private List <Integer> grades;
    private List <Student> students;
    private String schoolName;

    //Constuctor1
    public RecordCatalogue (String nameOfSchool){
        schoolName=nameOfSchool;
        students = new ArrayList<>();
    }
    //Constructor2
    public RecordCatalogue(List<Integer> gr, List<Student> st) {
    grades = gr;
    students = st;

    }


    //Behaviour
    public String getSchoolName() {
        return schoolName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student s){
    students.add(s);
    }

}

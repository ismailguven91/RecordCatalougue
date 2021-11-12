package com.company;

public class Student {

    //Constructor 1
    public Student (String name, RecordBook book ){
        studentName = name;
        recordBook = book;
    }

    //Constructor 2
    public Student(String name) {
    studentName= name;
    }

    //States
    private String studentName;
    private RecordBook recordBook;

    //Behaviour
    public String getStudentName() {

        return studentName;
    }
    public RecordBook getRecordBook() {
        return recordBook;
    }

    public String getName() {
        return studentName;
    }



}

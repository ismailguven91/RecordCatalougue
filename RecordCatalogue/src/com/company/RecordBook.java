package com.company;

import java.util.ArrayList;
import java.util.List;

public class RecordBook {

    //Constuctor1
    public RecordBook() {
        studentGrades = new ArrayList<>();
    }

    //Constructor2
    public RecordBook(List<Integer> grades) {
        studentGrades = grades;
    }

    //States
    private List<Integer> studentGrades;

    //Behaviour
    public List<Integer> getStudentGrades() {
        return studentGrades;
    }

    public void addGrades(List<Integer> studentGrades) {
        this.studentGrades = studentGrades;

    }

    public int CalcAverage() {
        int total = 0;
        for (var g : studentGrades
        ) {
            total = total + g;
        }
        var average = total / studentGrades.size();
        return average;
    }

}





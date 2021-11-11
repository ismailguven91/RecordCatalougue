package com.company;

import java.util.ArrayList;
import java.util.List;

public class RecordBook {

    //Constuctor
    public RecordBook() {
        studentGrades = new ArrayList<>();
    }

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

    public void CalcMaxValue() {
        int max = studentGrades.get(0);

        int n = studentGrades.size();

        for (int i = 1; i <n; i++){
            if (studentGrades.get(i) > max){
                max = studentGrades.get(i);
            }
        }
    }
   /*     int min = studentGrades.get(0);

        int m = studentGrades.size();
        for (int i=1; i<m; i++){
            if (studentGrades.get(i)<min){
                min = studentGrades.get(i);
            }
        }*/
    }



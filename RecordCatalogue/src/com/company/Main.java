package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) throws Exception {
        List<Student> students = new ArrayList<>();
        List<RecordBook> grades = new ArrayList<>();
        RecordCatalogue catalogue = new RecordCatalogue("Grit Academy");
        System.out.println("SCHOOL NAME :"+catalogue.getSchoolName());

        //Hämtar min txt-fil.
        File file = new File(
               "/Users/ismailmariaguven/IdeaProjects/RecordCatalogue/src/com/company/Students.txt");

        //Läser min hämtade txt-fil.
        BufferedReader br = new BufferedReader(new FileReader(file));

        //Används i min loop
        String st;
        List<String> lines = new ArrayList<>();

        //Loopar genom filen för att bland annat splitta min array för att sedan ge olika värden.
        while ((st = br.readLine()) != null) {

            var array = st.split(":");
            //catalogue.addStudent(new Student(array[0], new RecordBook()));
            List<Integer> notas = new ArrayList<>();
            var betyg = array[1].split(",");
            for (var b : betyg
            ) {
                notas.add(Integer.parseInt(b.trim()));
            }

            catalogue.addStudent(new Student(array[0], new RecordBook(notas)));

        }
        for (var item : catalogue.getStudents()
        ) {
            System.out.println("*****************");
            System.out.println("Student name :" +item.getName());
            System.out.println("Student grades :" +item.getRecordBook().getStudentGrades());
            System.out.println("Avarage grade :" +item.getRecordBook().CalcAverage());
            //System.out.println("Max grade: "+ item.getRecordBook().CalcMaxValue());

        }
    }
}




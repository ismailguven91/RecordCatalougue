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

        //HÄMTAR MIN TXT-FIL
        File file = new File(
               "/Users/ismailmariaguven/IdeaProjects/RecordCatalogue/src/com/company/Students.txt");

        //LÄSER IN MIN TXT-FIL
        BufferedReader br = new BufferedReader(new FileReader(file));

        //AVÄNDS I MIN LOOP
        String st;

        //ANVÄNDS EJ (RAFAEL LADE TILL DEN)
        List<String> lines = new ArrayList<>();

        //LOOPAR IGENOM FILEN
        while ((st = br.readLine()) != null) {

            //SKAPAR EN STRING-ARRAY OCH SPLITTAR GENOM ":".
            var array = st.split(":");
            //catalogue.addStudent(new Student(array[0], new RecordBook()));

            //SKAPAR EN LIST SOM HETER "NOTAS"
            List<Integer> notas = new ArrayList<>();
            //NOTAS SKILJER ALLA INTEGERS MED ","
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
            System.out.println("Highest grade for this student : "+item.getRecordBook().CalcMax());
            System.out.println("Lowest grade for this student: "+item.getRecordBook().CalcMin());
        }
    }
}




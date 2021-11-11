package com.company;

import javax.xml.catalog.Catalog;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) throws Exception
    {
        List <Student> students = new ArrayList<>();
        List <RecordBook> grades = new ArrayList<>();
        RecordCatalogue catalogue = new RecordCatalogue("Grit Academy");
        System.out.println(catalogue.getSchoolName());

         File file = new File(
                "/Users/ismailmariaguven/Desktop/katalog.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        List<String> lines=new ArrayList<>();

        while ((st = br.readLine()) != null) {

            var array = st.split(":");
            System.out.println("Index 0=>"+array[0]);
            //catalogue.addStudent(new Student(array[0], new RecordBook()));
            System.out.println("Index 1=>"+array[1]);
            List<Integer> notas = new ArrayList<>();
            var betyg = array[1].split(",");
            for (var b: betyg
                 ) {
                notas.add(Integer.parseInt(b.trim()));
            }

            catalogue.addStudent(new Student(array[0], new RecordBook(notas)));

        }
        for (var item: catalogue.getStudents()
        ) {
            System.out.println( item.getName());
            System.out.println( item.getRecordBook().getStudentGrades() + "Average Grade => " + item.getRecordBook().CalcAverage());

        }

        int min = studentGrades.get(0);

        int m = studentGrades.size();
        for (int i=1; i<m; i++){
            if (studentGrades.get(i)<min){
                min = studentGrades.get(i);
            }
        }        }


    // Läsa Rafaels kod, förstå den. Fråga...
}




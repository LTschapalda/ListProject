package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Variablen
        int testID = 678939399;

        //Objekte von Studenten erstellen

        Student firstStudent = new Student("Peter", "Maffay", 678939399);
        Student secondStudent = new Student("Mark", "Foster", 870709809);
        Student thirdStudent = new Student("Herbert", "Grönemeyer", 870709800);

        //Liste von Studenten Anlegen

        List<Student> student = new ArrayList<>();

        //Liste mit Studenten befüllen

        student.add(firstStudent);
        student.add(secondStudent);
        student.add(thirdStudent);

        //Liste von Studenten ausgeben

        for ( int i = 0; i < student.size(); i++) {
            Student iStudent = student.get(i);
            System.out.println("Student " + (i+1) + ": " + iStudent.name + iStudent.surname);
            System.out.println("Matrikelnummer: " +iStudent.matriculationNumber);
            System.out.println("_________________________________________");
        }


        //Schule erstellen
        School schoolOfRock = new School();

        //Schüler hinzufügen zur Schule

        schoolOfRock.addStudent(firstStudent);

        //Welche Schüler sind auf der schoolOfRock?

        System.out.println("Schüler der School of Rock: ");
        schoolOfRock.showListOfStudents();

        schoolOfRock.checkIfIsStudentAtThisSchool(678939399);
    }
}
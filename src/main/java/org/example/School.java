package org.example;

import java.util.ArrayList;
import java.util.List;

public class School {

    //Liste in welche die Schüler hinzugefügt werden
    List<Student> studentList = new ArrayList<>();

    //Lege eine Klasse "School" an, zu der man Students über eine Methode hinzufügen kann ('addStudent').
    void addStudent(Student student) {
        studentList.add(student);
    }

    //Schritt 6: Erstelle eine Methode, um eine*n Student aus der Schule zu entfernen.
    void removeStudent(Student student) {
        studentList.remove(student);
    }


    //Implementiere eine Methode, um alle Students der Schule auszugeben (als Text, auf die Console).
     void showListOfStudents() {
        for ( int i = 0; i < studentList.size(); i++) {
            Student iStudent = studentList.get(i);
            System.out.println("Student " + (i+1) + ": " + iStudent.name + iStudent.surname);
            System.out.println("Matrikelnummer: " +iStudent.matriculationNumber);
            System.out.println("_________________________________________");
        }
    }

    //Füge eine Methode hinzu, um eine*n Student anhand der id zu finden. DerDie gefundene Stundent soll returned werden.
    void checkIfIsStudentAtThisSchool (int givenID){
        for ( int i = 0; i < studentList.size(); i++) {
               Student iStudent = studentList.get(i);
               if (givenID == iStudent.matriculationNumber) {
                   System.out.println("Der Student geht auf diese Schule und heißt: " + iStudent.name + iStudent.surname);
               } else {
                   System.out.println("Der Student geht nicht auf diese Schule");
               }

        }
        System.out.println("__________________________");
    }
}

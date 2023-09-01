package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student extends School {

    //Variablen

    String name;
    String surname;
    int matriculationNumber;

    //Constructor
    public Student(String name, String surname, int matriculationNumber) {
        this.name = name;
        this.surname = surname;
        this.matriculationNumber = matriculationNumber;
    }
}

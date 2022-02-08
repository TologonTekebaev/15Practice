package com.company;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
       // Pupil pupil = new Pupil("Tologon", LocalDate.of(1996, 03,16));
       // System.out.println(pupil);

        Mentors mentors = new Mentors("Beka", (byte) 20, "java", "Талас");
        Student student = new Student("Tologon", " Peaksot", (byte) 25, "java");
        Instructors instructors = new Instructors("Mухаммед", " java", (byte) 24, "Peaksoft");

        System.out.println(mentors);
        System.out.println(student);
        System.out.println(instructors);
    }
}

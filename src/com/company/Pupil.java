package com.company;

import java.time.LocalDate;

public class Pupil {
    private String name;
    private LocalDate dateOfbirth;
    private byte age;

    public Pupil() {
    }

    public Pupil(String name, LocalDate dateOfbirth, byte age) {
        this.name = name;
        this.dateOfbirth = dateOfbirth;
        this.age = (byte) (LocalDate.now().getYear() - dateOfbirth.getYear());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfbirth() {
        return dateOfbirth;
    }

    public void setDateOfbirth(LocalDate dateOfbirth) {
        this.dateOfbirth = dateOfbirth;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "name='" + name + '\'' +
                ", dateOfbirth=" + dateOfbirth +
                ", age=" + age +
                '}';
    }
}


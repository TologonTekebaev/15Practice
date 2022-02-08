package com.company;

public class Instructors extends Pupil {
    private String name;
    private String course;
    private byte age;
    private String work;

    public Instructors(){

    }

    public Instructors(String name, String course, byte age, String work) {
        this.name = name;
        this.course = course;
        this.age = age;
        this.work = work;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getCountry() {
        return work;
    }

    public void setCountry(String country) {
        this.work = country;
    }

    @Override
    public String toString() {
        return "Instructors{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", age=" + age +
                ", country='" + work + '\'' +
                '}';
    }
}

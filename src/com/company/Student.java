package com.company;

public class Student extends Pupil {
    private String name;
    private String university;
    private byte age;
    private String course;

    public Student(){

    }

    public Student(String name, String university, byte age, String course) {
        this.name = name;
        this.university = university;
        this.age = age;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", university='" + university + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                '}';
    }
}

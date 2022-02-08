package com.company;

import jdk.jshell.spi.SPIResolutionException;

public class Mentors extends Pupil{
        private String name;
        private byte age;
        private String course;
        private String country;

        public Mentors(){

        }

        public Mentors(String name, byte age, String course, String country) {
                this.name = name;
                this.age = age;
                this.course = course;
                this.country = country;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
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

        public String getCountry() {
                return country;
        }

        public void setCountry(String country) {
                this.country = country;
        }

        @Override
        public String toString() {
                return "Mentors{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        ", course='" + course + '\'' +
                        ", country='" + country + '\'' +
                        '}';
        }
}

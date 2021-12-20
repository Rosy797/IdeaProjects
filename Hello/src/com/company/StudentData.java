package com.company;

class StudentRecord extends Course
        {

 void studentData()
        {
        Student student = new Student(1, "Rosy", "btech");

        System.out.println("RollNo: "+student.getRollNo());
        System.out.println("Name: "+student.getName());
        System.out.println("Class Name: "+student.getClassName());
        }
        }

package com.company;

public class Student extends MyClassPerson {
    int course = 1;
    public Student(int a, String n, int course){
        super(a,n);
        this.course = course;

    }
    void tell(){
        System.out.println(super.fname);
        System.out.println(super.lname);
        System.out.println(super.age);
        System.out.println(course);

    }

    public static void main(String[] args) {
        Student loveman = new Student(42, "Malachi", 4);
        loveman.tell();
    }
}

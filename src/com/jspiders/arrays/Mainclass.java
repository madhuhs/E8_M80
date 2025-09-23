package com.jspiders.arrays;

//DTO(Data Transfer Object)
class Student {
    private String name;
    private int marks;
    private int rollNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
public class Mainclass {
    public static void main(String[] args) {
        System.out.println("Program starts...");
        Student[] students = new Student[4];

        Student s1 = new Student();
        s1.setName("S1");
        s1.setMarks(50);
        s1.setRollNo(1);

        students[0] = s1;

        students[1] = new Student();
        students[1].setName("S2");
        students[1].setMarks(50);
        students[1].setRollNo(2);

        System.out.println(students);

        System.out.println("Name  : "+students[0].getName());
        System.out.println("Marks : "+students[0].getMarks());
        System.out.println("Roll No :"+students[0].getRollNo());


        System.out.println("Program ends...");
    }
}

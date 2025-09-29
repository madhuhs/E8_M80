//package com.jspiders.arrays;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
////DTO(Data Transfer Object)
//class Student {
//    private String name;
//    private int marks;
//    private int rollNo;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getMarks() {
//        return marks;
//    }
//
//    public void setMarks(int marks) {
//        this.marks = marks;
//    }
//
//    public int getRollNo() {
//        return rollNo;
//    }
//
//    public void setRollNo(int rollNo) {
//        this.rollNo = rollNo;
//    }
//}
//public class Mainclass {
//    public static void main(String[] args) {
//        System.out.println("Program starts...");
////        Student[] students = new Student[4];
////
////        Student s1 = new Student();
////        s1.setName("S1");
////        s1.setMarks(50);
////        s1.setRollNo(1);
////
////        students[0] = s1;
////
////        students[1] = new Student();
////        students[1].setName("S2");
////        students[1].setMarks(50);
////        students[1].setRollNo(2);
////
////        System.out.println(students);
////
////        System.out.println("Name  : "+students[0].getName());
////        System.out.println("Marks : "+students[0].getMarks());
////        System.out.println("Roll No :"+students[0].getRollNo());
//
//         StudentService sv = new StudentService();
//        Student s1 = new Student();
//        Scanner  sc = new Scanner(System.in);
//        System.out.println("Enter student name:");
//        s1.setName(sc.next());
//        s1.setMarks(50);
//        s1.setRollNo(1);
//
//       // sv.addStudent(s1);
//        sv.getStudent(0);
//
//
//
//        System.out.println("Program ends...");
//    }
//}
//
//class StudentService
//{
//    private Student[] students = new Student[5];
//    private int currentIndex = 0;
//
//    public void addStudent(Student student){
//        if(currentIndex<=students.length-1){
//            students[currentIndex] = student;
//            currentIndex++;
//            System.out.println("Student added");
//        }
//        else
//        {
//            System.out.println("Array is full cannot add any other student");
//        }
//    }
//
//    //prints the student data in given index
//    public void getStudent(int index){
//        if(index >= 0 && index<=students.length-1
//                && students[index]!=null){
//            System.out.println("Name  : "+students[index].getName());
//        System.out.println("Marks : "+students[index].getMarks());
//        System.out.println("Roll No :"+students[index].getRollNo());
//        }
//        else {
//            System.out.println("Invalid index");
//        }
//    }
//
//    public void updateStudentName(int index,String newName){
//        if(index >=0 && index<=students.length-1 && students[index]!=null ) {
//            students[index].setName(newName);
//        }
//    }
//
//    public void deleteStudent(int index){
//        if(index >=0 && index<=students.length-1){
//            students[index]=null;
//        }
//    }
//}
//
//class StudentService2
//{
//    private ArrayList<Student> a1 = new ArrayList<Student>();
//
//    public void addStudent(Student student){
//            a1.add(student); //students[currentIndex] = student;
//            System.out.println("Student added");
//
//    }
//
//    //prints the student data in given index
//    public void getStudent(int index){
//        if(index >= 0 && index<=students.length-1
//                && students[index]!=null){
//            System.out.println("Name  : "+students[index].getName());
//            System.out.println("Marks : "+students[index].getMarks());
//            System.out.println("Roll No :"+students[index].getRollNo());
//        }
//        else {
//            System.out.println("Invalid index");
//        }
//    }
//
//    public void updateStudentName(int index,String newName){
//        if(index >=0 && index<=students.length-1 && students[index]!=null ) {
//            students[index].setName(newName);
//        }
//    }
//
//    public void deleteStudent(int index){
//        if(index >=0 && index<=students.length-1){
//            students[index]=null;
//        }
//    }
//}
//
//

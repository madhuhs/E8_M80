package com.jspiders.object;



class User extends Object
{
    private int userId;
    private String name;
    private int age;
    private String email;
    private long phone;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        return this.userId;
    }

    @Override
    public String toString() {
        return "Name : "+this.name + " Age : "+this.age;
   }

    @Override
    public boolean equals(Object obj) {
        User ref = (User) obj;
        if(ref.userId==this.userId){
            return true;
        }
        else{
            return false;
        }
    }
}
public class Mainclass3 {
    public static void main(String[] args) {
        System.out.println("Program starts...");
        User u1 = new User();
        u1.setUserId(1);
        u1.setName("virat");
        User u2 = new User();
        u2.setUserId(2);
        u2.setName("virat");
        int h1 = u1.hashCode();
        System.out.println("h1 : "+h1);
        System.out.println(u1);
        boolean res = u1.equals(u2);
        System.out.println(res);
        System.out.println("Program ends...");
    }
}
package crudProject.model;

import java.util.Objects;

public class User {
    private  String name;
    private int age;
    private Gender gender;
    private String phoneNumber;

    public User(String name, int age, Gender gender, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }
    public User(){
    }

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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return String.format("""
                name = %s
                age = %d
                gender = %s
                phone-number = %s""",name,age,gender,phoneNumber);
    }



}

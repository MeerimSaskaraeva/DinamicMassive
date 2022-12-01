package java8.classes;

import java8.enums.Gender;
import java8.exception.MyException;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class Student {
    private String name;
    private int age;
    private Gender gender;
    private LocalDate dataOfBirth;

    public Student(){}

    public Student(String name, int age, Gender gender, LocalDate dataOfBirth) throws MyException {
        nameIsNull(name);
        negativeAge(age);
        uncorrectDateOfBirds(dataOfBirth);
        genderNotCorrect(gender);
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

    public LocalDate getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(LocalDate dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dataOfBirth=" + dataOfBirth +
                '}';
    }
    private void uncorrectDateOfBirds(LocalDate dataOfBirth)throws MyException{
        LocalDate now=LocalDate.now();
        int date=now.compareTo(dataOfBirth);
        if (date<0){
            System.out.println("Date of birth not correct");
        }else {
            this.dataOfBirth=dataOfBirth;
        }


    }
    private void negativeAge(int age)throws MyException{
        if (age<0){
            System.out.println("Age can't be negative number");
        }else {
            this.age=age;
        }

    }
    private void nameIsNull(String name){
        if (name.isEmpty()){
            System.out.println("Name can't be empty");
        }else {
            this.name=name;
        }

    }
    private void genderNotCorrect(Gender gender){

        if (!gender.getDeclaringClass().isEnum()){
            System.out.println("Please choose gender");
        }else {
            this.gender=gender;
        }

    }

}

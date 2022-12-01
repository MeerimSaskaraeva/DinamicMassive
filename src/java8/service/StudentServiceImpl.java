package java8.service;

import java8.classes.Student;
import java8.enums.Gender;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService{
    @Override
    public ArrayList<Integer> getAllStudentAge(List<Student> students) {
        ArrayList<Integer> allName=new ArrayList<>();
        for (Student student : students) {
            allName.add(student.getAge());
        }
        return allName;

    }

    @Override
    public ArrayList<Student> getAllBoy(List<Student> students) {
        ArrayList<Student>male=new ArrayList<>();
        for (Student student : students) {
            if (student.getGender().equals(Gender.MALE)){
            male.add(student);

            }

    }
        return male;
    }

    @Override
    public ArrayList<Student> getAllGirl(List<Student> students) {
        ArrayList<Student>female=new ArrayList<>();
        for (Student student : students) {
            if (student.getGender().equals(Gender.FEMALE)){
                female.add(student);

            }

        }
        return female;
    }
}

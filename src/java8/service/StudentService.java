package java8.service;

import java8.classes.Student;

import java.util.ArrayList;
import java.util.List;

public interface StudentService {

     ArrayList<Integer> getAllStudentAge (List<Student>students);
     ArrayList<Student> getAllBoy(List<Student>students);
     ArrayList<Student> getAllGirl(List<Student>students);




}

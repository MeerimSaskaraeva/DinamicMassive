import java8.classes.Student;
import java8.enums.Gender;
import java8.exception.MyException;
import java8.service.StudentServiceImpl;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) throws MyException,InputMismatchException{
//       ArrayList<String> array = new ArrayList<>(Arrays.asList("hdgfjd","jdjs","hdhs"));
////        array.add("Java");
////        array.add("Js");
////        array.add("English");
////        array.add("Russian");
////        System.out.println(array);
////        Collections.sort(array);
////        System.out.println(array);
//        Scanner sc=new Scanner(System.in);
//        Integer n= sc.nextInt();
//        ArrayList<Integer>number=new ArrayList<>(Arrays.asList(2,3,4,5,6,7,5,3,2,9,3));
//        System.out.println(number.contains(n));
//
//
//        //System.out.println(number);
//        //getNum(number);
//        //findElement(n,number);
//
//    }
//    public static void findElement(Integer n,List<Integer>num){
//            System.out.println(num);
//
//    }
//    public static void getNum(List<Integer>num){
//        for (int i = 0; i < num.size() ; i++) {
//            if (num.get(i)%2 !=0){
//                num.remove(i);
//            }// with iterator Homework
//
//        }
//        System.out.println(num);
//   }

        try {
        Scanner sc=new Scanner(System.in);
            ArrayList<Student>students=new ArrayList<>();

        students.add(new Student("Asel",23, Gender.FEMALE, LocalDate.of(2000,4,6)));
        students.add(new Student("Ulan",32, Gender.MALE, LocalDate.of(1991,4,6)));
        students.add(new Student("Esen",27, Gender.MALE, LocalDate.of(1995,4,6)));
        students.add(new Student("Sara",20, Gender.FEMALE, LocalDate.of(2001,4,6)));
        students.add(new Student("Vika",23, Gender.FEMALE, LocalDate.of(1999,4,6)));

        StudentServiceImpl service=new StudentServiceImpl();
        Student student=new Student();

        System.out.println("Choose method from 1 to 3");

        int num= sc.nextInt();

            switch (num){
                case 1 : System.out.println(service.getAllStudentAge(students));break;
                case 2 : System.out.println(service.getAllBoy(students));break;
                case 3 : System.out.println(service.getAllGirl(students));}


        }catch (NullPointerException e){
            System.out.println("Cannot invoke \"String.isEmpty()\" because \"name\" or \"gender\" is null");
        }catch (IllegalArgumentException e){
            e.printStackTrace();

        }
    }
}
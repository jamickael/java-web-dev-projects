package org.example;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        HashMap<String, Integer> students = new HashMap<>();
        System.out.println("Lets add some students to our roster. When you are done, hit ENTER.");
        String newStudent;
        do {
            System.out.println("What is the name of the student you would like to add to the system?");
            newStudent = input.nextLine();
            if (!newStudent.equals("")){
                System.out.println("What is their ID number?");
                int newId = input.nextInt();
                students.put(newStudent, newId);

                input.nextLine();
            }

        } while (!newStudent.equals(""));

        input.close();

        for(Map.Entry<String, Integer> student : students.entrySet()){
            System.out.println(student.getKey()+" ID number is: "+student.getValue());
        }

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo_spr_22_fri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StudentList {
    
    private static String[] studentFirstNames = {"Richard", "Mike", "Ben", "Barry"};
    private static String[] studentLastNames = {"Long", "Hawk", "Dover", "Mckockiner"};
    
    public static void main(String[] args) {
        Collections.shuffle(Arrays.asList(studentFirstNames));
        Collections.shuffle(Arrays.asList(studentLastNames));
        ArrayList<Student> studentList = new ArrayList<Student>();
        for(int i = 0; i < studentFirstNames.length; i++) {
            try {
                Student s = new Student(i, studentFirstNames[i] + " " + studentLastNames[i]);
            } catch(Exception e) {
                break;
            }
        }
        
    }
}

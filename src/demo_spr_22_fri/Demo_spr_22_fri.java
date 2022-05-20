/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo_spr_22_fri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Nathan
 */
public class Demo_spr_22_fri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a word> ");
        String word = input.nextLine();
        
        ArrayList<String> chars = new ArrayList<>(Arrays.asList(word.split("")));
        Collections.reverse(chars);
        
        System.out.println(String.join("", chars));
        
        input.close();
    }
    
}

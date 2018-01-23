/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author er1001800
 */
 import java.util.*;

public class C7_26 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter list 1:  ");
        
        int list1[] = new int[input.nextInt()];
        for(int i = 0; i < list1.length; i++){
            list1[i] = input.nextInt();
        }
        
        System.out.print("Enter list 2:  ");
        
        int list2[] = new int[input.nextInt()];
        for(int i = 0; i < list2.length; i++){
            list2[i] = input.nextInt();
        }
        
        if (Arrays.equals(list1, list2)) {
            System.out.println("The two lists are strictly identical");
        }
        else {
            System.out.println("The two lists are not strictly identical"); 
        }
    }        
}

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

public class C7_1 {

    public static void main(String[] args) {
        
                Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students:\t");
        int numbers[] = new int[input.nextInt()];

        System.out.printf("Enter %2d scores\t", numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        
        int best = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > best)
            best = numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Student " + i + " score is " + numbers[i] + " and the grade is " + grade(numbers[i], best));
        }

    }

    public static char grade(int numbers, int best) {

        if (numbers >= (best - 10)) {
            return 'A';
        } else if (numbers >= (best - 20)) {
            return 'B';
        } else if (numbers >= (best - 30)) {
            return 'C';
        } else if (numbers >= (best - 40)) {
            return 'D';
        } else {
            return 'F';
        }
    }
}


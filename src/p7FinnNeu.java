import java.util.Scanner;
import java.util.*;
public class p7FinnNeu {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the number of elements: ");
         int total = input.nextInt();
         int array[] = new int[total];
         
     
         fillArray(array, input);
         averageArray(array, total);
         displayArray(array);
     }
            public static void fillArray(int [] array, Scanner input){
            for( int counter = 0; counter < array.length; counter++){
            array[counter] = input.nextInt();
         }
        }
          public static void displayArray(int [] array){
               System.out.print("The elements of the Array are : " + Arrays.toString(array));
          }
          public static void averageArray(int [] array, int total){
              int sum = 0;
              for( int counter = 0; counter < array.length; counter++){
                  sum += array[counter];
              }
              double average = sum / total;
              System.out.print("The average is : " + average);
          }
        }


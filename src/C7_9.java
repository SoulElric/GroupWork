/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author as0996497
 */
import java.util.Scanner;
 
 
public class C7_9 {
 
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  System.out.print("Enter ten numbers:");
  Scanner input = new Scanner(System.in);
  double[] numbers = new double[10];
 
  for (int i = 0; i < numbers.length; i++) {
   numbers[i] = input.nextDouble();
  }
 
  System.out.println("The minimum number is: " + min(numbers));
 }
 
 public static double min(double[] array) {
 
  double min = array[0];
 
  for (int i = 1; i < array.length; i++) {
   if (min > array[i]) {
    min = array[i];
   }
  }
 
  return min;
 
 }
}
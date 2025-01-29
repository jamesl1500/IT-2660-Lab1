//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: 
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    Lab1 lab = new Lab1();

    System.out.println(lab.increment(1));

    int[] arr = {1, 2, 3, 4, 5};

    // Output array in order using while loop
    int i = 0;
    while (i < arr.length) {
      System.out.print(arr[i] + " ");
      i++;
    }
    System.out.println();
    // Output array in reverse order using for loop
    for (int j = arr.length - 1; j >= 0; j--) {
      System.out.print(arr[j] + " ");
    }

    // Output first and last elements of the array
    System.out.println("\nFirst element: " + arr[0]);
    System.out.println("Last element: " + arr[arr.length - 1]);

    System.out.print(lab.max(1, 2));
    System.err.println();

     // Output the minimum of two numbers
    System.out.print(lab.min(1, 2));
    System.err.println();

    // Output the sum of the array
    System.out.print(lab.sum(arr));
    System.err.println();

    // Output the average of the array
    System.out.print(lab.average(arr));
    System.err.println();

    // Output the maximum value in the array
    System.out.print(lab.max(arr));
    System.err.println();

    // Output the minimum value in the array
    System.out.print(lab.min(arr));
    System.err.println();
  }
}     

// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }

  public int max(int a, int b) {
    return (a > b) ? a : b;
  }

  public int min(int a, int b) {
    return (a < b) ? a : b;
  }

  public int sum(int[] arr) {
    int sum = 0;
    for (int num : arr) {
      sum += num;
    }
    return sum;
  }

  public double average(int[] arr) {
    int sum = sum(arr);
    return (double) sum / arr.length;
  }

  public int max(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }

  public int min(int[] arr) {
    int min = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    return min;
  }
}
package com.acte.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysEx {
int age=45;
	public static void main(String[] args) {
  // arrays able to store multiple values 
 // those values shoud be same data type		
		// npd
		//class array
    int values[]= {4,8,9,6,4,8,7,5,9,10};
    // reverse an array
    // create an array with size of input given by user
    // you need to fill the array of input given by the user
    // you need to create array with different data types
    
      for(int i=0;i<5;i++) {
    	  System.out.println(values[i]);
      }
        System.out.println(values.length);
    System.out.println("-------------------------");
    String arr[]=new String[5];
    arr[0]="789";
    arr[1]="458";
    arr[2]="999";
    arr[3]="874";
    arr[4]="784";
    arr[5]="784";
    for(int i=0;i<arr.length;i++) {
    	System.out.println(arr[i]);
    }
 //exception collections multithreading java8     
	}

}

package array_program_19_12;

import java.util.Random;
import java.util.Scanner;

public class Random_numbers {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of elements:");
		int num=sc.nextInt();	
		
		Random rand =new Random();
		
		int arr[]=new int[num];
       for(int i=0;i<num;i++)
       {
    	  arr[i]=rand.nextInt(101);
       }
       for(int i=0;i<num;i++)
       {
    	   System.out.println(arr[i]);
       }
       
	
	}

}

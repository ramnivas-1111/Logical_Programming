package array_program_19_12;

import java.util.Scanner;

public class Reverse_Order {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of elements:");
		int num=sc.nextInt();	
		
		int arr[]=new int[num];
		System.out.println("Enter the Elements");
       for(int i=0;i<num;i++)
       {
    	    arr[i]=sc.nextInt();
       }
       for(int i=num-1;i>=0;i--)
       {
    	 System.out.println(arr[i]);  
       }
	}

}

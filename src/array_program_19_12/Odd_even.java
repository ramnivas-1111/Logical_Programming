package array_program_19_12;

import java.util.Scanner;

public class Odd_even {

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
		
       System.out.println("Even numbers:");
       for(int i=0;i<num;i++)
       {
    	 if(arr[i]%2==0)
    	 {
    		System.out.println(arr[i]); 
    	 }
       }
       
       System.out.println("Odd numbers:");
    	 for(int i=0;i<num;i++)
         {
      	 if(arr[i]%2!=0)
      	 {
      		System.out.println(arr[i]); 
      	 
         }
       }
	}

}

package array_program_19_12;

import java.util.Scanner;

public class Average_array {

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
       int sum=0;
       for(int i=0;i<num;i++)
       {
    	   sum=sum+arr[i];
       }
       System.out.println("The Average of elements:"+sum/num);
	}

}

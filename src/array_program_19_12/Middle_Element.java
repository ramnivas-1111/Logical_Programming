package array_program_19_12;

import java.util.Scanner;

public class Middle_Element {
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
       
       if(num%2==1)
       {
    	   System.out.println("Middle element: "+arr[num/2]);
       }
       if(num%2==0)
       {
    	   System.out.println("Middle elements: "+arr[(num/2)-1]+" "+ arr[num / 2]);
       }
      
	}
}

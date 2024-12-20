package array_program_19_12;

import java.util.Scanner;

public class StoreArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of the array:");
		int num=sc.nextInt();
		
		int arr[]=new int[num];
		System.out.println("Enter the elements:");
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();	
		}
		for(int i=0;i<num;i++)
		{
			System.out.println("Element at index "+i+ " :"+arr[i]);
		}
		
    sc.close();	}

}

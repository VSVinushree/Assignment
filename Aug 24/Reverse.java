package robosoft;
import java.util.*;
public class Reverse {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		   System.out.println("enter the size of array");
		   int n=sc.nextInt();
		   int [] array=new int[n];
		   System.out.println("enter the elements");
		   for(int i=0;i<n;i++)
		   {
			   array[i]=sc.nextInt();
		   }
		   for (int i=n-1;i>=0;i--)
		   {
			System.out.println(array[i]);   
		   }
		   
		
		
	} 

 }

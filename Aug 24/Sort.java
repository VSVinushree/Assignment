package robosoft;
import java.util.*;
public class Sort {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int [] array=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		Arrays.sort(array);
		System.out.println("Elements of array are sorted in ascending order");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}

}

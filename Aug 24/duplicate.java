package robosoft;
import java.util.*;
public class duplicate{  
        public static void main(String[] args) {
        	int n;
          Scanner sc=new Scanner(System.in);
          n=sc.nextInt();
                System.out.println("Enter the array");
                String array[]=new String[n];
                for (int i = 0; i < array.length; i++)
                {
                array[i]=sc.next();	
                }
                
                for (int i = 0; i < array.length; i++)
                {
                        for (int j = i+1; j < array.length; j++)
                        {
                                if( (array[i].equals(array[j])) && (i != j) )
                                {
                                        System.out.println("\nDuplicate Element is : "+array[j]);
                                }
                        }
                }
        }    
}

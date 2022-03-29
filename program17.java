package myjava1;
import java.util.Scanner;
public class program17 {
	   
       public static void main(String args[]) {
    	   System.out.println("enter number : ");

    	   Scanner sc =new Scanner(System.in);
    	   int x =sc.nextInt();
    	  
      	   System.out.println(++x + " " + x++);
      	   sc.close();
       }
}

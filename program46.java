package myjava1;
import java.util.Scanner;

public class program46 {  
  public static void main(String args[])  {  
   Scanner in =new Scanner(System.in);
   System.out.println("enter the number : ");
   int n = in.nextInt();
   int reverse = 0,rem;
   while(n!=0)
   {
	   rem = n%10;
	   reverse = (reverse*10)+rem;
	   n= n/10;
   }
   System.out.println("reversed number : "+reverse);
   in.close();
}}
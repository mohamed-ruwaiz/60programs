package myjava1;

import java.util.Scanner;

public class vowel {
       public static void main(String args[]) {
    	   char c;
    	   System.out.println("enter the character : ");
    	   Scanner in = new Scanner (System.in);
    	   c=in.next().charAt(0);
    	   
    	   switch (c)
    	   {
    	   case 'a':
    	   case 'e':
    	   case 'i' :
    	   case 'o' :
    	   case 'u' :
    	   case 'A' :
    	   case 'E' :
    	   case 'I' :
    	   case 'O' :
    	   case 'U' :
    		   System.out.println(c + " is a vowels ");
    		   break;
    		  default:
    			  System.out.println( c + " is a constant");
    			  break;
    			  
    	   }
    	   in.close();
       }
       
}

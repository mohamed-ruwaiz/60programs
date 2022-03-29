package myjava1;
import java.util.*;
public class program37alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.print(" enter a char : ");
     Scanner sc = new Scanner(System.in);
     char ch=sc.next().charAt(0);
     
     if ((ch>= 'a' && ch <='z') || (ch>='A' && ch <='Z')) {
    	 System.out.println( ch +" is an alphabet");
     }
     else {
    	 System.out.println( ch + "is not an alphabet");
     }
     sc.close();
	}

}

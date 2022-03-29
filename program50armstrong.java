package myjava1;
import java.util.Scanner;
public class program50armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in = new Scanner(System.in);
    System.out.println("enter the number : ");
    int number = in.nextInt();
    int temp = number;
    int digit1,digit2,digit3;
    
    digit3=temp%10;
    temp=temp/10;
    
    digit2=temp%10;
    temp=temp/10;
    
    digit1=temp%10;
    
    int result=(digit1 * digit1 *digit1)+ (digit2*digit2*digit2)+(digit3*digit3*digit3);
    
    if (number==result) {
    	System.out.println(number + " is armstrong number");
    }else {
    	System.out.println(number + " is not a armstrong number");
    }
    in.close();
	}

}

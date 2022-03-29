package myjava1;
import java.util.Scanner;
public class program36 {

	static String checkPosNeg(int x)
	{

		if (x > 0)
			return "Positive";

		else if (x < 0)
			return "Negative";

		else
			return "zero";
	}
	public static void main(String[] args)
	{
		int i;
		System.out.println("enter the number : ");
		Scanner in = new Scanner(System.in);
		i=in.nextInt();
		System.out.println( i + " is " + checkPosNeg(i));
		in.close();
	}
}

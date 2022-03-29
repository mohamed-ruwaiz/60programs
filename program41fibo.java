package myjava1;
import java.util.Scanner;
public class program41fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in = new Scanner(System.in);
    System.out.println("enter the number : ");
    int n = in.nextInt();
    int a=-1,b=1,c;
    for ( int i=0;i<=n;i++) {
    	c=a+b;
    	System.out.println(c);
    	a=b;
    	b=c;
    }
    in.close();
	}

}

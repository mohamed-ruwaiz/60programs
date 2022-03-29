package myjava1;
import java.util.Scanner;
public class program16concir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner (System.in);
    	 System.out.println("enter the radius of the outer circle : ");
    	 double rad1 = sc.nextDouble();
    	 System.out.println("enter the radius of outer circle : ");
    	 double rad2=sc.nextDouble();
    	 double area =3.14*(rad1*rad1-rad2*rad2);
    	 System.out.println(area);
    	 sc.close();
     }
	}



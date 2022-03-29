package myjava1;

import java.util.Scanner;

public class program14cylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner (System.in);
    float rad =sc.nextInt();
    float height = sc.nextInt();
    float area =2.0f*3.14f*rad*(rad+height);
    System.out.println(area);
    sc.close();
	}

}

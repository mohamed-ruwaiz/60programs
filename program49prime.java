package myjava1;

import java.util.Scanner;

public class program49prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        if(n==1)
        {
            System.out.println("1 is neither prime nor composite");
            return;
        }
         else
        {
            for(i=2;i<=n/2;i++)
            {
                if(n%i==0)
                {
                    System.out.println(n+" is not a Prime Number");
                    return;
                }
            }
        }
            System.out.println(n+" is a Prime Number");
            
    }

			}



package myjava1;

import java.util.Scanner;

public class project38sumnatural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner sc= new Scanner(System.in);
		        int i,n,sum=0;
		        System.out.println("Enter the no. of natural numbers : ");
		        n=sc.nextInt();
		        for(i=1;i<=n;i++)
		        {
		            sum=sum+i;
		        }
		        
		        System.out.print(sum);
		        sc.close();
		    }
	
	}



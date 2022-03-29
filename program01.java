package myjava1;
import java.util.Scanner;
public class program01 {
    public static void main(String arg[]) {
        System.out.println("enter your phone number (valid in india):");
        Scanner sc =new Scanner(System.in);
        String pn = sc.nextLine();
        System.out.println(" +91 " + pn);
        sc.close();
}
}
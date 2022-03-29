package myjava1;

public class StringB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     StringBuilder a = new StringBuilder("ruwaiz");
     System.out.println(a);
     StringBuilder c = new StringBuilder("boxer");


     StringBuilder b = new StringBuilder();
    

     for (int i=c.length()-1;i>=0;i--) {
    	 b.append(c.charAt(i));
     }
     System.out.println(b);
	}

}

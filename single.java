package myjava1;

class father 
{
	public void house()
	{
		System.out.println( "have own a house");
	}
}
class son extends father
{
	public void bike()
	{
		System.out.println("have own fz bike");
	}
}
public class single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     son o = new son();
     o.bike();
     o.house();
	}

}

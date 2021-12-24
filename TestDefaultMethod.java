
interface Java8A 
{

	default void display() {
		System.out.println("Interface Java8A...");
	}
}


interface Java8B
{
	default void display() {
		System.out.println("Interface Java8B...");
	}
}

class Testing implements Java8A//, Java8B
{

	/*@Override
	public void display() 
	{
		System.out.println("Class Testing display 1...");
		//Java8A.super.display();
	}*/
	
}


public class TestDefaultMethod
{
	public static void main(String args[])
	{
		Testing t = new Testing();
		t.display();
	}
}
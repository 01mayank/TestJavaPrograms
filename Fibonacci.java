
public class Fibonacci 
{
	
	int n1=0, n2=1, n3;
	
	void printFibonacci(int count) {
		
		if(count > 0) {
			n3 = n1 + n2;
			
			n1 = n2;
			n2 = n3;
			
			System.out.print(n3 + " ");
			printFibonacci(--count);
		}
	}
	
	
	public static void main(String args[])
	{
		int count = 15;
		Fibonacci fb = new Fibonacci();
		System.out.print(fb.n1 + " " + fb.n2 +" " );
		fb.printFibonacci(count - 2);
	}
}

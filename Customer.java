
public class Customer 
{
	private String name;
	
	public Customer(String name) {
		this.name=name;
	}
	
	public String getName() {
		String temp = this.name;
		this.name = "Sam";
		return temp;
	}
}

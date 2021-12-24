

//Enum in java, all constants are public static final internally
//Enum can be defined inside or outside class but not inside method
//Constructor and method can also be defined inside enum
//Enum implicitly extends java.lang.Enum
enum Days{
	Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}

public class EnumTest 
{
	public static void main (String args[]) {
		
		//Get enum constant
		System.out.println(Days.Monday);
		
		//Use enum values() method
		Days arr[] = Days.values();
		
		//Use enum ordinal() method
		for(Days day : arr) {
			System.out.println(day + " at index " + day.ordinal());
		}
		
		//Use enum valueof() method
		System.out.println(Days.valueOf("Tuesday"));
	}
}

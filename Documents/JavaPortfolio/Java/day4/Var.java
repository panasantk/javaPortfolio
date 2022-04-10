package day4;

public class Var {
	public static void main(String[] args) {
		String firstName;
		firstName = "John";
		
		System.out.println(firstName); // john
		System.out.println(firstName); // John
		System.out.println(firstName); // John
		
		// reassigning new value
		firstName = "Smith";
		System.out.println(firstName); // Smith
		
		firstName = "Alex";
		System.out.println(firstName); // Alex
		
		// We cannot declare variables with same name
		// String firstName;
		
		String lastName = "Doe";
		System.out.println(lastName); // Doe
		
		// We can declare multiple variables in the same statement.
		String address = "101 Main st", state = "VA", country = "USA";
		
		String address1 = "200 North St";
		String state1 = "MA";
		String country1 = "USA";
		System.out.println(address);
		System.out.println(state);
		System.out.println(country);
		System.out.println("address\tstate\tcountry");
		
	}

}

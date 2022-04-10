package day4;

public class Var2 {
	public static void main(String[] args) {
		String firstName = "John";
		String lastName = "Doe";
		
		System.out.println(firstName);
		System.out.println(lastName);
		
		System.out.println(firstName + " " + lastName);
		
		String fullName = "Full name:" + firstName + " " + lastName;
		System.out.println(fullName);
		
		firstName = "Ramesh";
		lastName = "Kanery";
		System.out.println(firstName + " " + lastName);
		
		fullName = firstName + " " + lastName;
		System.out.println(fullName);
		
	}

}

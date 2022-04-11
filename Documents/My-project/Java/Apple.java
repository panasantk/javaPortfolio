package day4;

public class FruitsFarmColors {
	public static void main(String[] args) {
		String apple = "Red";
		String banana = "Yellow";
		String orange = "Orange";
		String kiwi = "Green";
		String pear = "Light Yellow";
		
		System.out.println(apple); // Red
		System.out.println(banana);
		System.out.println(orange);
		System.out.println(kiwi);
		System.out.println(pear);
		
		// red, yellow,banana,orange
		String allFruits = apple + ", " + banana + ", " + orange + ", " + kiwi + ", " + pear;
		System.out.println("Fruits: " + allFruits);
	}

}

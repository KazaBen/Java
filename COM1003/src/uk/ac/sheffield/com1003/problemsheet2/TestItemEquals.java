package uk.ac.sheffield.com1003.problemsheet2;

public class TestItemEquals {

	public static void main(String[] args) {
		ItemByWeight w1 = new ItemByWeight("w", 5, 150);
		ItemByWeight w2 = new ItemByWeight("w", 5, 150);
		System.out.println(w1.equalsByWeight(w2));
		Item i1 = new Item("i",5);
		Item i2 = new Item("i",5);
		System.out.println(i1.equals(i2));
	}
}

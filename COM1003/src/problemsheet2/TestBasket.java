package problemsheet2;

public class TestBasket {
	public static void main(String args[]) {
		// Creating Item array which stores Item and ItemByWeight objects
		Item[] shopping = {
			new Item("baked beans", 0.3),
			new ItemByWeight("bananas", 0.4, 0.7),
			new Item("coke", 1),
			new ItemByWeight("berries", 0.5, 5),
		};
		// Creating Basket object with shopping parameter
		Basket basket = new Basket(shopping);
		
		// Printing out total price of shopping array
		System.out.println(basket.total());
	}
}
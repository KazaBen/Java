package uk.ac.sheffield.com1003.problemsheet2;

/** ItemByWeight.java
*
* Subclass of Item, where price is specified by unit weight
*
*/

public class ItemByWeight extends Item {
	public ItemByWeight(String n, double p, double w) {
		super(n, p);
		weight = w;
		}
		
	public double getPrice() {
		return weight*super.getPrice();
		}
	public double getWeight(){
		return weight;
	}
	public String toString() {
		return (getName() + " (" + weight + "kg @ "
		+ super.getPrice() + "ukp/kg) = ukp"
		+ getPrice());
		}
	public boolean equalsByWeight(ItemByWeight itemByWeight){
		if(!itemByWeight.equals(this)){
			return false;
		}else if(this.getClass() == itemByWeight.getClass() && this.getName() == itemByWeight.getName() && this.getPrice() == itemByWeight.getPrice()&& this.getWeight() == itemByWeight.getWeight()){
			return true;
		}else{
			return false;
		}
	}
	// instance field
	private double weight;
}

package properties;


public class Entry {

	Id id;
	Name name;
	Price price;
	
	public Entry (int id, String name, double price) {
		this.id = new Id(id);
		this.name = new Name(name);
		this.price = new Price(price);
	}
	
	public Id getId() {
		return this.id;
	}
	
	public Name getName() {
		return this.name;
	}
	
	public Price getPrice() {
		return this.price;
	}
}

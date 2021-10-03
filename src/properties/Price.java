package properties;

import java.util.Comparator;

public class Price extends Property<Double> {

	double price;
	
	public Price() {}
	
	public Price(double price) {
		this.price = price;
	}

	@Override
	public Double getValue() {
		return this.price;
	}


	@Override
	public int compare(Entry o1, Entry o2) {
		return Double.compare(o1.price.getValue(), o2.price.getValue());
	}

}

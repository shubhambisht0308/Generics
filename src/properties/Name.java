package properties;

import java.util.Comparator;

public class Name extends Property<String> implements Comparator<Entry> {

	String name;
	
	public Name() {}
	
	public Name(String name) {
		this.name = name;
	}

	@Override
	public String getValue() {
		return this.name;
	}

	@Override
	public int compare(Entry o1, Entry o2) {
		return o1.name.getValue().compareTo(o2.name.getValue());
	}

}

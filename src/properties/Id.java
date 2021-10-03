package properties;

import java.util.Comparator;

public class Id extends Property<Integer> {

	int id;
	
	public Id() {}
	
	public Id(int id) {
		this.id = id;
	}
	
	public Integer getValue() {
		return this.id;
	}

	@Override
	public int compare(Entry o1, Entry o2) {
		return o1.id.getValue() - o2.id.getValue();
	}

}

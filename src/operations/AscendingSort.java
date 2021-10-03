package operations;

import java.util.Comparator;
import java.util.List;

import properties.Entry;
import properties.Property;

public class AscendingSort<T> extends Operation {

	@Override
	public List<Entry> execute(List<Entry> dbEntries,List<Property> priority) {
		AscendingCustomComparator comparator = new AscendingCustomComparator();
		for (Property<T> p : priority) {
			comparator.addComparator(p);
		}
		dbEntries.sort(comparator);
		return dbEntries;
	}
}

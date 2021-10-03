package operations;

import java.util.Comparator;
import java.util.List;

import properties.Entry;
import properties.Property;

public class DescendingSort<T> extends Operation {

	@Override
	public List<Entry> execute(List<Entry> dbEntries, List<Property> priority) {
		DescendingCustomComparator comparator = new DescendingCustomComparator();
		for (Property<T> p : priority) {
			comparator.addComparator(p);
		}
		dbEntries.sort(comparator);
		return dbEntries;
	}
}

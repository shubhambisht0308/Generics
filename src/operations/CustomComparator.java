package operations;

import java.util.Comparator;

import properties.Entry;

public interface CustomComparator extends Comparator<Entry> {
	 void addComparator(Comparator<Entry> comparator);
}

package operations;

import java.util.Comparator;
import java.util.List;

import properties.Entry;
import properties.Property;

public abstract class Operation {

	abstract List<Entry> execute(List<Entry>  db, List<Property> priority);
}

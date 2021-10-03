package properties;

import java.util.Comparator;

public abstract class Property<T> implements Comparator<Entry> {
	abstract T getValue();
}

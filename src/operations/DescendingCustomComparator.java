package operations;

import java.util.*;
import properties.*;

public class DescendingCustomComparator implements  CustomComparator {
	
	List<Comparator<Entry>> comparatorList;
	int i = 0;
	
	public DescendingCustomComparator() {
		comparatorList = new ArrayList<>();
	}

	@Override
	public int compare(Entry o1, Entry o2) {	
		for(Comparator<Entry> c : comparatorList) { 
			int res = c.compare(o2, o1);
			if (res != 0) {
				return res;
			}
		}
		return 0;
	}
	
	public void addComparator(Comparator<Entry> comparator) {
		comparatorList.add(comparator);
	}
	
	
}

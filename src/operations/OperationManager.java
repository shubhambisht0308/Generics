package operations;

import java.util.List;

import dbQuerySystem.*;
import util.*;
import util.Utils.Properties;
import properties.*;

public class OperationManager {

	DB dbOject;
	
	public OperationManager(DB obj) {
		this.dbOject = obj;
	}
	
	public List<Entry> execute(Operation op, Integer columns)  {
        CustomComparator comparator = new CustomComparator();
        comparator.addComparator(new Price());
        
        List<Entry> sortedList = dbOject.getDB();
        sortedList.sort(comparator);
        
        return sortedList;
	}
}

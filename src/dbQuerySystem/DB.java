package dbQuerySystem;

import java.util.*;

import properties.Entry;

public class DB {
	
	List<Entry> list;
	UniqueRandomNumbers random;
	
	DB() {
		list = new ArrayList<>();
		random = new UniqueRandomNumbers();
	}

	public void addEntry(String name, double price) {
	    int id = random.getNumber();
		list.add(new Entry(id, name, price));
	}
	
	public List<Entry> getDB() {
		return new ArrayList<>(list);
	}
	
	public void printDB(List<Entry> l) {
		for (Entry  e : l) {
			System.out.println("ID : " + e.getId().getValue() + ", Name : " + e.getName().getValue() + ", Price : " + e.getPrice().getValue());
		}
		System.out.println();
	}
	

    class UniqueRandomNumbers {
    	
    	ArrayList<Integer> list ;
    	int idx;
    	
    	public UniqueRandomNumbers() {
    		list = new ArrayList<Integer>();
	        for (int i = 1; i < 100; i++) {
	            list.add(i);
	        }
	        Collections.shuffle(list);
	        idx  = 0;
		}

	    Integer getNumber() {
	        return list.get(idx++);
	    }
	}
}

import java.util.*;

public class ValueList<T> extends ArrayList<T> implements Comparable<T> {

	List<T> list;
	
	ValueList() {
		this.list = new ArrayList<>();
	}
	
	public boolean add(T val) {
		return list.add(val);
	}
	
	
	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	void sort() {
		list.sort(null);
	}
	
	void print() {
		for(T t : list) {
			System.out.print(t + " ");
		}
		
		System.out.println();
	}

}

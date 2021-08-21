import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ValueList<Integer> intList = new ValueList<>();
		ValueList<String> stringList = new ValueList<>();
		
		intList.add(12);
		intList.add(2);
		intList.add(31);
		intList.add(4);
		intList.add(7);
		
		stringList.add("jksds");
		stringList.add("sd");
		stringList.add("aw");
		stringList.add("grd");
		stringList.add("thg");
		stringList.add("abf");
		
//		Sort<Value> sortInt = new Sort<>(intList);
//		Sort<Value> sortString = new Sort<>(stringList);
//		
//		sortInt.sort();
//		sortString.sort();
		
		intList.sort();
		stringList.sort();
		
		intList.print();
		stringList.print();
	}
}

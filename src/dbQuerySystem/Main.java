package dbQuerySystem;

import java.util.ArrayList;
import java.util.List;

import util.*;

import operations.*;
import properties.Entry;

class UserEntry {
	String name;
	double price;
	
	public UserEntry(String name, double price) {
		this.name = name;
		this.price = price;
	}
}

public class Main {

	public static void main(String[] args) {
		DB dbObject = new DB();
		OperationManager operationManager = new OperationManager(dbObject);
		
		ArrayList<UserEntry> entryist = new ArrayList<>();
		
		entryist.add(new UserEntry("asdasd", 343.7));
		entryist.add(new UserEntry("sdsd", 2321.7));
		entryist.add(new UserEntry("agfgfsdasd", 33.7));
		entryist.add(new UserEntry("asdefwasdasd", 64.7));
		entryist.add(new UserEntry("adsg", 655.7));
		
		
		entryist.add(new UserEntry("gds", 89.7));
		entryist.add(new UserEntry("jyd", 365443.7));
		entryist.add(new UserEntry("cszsdw", 38743.7));
		entryist.add(new UserEntry("xxga", 344534.7));
		entryist.add(new UserEntry("jndf", 7866.7));
		
		entryist.add(new UserEntry("uyuy", 22.7));
		entryist.add(new UserEntry("ttyd", 1.7));
		entryist.add(new UserEntry("zfdss", 755.7));
		entryist.add(new UserEntry("mmfgv", 455.7));
		entryist.add(new UserEntry("fddf", 766.7));
		
		entryist.add(new UserEntry("yyds", 23.7));
		entryist.add(new UserEntry("aqdd", 6456.7));
		entryist.add(new UserEntry("nnfgg", 4532.7));
		entryist.add(new UserEntry("dfdg", 44.7));
		entryist.add(new UserEntry("nndsd", 544.7));
		
		for (UserEntry entry : entryist) {
			dbObject.addEntry(entry.name, entry.price);
		}
		
		Operation op1 = new AscendingSort();
		Operation op2 = new DescendingSort();
		
		List<Entry> list = operationManager.execute(op1, Utils.Properties.PRICE);
		
		dbObject.printDB(list);
		
	}
}

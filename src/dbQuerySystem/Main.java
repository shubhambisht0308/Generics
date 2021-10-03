package dbQuerySystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import util.Utils.*;
import operations.*;
import properties.Entry;
import properties.*;

class UserEntry {
	String name;
	double price;
	
	public UserEntry(String name, double price) {
		this.name = name;
		this.price = price;
	}
}

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
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
		
		entryist.add(new UserEntry("gds", 90.7));
		entryist.add(new UserEntry("jyd", 365442.7));
		entryist.add(new UserEntry("cszsdw", 38744.7));
		entryist.add(new UserEntry("xxga", 344532.7));
		entryist.add(new UserEntry("jndf", 7867));
		
		for (UserEntry entry : entryist) {
			dbObject.addEntry(entry.name, entry.price);
		}
		
		System.out.println("Enter sort type :");
		int operationType = Integer.parseInt(reader.readLine());
		Operation op = null;
		
        if (operationType == 1) {
        	op = new AscendingSort<Entry>();
        } else {
        	op = new DescendingSort<Entry>();
        }
        List<Property> colPriority = new LinkedList<>();
        while(true) {
        	System.out.println("Enter column priorities (ID, NAME, PRICE). 4 to exit");
        	int input = Integer.parseInt(reader.readLine());
        	if (input == 4) break;
        	
        	switch(input) {
        	case 1 : colPriority.add(new Id()); break;
        	case 2 : colPriority.add(new Name()); break;
        	case 3 : colPriority.add(new Price()); break;
        	}
        }
		
		List<Entry> list = operationManager.execute(op, colPriority);
		
		dbObject.printDB(list);
		
	}
}

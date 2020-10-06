package cse360assignment02;

public class AddingMachine {
	private int total;
	private String record = "0";
	  
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total = total + value;
		record = record + " + " + Integer.toString(value);
	}
	
	public void subtract (int value) {
		total = total - value;
		record = record + " - " + Integer.toString(value);
	}
	
	public String toString () {
		return record;
	}
	
	
	//in the instruction, "The clear method should clear your "memory"."
	//if the "memory" means the history of the transactions of this class, then use the 1st ver.
	//if the "memory" means the memory of this class in JVM, then use the 2nd ver.
	//1st ver:
	public void clear() {
		record = Integer.toString(total);
	}
	//2nd ver:
	/*
	public void clear() {
		total = (Integer) null;
		record = null;
		System.gc();
	}
	*/
}

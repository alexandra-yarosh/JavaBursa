package com.itbursa.yarosh.hw2;

public class HomeWork2 {

	
	public static void main (String [] args){
		
		Vector vector = new Vector(5);
		
		System.out.println("Task 1 ");
		vector.printValues();

		
		System.out.println("delete 4th element ");
		vector.remove(4);
		vector.printValues();
		
		System.out.println("delete 0 element ");
		vector.remove(0);
		vector.printValues();
		
		
		System.out.println("append element ");
		vector.add("new string");;
		vector.printValues();
	}
}

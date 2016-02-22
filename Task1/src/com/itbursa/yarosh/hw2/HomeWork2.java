package com.itbursa.yarosh.hw2;

public class HomeWork2 {

	public static void main(String[] args) {

		Circle circle = new Circle(25);

		circle.printCircle();
		System.out.println("Check if point [2,1] is inside of circle: " + circle.isPointInCircle(2, 1));
		System.out.println("Check if point [2,45] is inside of circle: " + circle.isPointInCircle(2, 45));

		// after cirle moved the check breaks, to be fixed in next commit
		circle.moveCircle(5, 12);

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
		vector.add("new string");
		;
		vector.printValues();
	}
}

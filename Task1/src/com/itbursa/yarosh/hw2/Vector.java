package com.itbursa.yarosh.hw2;

public class Vector {

	private static final int DEFAULT_SIZE = 10;

	private String[] objects;
	private int size;

	/**
	 * Creates a new instance of Vector with default size (default size = 10).
	 */
	public Vector() {

		this.objects = new String[DEFAULT_SIZE];
		this.size = 10;
	}

	/**
	 * Creates a new instance of Vector with a specified size.
	 */
	public Vector(int size) {
		this.objects = new String[size];
		this.size = size;

		for (int i = 0; i < size; i++)
			objects[i] = "empty string " + i;

	}

	/**
	 * Appends the specified element to the end of this vector
	 * 
	 * @param element
	 *            - element to be appended to this vector
	 */
	public void add(String element) {
		// creating a new vector with size +1 and copying all elements inside

		Vector newVector = new Vector(size + 1);

		newVector.objects = this.objects;
		newVector.objects[this.size] = element;

		this.objects = newVector.objects;
		this.size++;
	}

	/**
	 * Returns the element at the specified position in this vector.
	 * 
	 * @param index
	 *            - index of the element to return
	 * @return the element at the specified position in this vector
	 */
	public Object get(int index) {
		if (index < this.size)
			return this.objects[index];
		return null;
	}

	/**
	 * Removes the element at the specified position in this vector. Shifts any
	 * subsequent elements to the left.
	 * 
	 * @param index
	 *            - the index of the element to be removed
	 */
	public void remove(int index) {

		for (int i = index; i < this.size; i++) {

			if (i == 0)
				continue;
			if (index == this.size - 1)

				break;
			else
				this.objects[i - 1] = this.objects[i];

		}
		this.size--;
	}

	/**
	 * Removes all of the elements from this vector.
	 */
	public void clear() {
		// TODO Auto-generated method stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public void printValues() {

		System.out.println("Printing out vector of " + this.size + " elements: ");

		for (int i = 0; i < this.size; i++)
			System.out.println("vector [" + i + "] = " + this.objects[i]);
		System.out.println();

	}
}

package com.itbursa.yarosh.hw2practice;

class Singletone {
	// ����������� ���� � �������� ��������� ������:
	private static Singletone instance = null;

	// private �����������:
	private Singletone() {
		
		System.out.println("Whee!!! Singletone created!!!");
	}

	// ���������� ������������ ��������� ������ A:
	synchronized public static Singletone getSingletone() {
		// ��������� instance ���� �� ��� �� ������:
		if (instance == null)
			instance = new Singletone();
		return instance;
	}
	
	public static void main (String args[]){
		
		Singletone myFirstSingletone = getSingletone();
		
	}
}

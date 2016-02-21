package com.itbursa.yarosh.hw2practice;

class Singletone {
	// статическое поле Ц закрытый экземпл€р класса:
	private static Singletone instance = null;

	// private конструктор:
	private Singletone() {
		
		System.out.println("Whee!!! Singletone created!!!");
	}

	// возвращает единственный экземпл€р класса A:
	synchronized public static Singletone getSingletone() {
		// создаетс€ instance если он еще не создан:
		if (instance == null)
			instance = new Singletone();
		return instance;
	}
	
	public static void main (String args[]){
		
		Singletone myFirstSingletone = getSingletone();
		
	}
}

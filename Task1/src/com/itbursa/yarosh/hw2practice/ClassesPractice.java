package com.itbursa.yarosh.hw2practice;

public class ClassesPractice extends ParentClass {
	

		
    ClassesPractice (int x){
    	
		System.out.print("This is a constructor with int parameter "+x);
		
	}

    ClassesPractice (double x){
    	
		System.out.print("This is a constructor with double parameter "+x);
		
	}
     
   ClassesPractice (float x){
    	
		System.out.print("This is a constructor with double parameter "+x);
		
	}
    
    
	
	public static void main(String args[]){
		
		ClassesPractice constr = new ClassesPractice(0.4d);
		
		
		
	}
}

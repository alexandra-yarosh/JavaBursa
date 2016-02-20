package com.itbursa.yarosh.hw1;

import com.itbursa.yarosh.hw1.Task1;

public class MathOperation {
	/**
	 * Returns the greatest common divider of given two numbers
	 * 
	 * @param firstNumber
	 *            - positive number
	 * @param secondNumber
	 *            - positive number
	 * @return greatest common divider of two numbers
	 */
	public int getCommonDivisor(int firstNumber, int secondNumber) {
		// TODO the method body

		while (firstNumber != 0 && secondNumber != 0)
			if (firstNumber > secondNumber) {
				firstNumber = firstNumber % secondNumber;
			} else
				secondNumber = secondNumber % firstNumber;

		return firstNumber + secondNumber;
	}

	/**
	 * Returns sum of digits of the given number
	 * 
	 * @param number
	 *            - positive number
	 * @return the sum of digits of the given number
	 */
	public int getSumOfDigits(int number) {
		int sum = 0;

		while (number >= 10) {

			sum = sum + number % 10;
			number = number / 10;
		}

		return sum + number;
	}

	/**
	 * Checks if the given number is prime or not
	 * 
	 * @param number
	 * @return true - if number is prime, if not return false
	 */
	public boolean isPrime(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++)
			if (number % i == 0)
				return false;
		return true;
	}

	/**
	 * Returns sum of row: 1! - 2! + 3! – 4! + 5! - … + n!
	 * 
	 * @param n
	 *            - positive number
	 */
	public int getSumOfRow(int n) {

		int sumOfRow = 0;
		for (int i = 0; i < n; i++) {
			if (i == 0 || i % 2 == 0)
				sumOfRow += factorial(i);
			else
				sumOfRow -= factorial(i);
		}

		return sumOfRow;
	}

	protected int factorial(int x) {
		int fact = 1;

		for (int i = 1; i <= x; i++) {
			fact *= i;
		}
		return fact;
	}

	public int getSixDigitNumbersCount() {
		int count = 0;
		for (int i = 100000; i < 1000000; i++)
			if (getSumOfFirst3Numbers(i) == getSumOfLast3Numbers(i))
				++count;
		return count;
	}

	private int getSumOfFirst3Numbers(int i) {

		return getSumOfDigits(i / 1000);
	}

	private int getSumOfLast3Numbers(int i) {
		return getSumOfDigits(i % 1000);
	}

	/**
	 * Returns Fibonacci series of a specified length
	 * 
	 * @param length
	 *            - the length of the Fibonacci series
	 * @return array filled with Fibonacci series
	 */
	public int[] getFibonacciSeries(int length) {
		int[] fSerie = new int[length];
		fSerie[0] = 1;
		fSerie[1] = 1;

		for (int i = 2; i < length; i++)
			fSerie[i] = fSerie[i - 1] + fSerie[i - 2];
		return fSerie;
	}

	/**
	 * Returns array with prime numbers
	 * 
	 * @param length
	 *            - the length of prime numbers series
	 * @return array filled with prime numbers
	 */
	public int[] getPrimeSeries(int length) {
		int[] primeNumbersSet = new int[100];
		int number = 1;
		int counter = 0;
		while (primeNumbersSet[primeNumbersSet.length - 1] == 0) {
			if (isPrime(number)) {
				primeNumbersSet[counter] = number;
				counter ++;
			}
			number ++;
		}
		return primeNumbersSet;
	}

	/**
	 * Prints to console chessboard using arrays b - black square w - white
	 * square
	 * 
	 * the output should be like the following
	 * 
	 * w b w b w b w b b w b w b w b w w b w b w b w b b w b w b w b w w b w b w
	 * b w b b w b w b w b w w b w b w b w b b w b w b w b w
	 */
	public void printChessboard() {

		char[][] board = new char[8][8];
		board[0][0] = 'w';

		for (int i = 0; i < 8; i++)
			for (int j = 0; j < 8; j++)
				if (i == 0 & j == 0)
					continue;
				else if (j == 0 && board[i - 1][j] == 'w')
					board[i][j] = 'b';
				else if (j == 0 && board[i - 1][j] == 'b')
					board[i][j] = 'w';
				else if (board[i][j - 1] == 'b')
					board[i][j] = 'w';
				else
					board[i][j] = 'b';
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println("");

		}

	}

	/**
	 * 
	 * @return
	 */
	public int createSixDimensionArray() {
		int counter = 1;
		
		int [][][][][][] dim6 = new int [2][2][2][2][2][2];
		for (int i = 0; i<2;i++)
			for (int j = 0; j<2;j++)
				for (int k = 0; k<2; k++)
					for (int l = 0; l<2; l++)
						for (int m = 0; m<2; m++)
							for (int n = 0; n<2; n++)
							 dim6 [i][j][k][l][m][n] = counter++;
 								
							
		
		return counter;
	}

	/**
	 * Prints to console Pascal's triangle with the given number of rows
	 * 
	 * @param numberOfRows
	 *            the number of rows in the triangle
	 */
	public void printPascalsTriangle(int numberOfRows) {
		int[][] p = new int[numberOfRows][];
		p[0] = new int[1];
		p[1] = new int[2];
		p[1][0] = p[1][1] = 1;
		System.out.println(p[0][0] = 1);
		System.out.println(p[1][0] + " " + p[1][1]);
		for (int i = 2; i < numberOfRows; i++) {
			p[i] = new int[i + 1];
			System.out.print((p[i][0] = 1) + " ");
			for (int j = 1; j < i; j++) {
				System.out.print((p[i][j] = p[i - 1][j - 1] + p[i - 1][j]) + " ");
			}
			System.out.println(p[i][i] = 1);
		}
	}

	public static void main(String[] args) {
		MathOperation math = new MathOperation();

		int gdc = math.getCommonDivisor(10, 15); // 5
		System.out.println("---------Task 1---------");
		System.out.println("Common divider for 10 and 15 is: " + gdc);
		System.out.println("");

		int sumOfDigits = math.getSumOfDigits(123456); // 21

		System.out.println("---------Task 2---------");
		System.out.println("Sum of 123456 is: " + sumOfDigits);
		System.out.println("");

		System.out.println("---------Task 3---------");
		System.out.println("Check if 7 is prime: " + math.isPrime(7));
		System.out.println("Check if 10 is prime: " + math.isPrime(10));
		System.out.println("");

		System.out.println("---------Task 4---------");
		System.out.println("sum of row from 5 elements: " + math.getSumOfRow(5));
		System.out.println("");

		System.out.println("---------Task 5 ---------");
		System.out.print(math.getSixDigitNumbersCount());
		System.out.println("");

		System.out.println("---------Task 6---------");
		int[] fibRow = math.getFibonacciSeries(10);

		for (int i = 0; i < fibRow.length - 1; i++) {
			System.out.print(fibRow[i] + ", ");
		}
		System.out.println(fibRow[fibRow.length - 1] + "");

		System.out.println("---------Task 7---------");
		int[] primes = math.getPrimeSeries(5);
		if (primes != null) {
			for (int i = 0; i < primes.length - 1; i++) {
				System.out.print(primes[i] + ", ");
			}
			System.out.println(primes[primes.length - 1] + "");
		}

		System.out.println("---------Task 8---------");
		math.printChessboard();
		System.out.println();

		System.out.println("---------Task 9 TODO---------");		
		System.out.println("It needs ["+ math.createSixDimensionArray() +"] numbers to be filled");
		System.out.println();

		System.out.println("---------Task 10---------");
		math.printPascalsTriangle(5);
		System.out.println();

		
	}

}

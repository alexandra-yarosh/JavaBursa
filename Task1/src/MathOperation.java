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
		
		while (firstNumber!=0 && secondNumber !=0)
			if(firstNumber>secondNumber){
				firstNumber = firstNumber % secondNumber;
			}
			else 
				secondNumber = secondNumber % firstNumber;
		
		return firstNumber+secondNumber;
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
		while (number >10)
		{
			sum = number % 10;
			number = number % 10;
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
		for (int i=2; i<= sqrt(number); i++)
			if (number%i==0)
				return false;
			return true;
	}
	
	

	/**
	 * Returns sum of row: 1! - 2! + 3! Ц 4! + 5! - Е + n!
	 * 
	 * @param n
	 *            - positive number
	 */
	public int getSumOfRow(int n) {
		// TODO the method body
		return 0;
	}

	/**
	 * ѕодсчитать, сколько шестизначных чисел имеют равную сумму трех первых и
	 * трех последних цифр.
	 * 
	 */
	public int getSixDigitNumbersCount() {
		return 0;
	}

	/**
	 * Returns Fibonacci series of a specified length
	 * 
	 * @param length
	 *            - the length of the Fibonacci series
	 * @return array filled with Fibonacci series
	 */
	public int[] getFibonacciSeries(int length) {
		int [] fSerie = new int [length];
		fSerie [0] = 1;
		fSerie [1] = 1;
		
		for (int i=2; i<=length;i++)
			fSerie [i]= fSerie[i-1] + fSerie[i-2];
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
		// TODO the method body
		return null;
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
		
		char [][] board = new char [8][8];
		board [0][0] = 'w';
		
		for (int i=0;i<8;i++)
			for (int j=0;j<8;j++)
				if (i==0 & j==0) continue;
				else if (j==0 && board[i-1][j]=='w') board [i][j]='b';
					 else if (j==0 && board[i-1][j]=='b') board [i][j]='w';
						  else if (board [i][j-1]=='b')board [i][j]='w';
						       else board [i][j]='b';
		for (int i=0;i<8;i++){
			for (int j=0;j<8;j++){
				System.out.print(board[i][j] + " ");
			}
			System.out.println("");
			
		}
               				
		
		
	}

	/**
	 * 1.9. —оздать целый шестимерный массив с двум€ значени€ми в каждом
	 * измерении. «аполнить массив числами из начала натурального р€да: 1, 2, 3,
	 * Е —казать, сколько потребуетс€ чисел ?
	 * 
	 * @return
	 */
	public int createSixDimensionArray() {
		return 0;
	}

	/**
	 * Prints to console Pascal's triangle with the given number of rows
	 * 
	 * @param numberOfRows
	 *            the number of rows in the triangle
	 */
	public void printPascalsTriangle(int numberOfRows) {
		int [][] p = new int [numberOfRows][];
        p[0] = new int [1];
        p[1] = new int [2];
        p[1][0] = p[1][1] = 1;
        System.out.println(p[0][0] = 1);
        System.out.println(p[1][0] + " " + p[1][1]);
        for (int i = 2; i < numberOfRows; i++)
        {
            p[i] = new int [i+1];
            System.out.print((p[i][0] = 1) + " ");
            for (int j = 1; j < i; j++)
            {
                System.out.print((p[i][j] = p[i-1][j-1] + p[i-1][j]) + " ");
            }
            System.out.println(p[i][i]=1);
        }
	}
	
	public static void main(String[] args) {
		MathOperation math = new MathOperation();
		
		int gdc = math.getCommonDivisor(10, 15); // 5
		int sumOfDigits = math.getSumOfDigits(123456); // 21
		boolean isPrime = math.isPrime(7); // true
		isPrime = math.isPrime(10); //false
		int sumOfRow = math.getSumOfRow(5);
		int count = math.getSixDigitNumbersCount();
		int [] fibbonacci = math.getFibonacciSeries(10); // [1, 1, 2, 3, 5, 8, 13, 21, 34, 55]
		int [] primes = math.getPrimeSeries(5); // 1, 3, 5, 7, 11
		math.printChessboard();
		int numbersCount = math.createSixDimensionArray();
		math.printPascalsTriangle(3);
	}
}

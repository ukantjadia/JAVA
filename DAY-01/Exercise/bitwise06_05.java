// ~Bitwise Operators
	// problem:
	// bitwise06_05.java{write java program showing the working of all Bitwise Operators.}	
	
class bitwise06_05
{
	public static void main(String args[])
	{
		int a= 2, b=3;
		System.out.println("Value of a = "+a+" and value of b = "+b);
		System.out.println("Binary value of a and b is = "+Integer.toBinaryString(a)+"  "+Integer.toBinaryString(b));
		
		// System.out.println("The Bitwise operators work on the terms of binary notation. ");
		System.out.println("Bitwise OR "+a+" | "+b+" => "+(a|b));
		System.out.println("The Binary notation of a and b is = 00000010 00000011");
		System.out.println("The Truth Table of OR Bitwise Operator is \n A \t B \t OUTPUT \n ----------------------- \n 0 \t 0 \t 0 \n 1 \t 0 \t 1 \n 0 \t 1 \t 1 \n 1 \t 1 \t 1\n -----------------------  ");
		System.out.println("according to truth table answer is 00000010 | 00000011 = 00000011 = 3\n");
		
		
		
		System.out.println("Bitwise AND "+a+" & "+b+" => "+(a&b));
		System.out.println("The Binary notation of a and b is = 00000010 00000011");
		System.out.println("The Truth Table of AND Bitwise Operator is \n A \t B \t OUTPUT \n ----------------------- \n 0 \t 0 \t 0 \n 1 \t 0 \t 0 \n 0 \t 1 \t 0 \n 1 \t 1 \t 1\n -----------------------  ");
		System.out.println("according to truth table answer is 00000010 & 00000011 = 00000010 = 2\n");
		
		
		
		System.out.println("Bitwise XOR "+a+" ^ "+b+" => "+(a^b));
		System.out.println("The Binary notation of a and b is = 00000010 00000011");
		System.out.println("The Truth Table of XOR Bitwise Operator is \n A \t B \t OUTPUT \n ----------------------- \n 0 \t 0 \t 0 \n 1 \t 0 \t 1 \n 0 \t 1 \t 1 \n 1 \t 1 \t 0\n -----------------------  ");
		System.out.println("according to truth table answer is 00000010 ^ 00000011 = 00000001 = 1\n");
		
		
		System.out.println("Bitwise NOT  ~ "+a+" => "+(~a));
		System.out.println("The Binary notation of a is = 00000010");
		System.out.println("The Truth Table of NOT Bitwise Operator is \n A \t OUTPUT \n ----------------------- \n 0 \t 1 \n 1 \t 0 \n-----------------------  ");
		System.out.println("according to truth table answer is ~00000010  = 11111101 = -3\n");

		System.out.println("ENDING THE PROGRAM...\n:-) THANK YOU (-:");
	}
}
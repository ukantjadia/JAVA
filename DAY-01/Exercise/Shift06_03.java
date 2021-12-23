// Shift Operators
	// problem:
	// Shift06_03.java{wirte java program showing the working of Shift Operators.}
class Shift06_03
{
	public static void main(String args[])
	{
		int x= 2 , y= 1;
		System.out.println("Value of x and y is = "+x+" "+y);
		System.out.println("Binary value of x and y is "+Integer.toBinaryString(x)+" "+Integer.toBinaryString(y));
		System.out.println("Binary notation of x and y is: 000000010 00000001");
		System.out.println("Left Shift Operator "+x+" << "+y+" => "+(x<<y));
		System.out.println("Left shift work by shifting 'y' bit in left side in binary notation of 'x' as follows: 00000010 << 000000100");
		
		System.out.println("Right Shift Operator "+x+" >> "+y+" => "+(x>>y));
		System.out.println("Right shift work by shifting 'y' bit in right side in binary notation of 'x' as follows: 00000010 >> 00000001");

		System.out.println("Unsigned Right Shift Operator "+x+">>>"+y+"=>"+((x>>>y)));
		System.out.println("Unsigned Right Shift Operator work by shifting the 'y' bits in right side in binary notation but signed is not copied. ");
		
		System.out.println("Showing the Unsigned operator with negative sign on x");
		System.out.println("Left Shift Operator -"+x+" << "+y+" => "+(-x<<y));
		System.out.println("Right Shift Operator -"+x+" >> "+y+" => "+(-x>>y));
		System.out.println("Unsigned Right Shift Operator -"+x+">>>"+y+" => "+((-x>>>y)));
		
		System.out.println("ENDING THE PROGRAM...\n:-) THANK YOU (-:");
	}
}
 // ~Logical Operators
	// problem:
	// logical06_04.java{wirte java program showing the waorking of Logical Operators.}
class logical06_04
{
	public static void main(String args[])
	{
		int a= 2, b=3;
		System.out.println("Value of a and b is = "+a+" "+b);
		
		System.out.println("Logical OR "+a+" > "+b+" || "+a+" < "+b+" => "+((a>b)||(a<b)));
		System.out.println("Logical OR "+a+" > "+b+" || "+a+" > "+b+" => "+((a>b)||(a>b)));
	
		System.out.println("\nLogical AND "+a+" < "+b+" && "+a+" < "+b+" => "+((a<b)&&(a<b)));
		System.out.println("Logical AND "+a+" > "+b+" && "+a+" < "+b+" => "+((a>b)&&(a<b)));
		
		System.out.println("\nLogical NOT{!}   !("+a+" == "+b+") => "+(!(a == b)) );
		System.out.println("Logical NOT{!}   !("+a+" < "+b+") => "+(!(a < b)) );
	
		System.out.println("ENDING THE PROGRAM...\n:-) THANK YOU (-:");
	}
}
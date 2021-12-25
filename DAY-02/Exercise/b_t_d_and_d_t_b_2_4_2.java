//problelm 2.4.2
		//b_t_d_and_d_t_b_2_4_2.java: write a program that dose binary to decimal and decimal to binary 
import java.util.Scanner;
class b_t_d_and_d_t_b_2_4_2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the binary number: ");
		 int binar = sc.nextInt();
		// System.out.println("Enter the decimal number: ");
		// int decimal = sc.nextInt();
		int bino = binar;
		int base = 1, num,rem, decino =0;
		while(bino > 0)
		{
			rem = bino % 10;
			decino = decino + rem*base ;
			bino = bino/10;
			base =  base *2;
		}
		System.out.println("Binary number is "+binar+"and \n Decimal number is "+decino);
		
	// decimal to binary
		System.out.println("\n\nEnter the decimal number: ");
		int decimal = sc.nextInt();
		int i =0 , deci;
		int binary[] = new int[16];
		deci = decimal;
		while(deci > 0)
		{
			binary[i++] = deci%2;
			deci = deci/2;
		}
		System.out.println("Decimal number is "+decimal+"and \n Binary number is ");
		for( i = i-1 ; i >= 0; i-- )
		{
			System.out.print(binary[i]);
		}
			
	}
}
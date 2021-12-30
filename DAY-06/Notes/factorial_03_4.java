//problem 03.4
			//	factorial_03_4.java :	write a program to calculate the factorial of the given number using recursion.



import java.util.*;
class factorial_03_4{
 static int fact(int n){
	 if(n == 1)
		 return 1;
	 else
		 return n*fact(n-1);
 }
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to get factorial:");
		int num = sc.nextInt();
		System.out.println("Factorial is: "+fact(num));
		sc.close();
	}
}
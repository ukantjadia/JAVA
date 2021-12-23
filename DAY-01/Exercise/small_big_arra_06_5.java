// ~problem: 06.5
// 		small_big_arra_06_5.java: Write a JAVA program to fine the biggest & smallest number from the given array of 10 integers.
import java.util.Scanner;
class small_big_arra_06_5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array: ");
    int size = sc.nextInt();
		int arr[] = new int[size];
    // {00,11,55,00,33,22,44,77,88};
		System.out.println("Enter the element for the array{avoid 0 at first}");
		for(int j = 0 ; j <size ; j++)
			 arr[j] = sc.nextInt();
		
    	int small = arr[0] ,large = arr[0];
		int len = arr.length;
		for(int i = 0 ; i< size ; i++)
		{
			if(arr[i] < small)
        small = arr[i];

			else if(arr[i] > large)
				large = arr[i] ;
      
		}
		System.out.println("small number is: "+small);
		System.out.println("largest number is: "+large);
	}
}
		
		
		
		
		
		
		
		
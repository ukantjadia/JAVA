// problem 04.2:
		// sort_arr_04_2.java : Write a program to generate the sorting order of array
import java.util.Scanner;
class sort_arr_04_2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int sortest = 0 ;
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the element for the array: ");
		for(int i = 0 ; i < size ; i++)
		{
			arr[i] = sc.nextInt();
		}
		// start sorting
		for(int i = 0 ; i <size ; i++)
		{
			for(int j = 0 ; j< size ; j++)
			{
				if(arr[i] < arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp ;
					
				}
			}
		}
		for(int j = 0 ; j < size ; j++)
		{
			System.out.print(" "+arr[j]);
		}
		
	}
}		
		
		
		
		
		
		
		
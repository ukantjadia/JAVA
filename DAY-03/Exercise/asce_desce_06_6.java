// ~problem: 06.6
// 		asce_desce_06_6.javaasce_desce_06_6.java: Write a JAVA program to sort given of 10 integers in ascending & descending order.

import java.util.Scanner;
class asce_desce_06_6
{
	public static void main(String[] args)
	{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size for both array");
    int size = sc.nextInt();
		int arr[] = new int[size];
    int arr1[] = new int[size];
    System.out.println("Enter the element for first array: ");
    for(int a = 0 ; a < size ; a++)
      {
        arr[a] = sc.nextInt();
      }
    System.out.println("Enter the element for the second array:  ");
    for(int s = 0 ; s<size ; s++)
    {
      arr1[s] = sc.nextInt();
    }
		for(int i = 0 ; i<arr.length;i++)
		{
      for(int j = 0; j<arr.length ; j++)
      {
        if(arr[i] < arr[j])
        {
          int temp = arr[i];
          arr[i ] = arr[j];
          arr[j] = temp;
        }
        if (arr1[i] > arr1[j])
        {
          int temp = arr1[i];
          arr1[i] = arr1[j];
          arr1[j] = temp;
        }
      }
		}
		System.out.println("shorting the array int ascending order:  ");
		for(int i=0; i<arr.length ; i++)
		{
			System.out.print(" "+ arr[i]);
    }
    System.out.println(" Shorting the array in Descending Order:  ");
    for(int kk = 0 ; kk<arr.length ; kk++)
    {
      System.out.print(" "+arr1[kk]);
    }
	}
}
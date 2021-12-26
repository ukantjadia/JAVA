// ~problem: 06.7
// 		dele_array_06_7.java: Write a JAVA program to delete an element from an array of 10 elements.
import java.util.Scanner;
class 	dele_array_06_7
{
	public static void main(String[] args)
	{
		int temp = 0 , count =0 ;
    boolean flag = false;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
    int arr[] = new int[size];
		System.out.println("Enter the element for the array: ");
		for(int i = 0 ; i<size ; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter elememt to delete from array: ");
		int todel = sc.nextInt();
		for(int i = 0 ; i<size ; i++)
		{
			if(arr[i] == todel)
			{
        temp = arr[i];
        for(int j = i ; j<(size-1); j++)
        {
				  arr[j] = arr[j+1];
          // System.out.println("  "+arr[j]);
        }
			}
      // flag = true;
      ++count;
      break;
		}
    if(count ==0 )
      System.out.println("Element not found!Enter correct element");
  	else 
    {
      // System.out.println("element to delete is temp"+temp);
      System.out.println("showing the array! again");
      for(int j =0 ; j<size ; j++)
      {
        System.out.print("  "+arr[j]);
      }
    }

	}
}





problem 04.2:
		sort_arr_04_2.java : Write a program to generate the sorting order of array
		
import java.util.*;
class sorting{
	public static void main(String args[]){
		int i, flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("To get the order of Array");
		System.out.println("Enter the number of element in Array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(i = 0; i<n ; i++){
			System.out.println("Enter element"+(i+1)+":");
			arr[i] = sc.nextInt();
			if(i== n-1)
				sc.close();
		}
			for(i=0;i<n-1;i++){
				if(arr[i] < arr[i+1])
					flag = 1;
				else if(arr[i] == arr[i+1])
					flag =1;
				else{
					flag = 0;
					break;
				}
			}
			if(flag != 1)
			{
				for(i = 0;i<n-1;i++)
				{
					if(arr[i]>arr[i+1])
						flag = 2;
					else if(arr[i] > arr[i+1])
						flag = 2;
					else 
					{
						flag = 0;
						break;
					}
				}
			}
			switch(flag)
			{
				case 1:
					System.out.println("Acending order."); break ;
				case 2:
					System.out.println("decending order."); break ;
				case 3:
					System.out.println("Unordered Array."); break ;
			}
	}
}
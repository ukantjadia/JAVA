	~problem: 06.8
		transmatrix_06_8.java: Write a JAVA program that prints transpose of given matrix.
import java.util.Scanner;
class transmatrix_06_8
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int arr[][] =  new int[3][3];
		
		System.out.println("Enter the size of square matrix");
		int size = sc.nextInt();
		System.out.println("Enter the element for the  matrix");
		for(int i = 0 ; i<size ; i++)
		{
			for(int j = 0 ; j < size  ; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Printing the matrix");
		for(int i = 0 ; i< size ; i++)
		{	
			for(int j = 0; j < size ; j++)
			{
				System.out.print(" "+arr[i][j]);
			}
			System.out.println(" ");
		}
		
		System.out.println("Printing the Transpose matrix");
		for(int i = 0 ; i< size ; i++)
		{	
			for(int j = 0; j < size ; j++)
			{
				System.out.print(" "+arr[j][i]);
			}
			System.out.println(" ");
		}
	}
}
		
		
		
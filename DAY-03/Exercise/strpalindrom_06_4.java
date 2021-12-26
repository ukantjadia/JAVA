//~problem: 06.4
		//
		: Write a JAVA program that checks whether a given string is palindrome or not?
class strpalindrom_06_4
{
	public static void main(String args[])
	{
		//String arr[] = new String[20];
		boolean flag = true;
		String arr[] = {'papa'};
		int kk = arr.length();
		for(i = 0; i<kk ; i++)
		{
			for(int j = kk-1; j>0; j--)
			{
				if(arr[i] == arr[j])
					falg = false;
			}
			//if(arr[i] != arr[arr.length-i-1])
				//flag = false;
		}
		if(flag)
			System.out.println("this is not palindrome");
		else
			System.out.println("yes it is palindrome");
		
 	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
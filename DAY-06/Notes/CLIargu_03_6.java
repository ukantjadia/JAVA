// problem 03.6
			//CLIargu_03_6.java :	Write a program to print your name by using the concept of command line arguments passing mechanism.


class CLIargu
{
	public static void main(String args[]){
		System.out.println("Argument from command line ");
		for(int i = 0 ; i < args.length ; i++){
			if(i == 0)
				System.out.println("First name : "+args[i]);
			else if(i == 1)
				System.out.println("Middle name : "+args[i]);
			else
				System.out.println("last name : "+args[i]);
		}
	}
}
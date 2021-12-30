problem  03.5
			staticAddition_03_5.java  :	Demonstration of static variables to perform the addition the addition without creaeting any object in the class.(Demonstration of static variable and static methods)



class staticAddition_03_5
{
	static int a = 45, b = 55;
	static int sum;
	static void addition(){
		System.out.println("First number for addition "+a);
		System.out.println("Second number for addition "+b);
		System.out.println("Result of Addition:  "+sum);
	}
	static{
		System.out.println("Static block initialize.");
		sum = a+b;
	}
	public static void main(String args[]){
		addition();
	}
}
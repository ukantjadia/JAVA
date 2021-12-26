// ~problem: 06.2
		// student_06_2.java :Definging a class called Student.Observe the members of the class i.e. the data and function
class student
{
	float data;
	void function()
	{
		float hh = data;
		System.out.println("from class function.data ="+hh);
	}
}		
class student_06_2
{
	public static void main(String args[])
	{
		student obj1 = new student();
		obj1.data= 452;
		System.out.println("from class student using obg1, function is: ");
		obj1.function();
	}
}



//problem 2.4.1
		// time_2_4_1.java: write a program to calculate current time in hrs,min,sec.(usign finction System.curretTimeMillis();)

class time_2_4_1
{
	public static void main(String args[])
	{
		// System.out.println("Giving the current time in seconds: ");
		System.out.println((System.currentTimeMillis()));
		System.out.println("Time in hour "+(System.currentTimeMillis()/3600)+" : minute "+(System.currentTimeMillis()/60)+" : seconds "+System.currentTimeMillis());
	}
}
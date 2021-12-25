//problem 2.4.2
		//change_cur_2_4_2.java: write a program to calculate the currency change (IN rupees , 50paise , 20paise , 5paise , 2paise , 1paise)
import java.util.Scanner;
class change_cur_2_4_2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the money you have to get change: ");
		float cur = sc.nextFloat();
		int _2000 = (int)(cur/2000);
		cur = _2000*2000;
		
		int _500 = (int)(cur/500);
		cur = _500*500;
		
		int _200 = (int)(cur/200);
		cur = _200*200;
		
		int _100 = (int)(cur/100);
		cur = _100*100;
		
		int _50 = (int)(cur/50);
		cur = _50*50;
		
		int _20 = (int)(cur/20);
		cur = _20*20;
		
		int _10 = (int)(cur/10);
		cur = _10*10;
		
		int _5 = (int)(cur/5);
		cur = _5*5;
		
		int _2 = (int)(cur/2);
		cur = _2*2;
		
		int _1 = (int)(cur/1);
		cur = _1*1;
		
		float __50 = (int)(cur/50);
		cur = (float)(__50*0.50);
		
		float __25 = (int)(cur/25);
		cur = (float)( __25*0.25);
		
		float __1 = (float)(cur/1);
		cur = (float)(__1*0.01);
		
		System.out.println("Money in Ruppe:_2000: "+_2000+"\n_500: "+_500+"\n_200: "+_200+"\n_100: "+_100+"\n_50: "+_50+"\n_20: "+_20+"\n_10: "+_10+"\n_5: "+_5+"\n_2: "+_2+"\n_1: "+_1+" ");
		System.out.println("\nMoney in Paise:__50: "+__50+"\n__25: "+__25+"\n__1: "+__1+" ");
		
		
	}
}
// proble 03.9
			// multiInheri_03_9.java :	Demonstration of calling order of constructors in multilevel inheritance as in the above program.
			
class first{
	first(int a, int b){
	System.out.println("First: Sum of first two = "+(a+b));
	}
	boolean completecheck(){
		return true;
	}
}

class second extends first{
	second(int a, int b, int c){
		super(a,b);
		System.out.println("Second: Sum of first Three = "+(a+b+c));
	}
}

class third extends second{
	third(int a, int b, int c, int d){
		super(a,b,c);
		System.out.println("Third: Sum of All = "+(a+b+c+d));
	}
}

class multiInheri_03_9{
	public static void main(String args[]){
		third sum = new third(11,22,33,44);
		System.out.println("Sum of complition status: "+sum.completecheck());
	}
}
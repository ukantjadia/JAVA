// proble 03.12
	
				// multilevelinhe_03_12.java :	Demonstration of multilevel inheritance by extending class A in class B and class C, all classesmust have some instance variables and methods. 

class a1{
	double plantgrowth;
	a1(double initialgrowth){
		plantgrowth = initialgrowth;
		System.out.println("First: Plant Growth in Initial year: "+plantgrowth);
	}
	double getplantheight(){
		return plantgrowth;
	}
}

class b1 extends a1{
	double avg2ndyeargrowth = 5.9f;
	b1(double initialgrowth, double secondyeargrowth){
		super(initialgrowth);
	}
	double idealgrowth(){
		return super.getplantheight() + avg2ndyeargrowth;
		System.out.println("Second: Plant Growth in Second year: "+(initialgrowth + secondyeargrowth));
	}
}

class c extends b1{
	double avg3ndyeargrowth = 7.2f;
	c(double initialgrowth, double secondyeargrowth, double thirdyeargrowth){
		super(initialgrowth.secondyeargrowth);
		System.out.println("Third: Plant Growth in Third year: "+(initialgrowth + secondyeargrowth+thirdyeargrowth));
	}
	double idealgrowth3(){
		return super.getplantheight()+super.avg2ndyeargrowth+avg3ndyeargrowth;
	}
}

class plantgrowth{
	public static void main(Strign args[]){
		c plant1 = new c(2.4, 5.3, 4.4);
		System.out.println("Plant height in first year: %.2f",plant1.getplantheight());
	}
}
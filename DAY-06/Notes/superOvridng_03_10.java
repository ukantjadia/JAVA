// problem 03.10
			// superOvridng_03_10.java	  :	Demonstration of method overriding with the help of supr keywaord.
			
			
class semiCircle{
	double radius;
	double pi = 3.14f;
	
	semiCircle(double r){
		radius = r;
	}
	double getArea(){
		return (pi*radius*radius)/2;
	}
}

class quadCircle extends semiCircle{
	quadCircle(double r){
		super(r);
	}
	double getArea(){
		return super.getArea()/2;
	}
}

class superOvridng_03_10{
	public static void main(String args[]){
		quadCircle qOne = new quadCircle(56);
		System.out.printf("Area of quad Circle is: %.2f ",qOne.getArea());
	}
}
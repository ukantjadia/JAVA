// problem 03.8
			// singleInhertance_03_8.java 	:	Write a program to construct Box class that stores width,height and depth of the box and extends Box class to include weight parameter in BoxWeight class and calculate the volume and weight of different boxes with the help of super keywaord(Demonstration of super keyword to call base class constructor).
			
class box{
	private double width;
	private double height;
	private double depth;
	
	box(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}
	box(){
		width = height = depth = -1;
	}
	double volume(){
		return width*height*depth;
	}
}

class boxWeight extends box{
	double weight;
	boxWeight(double w, double h, double d, double m){
		super(w, h, d);
		weight = m;
	}
	boxWeight(){
		weight = -1;
	}
}

class  singleInhertance_03_8{
	public static void main(String args[]){
		boxWeight boxOne = new boxWeight(4,6,8,10);
		System.out.println("Weight of the box is: "+boxOne.weight);
		System.out.println("volume of the box is: "+boxOne.volume());
	}
}
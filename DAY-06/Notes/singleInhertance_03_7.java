// problem 03.7
			// singleInhertance_03_7.java :	Write a program to constructor Box calss that stores width, height and depth of the box and extend Box class to include weight parameter in BoxWeight class and calcuate the volume and weight of different boxes.(Demonstration of single level inheritance)
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
		width = height = depth = 50;
	}
	double volume(){
		return width*height*depth;
	}
}

class boxWeight extends box{
	double weight;
	boxWeight(double m){
		weight = m;
	}
	boxWeight(){
		weight = -1;
	}
}

class singleInhertance_03_7{
	public static void main(String args[]){
		boxWeight boxOne = new boxWeight(40);
		System.out.println("Weight of the box is: "+boxOne.weight);
		System.out.println("volume of the box is: "+boxOne.volume());
	}
}
// proble 03.11	
			// hidesuper_03_11.java 	: Demonstration of instance variable hiding with the help of super keyword.
			
class humanHeight{
	float personHeight;
	humanHeight(float height){
		personHeight = height;
	}
}			

class averageHeight extends humanHeight{
	private float personHeight = 5.7f;
	averageHeight(float height){
		super(height);
	}
	void getHeight(){
		System.out.println("Height Acquired from parent - Current Height class : "+super.personHeight);
		System.out.println("Height Acquired from Child - Current Height class : "+personHeight);
	}
}

class hidesuper_03_11{
	public static void main(String args[]){
		averageHeight ah = new averageHeight(5.9f);
		ah.getHeight();
		averageHeight ah2 = new averageHeight(6.2f);
		ah2.getHeight();
		
	}
}
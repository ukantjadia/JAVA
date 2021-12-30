//problem
		//	obj_large_03_2.java :	Create a simple calss to compare the value of two integers, where these two integers belong to different objects of the same class using method which takes object as a parameter and returns the object which contains the larger value.(Demonstration of method returning object)


class intlarge{
	int a ;
	intlarge(){
		a = 0;
	}
	intlarge(int a){
		this.a = a;
	}
	int large(intlarge ob){
		if(a > ob.a)
			return a;
		else if(a < ob.a)
			return ob.a;
		else
			return -1;
	}
}

class obj_large_03_2{
		public static void main(String args[]){
			intlarge ob = new intlarge(45);
			
			System.out.println("First integer from class object 1:"+ob.a);
			intlarge ob1 = new intlarge(56);
			
			System.out.println("First integer from class object 2:"+ob1.a);
			System.out.println("\n\n large no.:"+ob.large(ob1));
		}
	}
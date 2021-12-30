// problem:
			// obj_para_03_1.java :	Create a simple class to compare the value of two integers, where these two integers belong to different objects of the same class using method  which takes object as a parameter.(Dempnstration of method taking object as parameter)
// ```java
class intcompare{
	int a;
	intcompare(){
		a = 0; 
	}
	intcompare(int a){
		this.a = a;
	}
	boolean compare(intcompare ob){
		if(a == ob.a)
			return true;
		else 
			return false;
	}
}
class obj_para_03_1{
	public static void main(String args[]){
		intcompare ob = new intcompare(45);
		
			System.out.println("First integer from class object 1:"+ob.a);
			intcompare ob1 = new intcompare(56);
			
			System.out.println("First integer from class object 2:"+ob1.a);
			System.out.println("\n\n equality check .:"+ob.compare(ob1));
	}
}
// ```
// problem:
			// GC_03_3.java :	Write a program to perform garbage collection.

		
		
class grabcollect_03_3{
	int a;
	public void finalize(){
		System.out.println("Null Object is collected as GARBAGE");
	}
	grabcollect(int a){
		this.a = a;
	}
	int twice(){
		return a*2;
	}
	public static void main(String args[]){
		grabcollect s1 = new grabcollect(12);
		grabcollect s2 = new grabcollect(56);

		System.out.println("Twice of passed value in first object:"+s1.twice());
		System.out.println("Twice of passed value in second object:"+s2.twice());
		s1 = null;
		System.gc();
	}
}
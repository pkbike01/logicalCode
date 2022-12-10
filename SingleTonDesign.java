
we design a class in as such a way that creates atmost only one Object.	


final public class A{

	static A a;
	private A(){
	

	}
	public static A getInstance(){
		if(a==null){
			a= new A();
		}
		return a;
	}


}





public class B{
	public static void main(String[] args){

		A a1 = A.getInstance();
		A a2 = A.getInstance();
		System.out.println(a1);
		System.out.println(a2);
	}
}
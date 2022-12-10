package java_practice;

public class A {
	public static void test(int a, int b) {
		if(a<=b) {
			System.out.print(a + ",");
			test(a+1,b);
			
		}
		
	}
	public static void main(String[] args) {
//		A a1 = new A();
		test(1, 100);
//		for(int i=1;i<=100;i++) {
//			System.out.println(i);
//		}
	}

}

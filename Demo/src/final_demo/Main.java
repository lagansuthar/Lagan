package final_demo;

class A{
	final int a=10;
	final void meth(){
		//a=20;
		System.out.println("A");
	}
}


public class Main {
public static void main(String[] args) {
	A a =new A();
	System.out.println(a.a);
	a.meth();
}
}

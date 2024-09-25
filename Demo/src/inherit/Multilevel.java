package inherit;

class Company{
	void sal(){
		System.out.println("sal");
	}
}
class Accountant1 extends Company{
	void sal(double sal){
		System.out.println(sal);
	}
}
class Emp extends Accountant1{
	void sal(double sal,double tax){
		System.out.println(sal-tax);
	}
}

public class Multilevel {
public static void main(String[] args) {
	Emp emp =new Emp();
	emp.sal();
	emp.sal(25000);
	emp.sal(25000, 1000);
}
}

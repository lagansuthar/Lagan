package inherit;

class Accountant2 {
	void sal() {
		System.out.println("sal");
	}
}

class Emp2 extends Accountant2 {
	void esal() {
		System.out.println("Employee sal");
	}
}

class Manager2 extends Accountant2 {

	void msal() {
		System.out.println("Manager sal");
	}
}

public class heirarchy {
	public static void main(String[] args) {
		Emp2 emp = new Emp2();
		emp.esal();
		emp.sal();

		Manager2 manager2 = new Manager2();
		manager2.msal();
		manager2.sal();
	}
}

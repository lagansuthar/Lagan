package inherit;

class Accountant {
	void sal() {
		System.out.println("sal");
	}
}

class Manager extends Accountant {
	void msal() {
		System.out.println("Manager sal");
	}
}

public class Simple {
	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.sal();
		manager.msal();
	}
}

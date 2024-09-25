package abstract_demo;

abstract class Company {
	abstract void sal();

	abstract void work();

	void bonus(double bonus) {
		System.out.println(bonus);
	}
}

class Emp extends Company {

	@Override
	void sal() {
		System.out.println("sal");

	}

	@Override
	void work() {
		System.out.println("Work");

	}

}

class Manager extends Company {

	@Override
	void sal() {
		System.out.println("sal");

	}

	@Override
	void work() {
		System.out.println("Work");

	}

	@Override
	void bonus(double bonus) {
		System.out.println(bonus);
	}

}

public class Main {
	public static void main(String[] args) {
		Emp emp=new Emp();
		emp.sal();
		emp.work();
		Manager manager=new Manager();
		manager.sal();
		manager.work();
		manager.bonus(2000);
	}
}

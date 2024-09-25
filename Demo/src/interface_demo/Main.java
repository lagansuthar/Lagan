package interface_demo;

interface Rules {
	void onTime();

	void discipline();
}

class Emp implements Rules {

	@Override
	public void onTime() {
		System.out.println("Be On time");

	}

	@Override
	public void discipline() {
		System.out.println("Follow Discipline");

	}

}

public class Main {
	public static void main(String[] args) {
		Emp emp=new Emp();
		emp.onTime();
		emp.discipline();
	}
}

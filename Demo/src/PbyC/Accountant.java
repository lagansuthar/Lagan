package PbyC;

public class Accountant extends Company{

	@Override
	public double sal(double sal) {
		// TODO Auto-generated method stub
		return sal;
	}

	@Override
	public double sal(double sal, double tax) {
		// TODO Auto-generated method stub
		return sal-tax;
	}

	@Override
	public double sal(double sal, double tax, double bonus) {
		// TODO Auto-generated method stub
		return sal-tax+bonus;
	}

}

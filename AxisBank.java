package week3.day1Assignments;

public class AxisBank extends BankInfo {
	
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit method changes for Axis Bank");
		//super.deposit();
	}

	public static void main(String[] args) {
		AxisBank a = new AxisBank();
		a.deposit();
		a.saving();
		a.fixed();
	}
}



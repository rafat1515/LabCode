package labcode06oct;

public class Bank_Main {

	public static void main(String[] args) {
		
		Bank b1 = new SBI();
		b1.bank();
		
		Bank b2 = new AXIS();
		b2.bank();
		
		Bank b3 = new ICICI();
		b3.bank();
		
	}

}

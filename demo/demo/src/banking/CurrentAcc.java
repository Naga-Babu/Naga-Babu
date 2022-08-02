package banking;

public class CurrentAcc extends BankAcc {
	
	public final float CreditLimit;
	
	public CurrentAcc(int accNo, String accNm, float accbal,float CreditLimit) {
		super(accNo, accNm, accbal, false);
		this.CreditLimit = CreditLimit;
	}

	public void Withdraw(float CreditLimit) {
		
	}
	
	@Override
	public String toString() {
		return "CurrentAcc [CreditLimit=" + CreditLimit + "]";
		
	}
	
}

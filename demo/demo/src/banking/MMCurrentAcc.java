package banking;

public class MMCurrentAcc extends CurrentAcc{

	private static final String CreditiLimit = null;
	public MMCurrentAcc(int accNo, String accNm, float accBal, float CreditLimit) {
		super(accNo, accNm, accBal, CreditLimit);
	}
	public void Withdraw(float accBal) {
		System.out.println("Dear Current user, Your account accBal are : "+" "+accBal + " with CreaditLimit"+CreditiLimit);
	}
	
	@Override
	public String toString() {
		return "MMCurrentAcc [accNo=" + accNo + ", accNm=" + accNm +", accBal=" + accBal + "]";
	}

}
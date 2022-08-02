package banking;

public class MMSavingAcc extends BankAcc {
	private static final float Withdraw=0;

	public MMSavingAcc(int accNo, String accNm, float accBal,boolean isSalary) {
		super(accNo, accNm, accBal,isSalary);
	}

	@Override
	public void Withdraw(float accBal) {
		System.out.println("Dear Saving user, your account accBal are "+Withdraw);
	}
	
	@Override
	public String toString() {
		return "MMMSavingAcc [accNo=" + accNo + ", accNm=" + accNm +", accBal=" + accBal + "]";
	}
}

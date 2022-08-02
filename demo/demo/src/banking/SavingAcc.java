package banking;

public class SavingAcc extends BankAcc {

	private boolean  isSalary;
	
	public SavingAcc(int accNo, String accNm, float accBal,boolean  isSalary) {
		super(accNo, accNm, accBal,  isSalary);
		this. isSalary =  isSalary;
	}
public void Withdraw(float bal) {
	
}
	
	@Override
	public String toString() {
		return "SavingAcc [ isSalary=" +  isSalary + ",accNo= " + accNo + ", accNm=" + accNm +", accBal= " + accBal + "]";
	}
	
}

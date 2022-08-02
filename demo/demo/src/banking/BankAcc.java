package banking;

public class BankAcc {
	
	public int accNo;
	public String accNm;
	public float accBal;
	
	public BankAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	
	public void Withdraw(float Bal) {
		
	}
	
	public void items(float Bal) {
		
	}
	
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo +", accNm=" + accNm +", accBal=" + accBal + "]";
	}
}

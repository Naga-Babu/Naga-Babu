package banking;

public class MMBankFactory implements BankFactory {

	@Override
	public MMSavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalary) {
		MMSavingAcc mmsaving=new MMSavingAcc(accNo, accNm, accBal, isSalary);
		return mmsaving;
	}

	@Override
	public MMCurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float CreditLimit) {
		MMCurrentAcc mmcurrent=new MMCurrentAcc(accNo, accNm, accBal, CreditLimit);
		return mmcurrent;
	}

}
package banking;

public interface  BankFactory {

	public abstract MMSavingAcc getNewSavingAccount(int accNo,String accNm,float accbal,boolean isSalary);

	public abstract CurrentAcc getNewCurrentAccount(int accNo,String accNm,float accbal,float CreditLimit);
}

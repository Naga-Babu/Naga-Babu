package banking;

public class Customer {

	public static void main(String[] args) {
		MMBankFactory mmbank=new MMBankFactory();
		mmbank.getNewSavingAccount(0, null, 0, false);
		mmbank.getNewCurrentAccount(3456, "babu",4000, 60);
		
		MMSavingAcc mmsaving=new MMSavingAcc(456,"loki",5678,true);
		mmsaving.Withdraw(2000);
		
		MMCurrentAcc mmcurrent=new MMCurrentAcc (143,"Mady",6543,420);
		mmcurrent.Withdraw(500);
		
		
		mmsaving.toString();
		mmcurrent.toString();
	}
}

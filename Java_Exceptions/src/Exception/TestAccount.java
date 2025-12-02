package Exception;

public class TestAccount {

	public static void main(String[] args) throws InsufficentFundException {

		Account a = new Account();

		a.setBalance(500.00);

		System.out.println("Current balance :" + a.getBalance());

		a.withdraw(1000.00);
	}
}

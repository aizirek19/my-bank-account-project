public class Main {
	public static void main(String[] args) {
		PersonalAccount pa = new PersonalAccount(300000, "Aizirek Ibraimova");
		pa.deposit(20000);
		pa.deposit(3000);
		pa.withdraw(9000);
		pa.withdraw(5600);
		System.out.println(pa.getBalance());
		pa.printTransactionHistory();
		
	}

}

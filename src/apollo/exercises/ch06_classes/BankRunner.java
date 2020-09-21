package apollo.exercises.ch06_classes;

public class BankRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount acc1 = new BankAccount("Shazad Nasim", 500);
		acc1.deposit(250);
		acc1.printBalance();
		acc1.withdraw(700);
		acc1.printBalance();
		BankAccount acc2 = new BankAccount("Uzma Nasim", 1000);
		acc2.withdraw(892.45);
		acc2.printBalance();
		acc2.deposit(421.50);
		acc2.printBalance();
		
	}

}

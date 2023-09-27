package javaPracticeForInterview;

public class BankAccount {

	static int balance = 1000;

	static void deposit(int amt) {
		// only deposit multiple of 100
		if (amt > 0) {
			balance = balance + amt;
		} else {
			System.out.println("You can not deposite less than zero");
		}
	}

	static void withdraw(int amt) {
		balance = balance - amt;
	}

	static void display() {
		System.out.println("Current availabe Balance will be : >> " + balance);

	}

	public static void main(String[] args) {

		deposit(201);
		withdraw(100);
		display();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Input your bank Account number");
//
//		long accNo = sc.nextLong(11);
//
//		System.out.println(accNo);

	}

}

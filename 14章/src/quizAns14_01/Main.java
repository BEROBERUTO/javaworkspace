package quizAns14_01;

public class Main {

	public static void main(String[] args) {
		Account a=new Account();
		a.accountNumber="4649";
		a.balance=1592;

		Account b=new Account();
		b.accountNumber=" 4649";
		b.balance=1592;

		System.out.println(b);
		System.out.println(a);

		if(a.equals(b)) {
			System.out.println("同じ内容です");
		}else {
			System.out.println("違う内容です");
		}
	}

}

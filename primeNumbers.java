package week1.day1;

public class primeNumbers {

	public static void main(String[] args) {
		
		int input = 13;
		boolean flag = false;
		
		int balance;
		for (int i = 2; i < input; i++) {
			
			balance=input%1;
			
			if (balance==0) {
				
				flag=true;
				System.out.println( i+"  is a prime number");
			}
		}

	}

}

package week1.day1;

public class fibonacciSeries {

	public static void main(String[] args) {
		int input=8;
		int firstnumber=0;
		int secondnumber=1;
		int sum;
		System.out.println("The First Number iS:" + firstnumber + ";" + secondnumber);
		
		for (int i = 1; i <= input; i++) {
			
			sum = firstnumber + secondnumber;
			firstnumber=secondnumber;
			
			secondnumber=sum;
			
			System.out.println("," + sum);
					
		}
	}

}

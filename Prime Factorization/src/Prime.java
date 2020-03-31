import java.util.Scanner;

public class Prime {
	
	public void askNumber() {
		System.out.println("Enter a number to find it's prime factors: ");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		if(isPrime(input)) {
			System.out.println(input + " is prime");
		}else {
			System.out.println("Prime factors are: ");
		findPrimeFactors(input);
		}
	}
	
	private void findPrimeFactors(int num) {
		if(isPrime(num)) {
			System.out.println(num);
			System.exit(0);
		}
		for(int i=2 ; i<num;i++) {
			if(num % i == 0) {
				if(isPrime(i)) {
					System.out.print(i + " ");
					findPrimeFactors(num / i);
				}
			}
		}
	}
	
	private boolean isPrime(int num) {
		for(int i=2;i<Math.floor(Math.sqrt(num)+1); i++) {
			if(num % i == 0) 
				return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		Prime prime = new Prime();
		prime.askNumber();
	}
}

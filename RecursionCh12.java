public class RecursionCh12 {
	public static int sum(int target) {
		if (target<=0) {
			return 0;
		}
		else {
			return target + sum(target-1);
		}
	}
	
	public static int fib(int n) { //fib=Fibonacci
		if (n<=1) {
			return n;
		}
		else {
			return fib(n-1)+fib(n-2);
		}
	}

//Task: Write a recursive method that will calculate the product of all numbers from 1 to up to a target
	public static int product(int target) {
		if (target<=0) {
			return 0;}
		else if (target-1==0) {
			return 1;}
		else {
			return target*product(target-1);}
		}
	
	public static void main(String[] args) {
		int n=5;
		int result=sum(n); //should get 15 if you add the numbers from 1 to 5
		System.out.println(result);
		System.out.println(fib(6)); //should get 8
		
		int resultProduct=product(n); //should get 120 if you add numbers from 1 to target of 5
		System.out.println(resultProduct);
	} 
}
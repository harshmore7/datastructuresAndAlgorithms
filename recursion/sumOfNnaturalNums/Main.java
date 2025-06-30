public class Main{
	public static void main(String[] args) {
		System.out.println(sumOfNNumbers(5));
	}
	public static int sumOfNNumbers(int n){
		return n==1 ? 1 :sumOfNNumbers(n-1)+ n;
	}
}
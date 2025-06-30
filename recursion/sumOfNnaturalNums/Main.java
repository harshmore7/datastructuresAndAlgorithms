public class Main{
	public static void main(String[] args) {
		System.out.println(sumOfNNumbers(5));
	}
	public static int sumOfNNumbers(int n){
		if(n == 1) return 1;
		return sumOfNNumbers(n-1)+ n;
	}
}
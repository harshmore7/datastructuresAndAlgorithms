public class Main {
    public static void main(String[] args) {
        System.out.println(fibOfN(8));
    }
    public static int fibOfN(int n){
        return n<=1 ? n : fibOfN(n-1) + fibOfN(n-2);
    }
}

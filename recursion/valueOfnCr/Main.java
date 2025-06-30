public class Main {
    public static void main(String[] args) {
        System.out.println(valueOfnCr(5, 4));
    }

    public static int valueOfnCr(int n, int r) {
        return (r == 0 || r == n) ? 1 : valueOfnCr(n - 1, r - 1) + valueOfnCr(n - 1, r);
    }    
}

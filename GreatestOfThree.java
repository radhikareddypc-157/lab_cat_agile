public class GreatestOfThree {
    public static int findGreatest(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        if (b >= a && b >= c) return b;
        return c;
    }
    public static void main(String[] args) {
        int result = findGreatest(10, 20, 15);
        System.out.println("Greatest is: " + result);
    }
}

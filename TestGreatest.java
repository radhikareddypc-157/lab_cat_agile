public class TestGreatest {
    public static void main(String[] args) {
        int result = GreatestOfThree.findGreatest(10, 20, 15);
        if (result == 20) {
            System.out.println("TEST PASSED: Greatest is 20");
        } else {
            System.out.println("TEST FAILED");
        }
    }
}

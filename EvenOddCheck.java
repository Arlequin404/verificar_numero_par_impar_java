public class EvenOddCheck {

    /**
     * Checks if a number is even or odd.
     *
     * @param number Integer to check.
     * @return True if the number is even, false if odd.
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        int number = 4;
        if (isEven(number)) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
}

import java.util.*;

class NumberGuess {
    public static void game(int k) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = (int) (Math.random() * 100) + 1;
            while (k > 0) {
                System.out.println("Enter a number: ");
                int g = sc.nextInt();
                if (g == n) {
                    System.out.println("HOORAY! You guessed the number right.");
                    break;
                } else if (g > n) {
                    System.out.println("The number you entered is greater than the number I guessed.");
                } else {
                    System.out.println("The number you entered is less than the number I guessed. Give it another try.");
                }
                k--;
            }
            if (k == 0) {
                System.out.println("The number was " + n);
            }
            System.out.println("Want to play again? Press '+' or any other key to exit.");
            char s = sc.next().charAt(0);
            if (s != '+') {
                break;
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of attempts you want: ");
        int k = sc.nextInt();
        game(k);
        sc.close();
    }
}

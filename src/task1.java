import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ticket = scanner.nextInt();
        System.out.println(checkWin(ticket));
    }

    public static boolean checkWin(int numberTicket) {
        int length = String.valueOf(numberTicket).length();

        int temp = numberTicket;
        int[] mas = new int[length];

        for (int i = length - 1; i > -1; i--) {
            mas[i] = temp % 10;
            temp /= 10;
        }

        int n = mas.length;

        int[] firstHalf = new int[(n + 1) / 2];
        int[] secondHalf = new int[n - firstHalf.length];

        for (int i = 0; i < n; i++) {
            if (i < firstHalf.length) {
                firstHalf[i] = mas[i];
            } else {
                secondHalf[i - firstHalf.length] = mas[i];
            }
        }

        int firstSum = 0;
        int secondSum = 0;

        for (int i = 0; i < firstHalf.length; i++) {
            firstSum += firstHalf[i];
        }

        for (int i = 0; i < secondHalf.length; i++) {
            secondSum += secondHalf[i];
        }

        if (firstSum == secondSum) {
            return true;
        } else {
            return false;
        }

    }
}


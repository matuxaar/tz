import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int ticket = scanner.nextInt();
            System.out.println(checkWin(ticket));
        }
    }

    public static boolean checkWin(int numberTicket) {
        if (numberTicket % 2 == 0) {
            ArrayList<Integer> arrayList = new ArrayList<>();

            while (numberTicket != 0) {
                arrayList.add(numberTicket % 10);
                numberTicket /= 10;
            }

            int n = arrayList.size();

            int[] firstHalf = new int[(n + 1) / 2];
            int[] secondHalf = new int[n - firstHalf.length];

            for (int i = 0; i < n; i++) {
                if (i < firstHalf.length) {
                    firstHalf[i] = arrayList.get(i);
                } else {
                    secondHalf[i - firstHalf.length] = arrayList.get(i);
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
        } else {
            return false;
        }

    }
}


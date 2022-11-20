import java.util.ArrayList;
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
        int firstSum = 0;
        int secondSum = 0;
        if (numberTicket % 2 == 0) {
            ArrayList<Integer> arrayList = new ArrayList<>();

            while (numberTicket != 0) {
                arrayList.add(numberTicket % 10);
                numberTicket /= 10;
            }

            int n = arrayList.size();

            for (int i = 0; i < n; i++) {
                if (i < (n + 1) / 2) {
                    firstSum += arrayList.get(i);
                } else {
                    secondSum += arrayList.get(i);
                }
            }

            return firstSum == secondSum;
        }
        return false;
    }
}


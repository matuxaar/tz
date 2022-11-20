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
        int firstLength = 0;
        int secondLength = 0;
        if (numberTicket % 2 == 0) {
            ArrayList<Integer> arrayList = new ArrayList<>();


            while (numberTicket != 0) {
                arrayList.add(numberTicket % 10);
                numberTicket /= 10;
            }

            int n = arrayList.size();


            for (int i = 0; i < n; i++) {
                if (i < (arrayList.size() + 1) / 2) {
                    firstLength += arrayList.get(i);
                } else {
                    secondLength += arrayList.get(i);
                }
            }

            return firstLength == secondLength;
        }
        return false;
    }
}


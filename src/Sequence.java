import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max=0;
        int number = scanner.nextInt();

        while (scanner.hasNextInt()) {
            int number2 = scanner.nextInt();
            if (number2%4==0 && number2 > max) {
                max = number2;
            }
        }
        System.out.println(max);
    }
}
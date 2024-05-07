import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class NumberOperations {

    public static int _min(String filename) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filename));
        int min = Integer.MAX_VALUE;
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num <= min) {
                min = num;
            }
        }
        scanner.close();
        return min;
    }

    public static int _max(String filename) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filename));
        int max = Integer.MIN_VALUE;
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num >= max) {
                max = num;
            }
        }
        scanner.close();
        return max;
    }

    public static int _sum(String filename) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filename));
        int sum = 0;
        try {
        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
        }
        } catch (ArithmeticException e){
            throw new ArithmeticException();
        }
        scanner.close();
        return sum;
    }

    public static int _mult(String filename) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filename));
        int mult = 1;
        while (scanner.hasNextInt()) {
            mult *= scanner.nextInt();
        }
        scanner.close();
        return mult;
    }

    public static void main(String[] args) {
        String filename = "demo/src/test/resources/tests/test1.txt";

        try {
            System.out.println("Минимальное: " + _min(filename));
            System.out.println("Максимальное: " + _max(filename));
            System.out.println("Сумма: " + _sum(filename));
            System.out.println("Произведение: " + _mult(filename));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        }
    }
}


import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczby: ");

        String[] numbers = scanner.nextLine().split(" ");

        long startTime = System.nanoTime();
        for(int i = 0; i < numbers.length; i++){
            int localSum = 0;
            for(int x = i; x < numbers.length; x++){
                localSum += Integer.parseInt(numbers[x]);
            }
            System.out.println(localSum);
        }
        long stopTime = System.nanoTime();
        System.out.println("1 algorytm: " + (stopTime - startTime));
        ///////////////////////////////////////////


        long startTime1 = System.nanoTime();
        int sum = 0;
        int currentSum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += Integer.parseInt(numbers[i]);
        }
        System.out.println(sum);
        for(int i = 1; i < numbers.length; i++){
            currentSum += Integer.parseInt(numbers[i-1]);
            System.out.println(sum - currentSum);
        }
        long stopTime1 = System.nanoTime();
        System.out.println("2 algorytm: " + (stopTime1 - startTime1));
        ;

    }
}

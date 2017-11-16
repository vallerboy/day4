import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczby: ");

        String[] numbers = scanner.nextLine().split(" ");


        for(int i = 0; i < numbers.length; i++){
            int localSum = 0;
            for(int x = i; x < numbers.length; x++){
                localSum += Integer.parseInt(numbers[x]);
            }
            System.out.println(localSum);
        }




    }
}

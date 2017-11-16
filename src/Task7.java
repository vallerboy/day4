import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczby: ");
        String[] numbers = scanner.nextLine().split(" ");


        int localCounter = 0;
        for (int i = 0; i < numbers.length; i++) {
            localCounter = 0;
            for (int i1 = i; i1 < numbers.length; i1++) {
                 if(numbers[i].equals(numbers[i1])){
                     localCounter++;
                 }
            }
            if(localCounter >= 3){
                System.out.println("TAK");
                break;
            }
        }
    }
}

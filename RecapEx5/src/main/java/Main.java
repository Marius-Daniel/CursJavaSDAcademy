import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidInputException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 200 - 800 who is multiple of 3 ");
        int input = scanner.nextInt();
        while (input != 0){
            int number = scanner.nextInt();
            if(((number > 200 && number < 800)) && (digitSum(number)%3 != 0)){
                throw new InvalidInputException("Fii mai atent data viitoare");
            }
            input = scanner.nextInt();
        }
    }

    public static int digitSum(int number){
        int sum = 0;
        while (number != 0 ) {
            int digit = number % 10;
            sum = sum+digit;
            number = number / 10;
        }
        return sum;
    }
}

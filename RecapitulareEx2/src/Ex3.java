import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            List<Integer> numberList = new LinkedList<>();

            while(number!= 0) {
                number = scanner.nextInt();
                numberList.add(number);
            }

        for (int i = 0; i < numberList.size(); i++) {
            if (numberList.get(i) % 2 == 0) {
                numberList.remove(numberList.get(i));
            }
        }
        System.out.println("Lista para");
        for (Integer num : numberList) {
            System.out.println(num);
        }
    }
}

import java.util.*;


public class Ex2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        List<Integer> numberList = new LinkedList<Integer>();

        while(number != 0) {
            number = scanner.nextInt();
            numberList.add(number);
        }

        for (int i = 0; i < numberList.size(); i++) {
            if (i % 2 != 0) {
                numberList.remove(numberList.get(i));
            }
        }

        System.out.println("List cu numerele de pe poitia impara");
        Iterator<Integer> iterator = numberList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}


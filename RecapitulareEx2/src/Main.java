public class Main {

    public static void main(String[] args) {

        int []  numbers = {1,2,3,3,4,5,5,8,9,10};
        int countDuplicate = 0;
        for (int i = 0 ; i <numbers.length-1; i++){
            if(numbers[i] == numbers[i +1]){
                countDuplicate++;
            }
        }
        System.out.println(countDuplicate);
    }
}

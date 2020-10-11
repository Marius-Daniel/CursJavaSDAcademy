public class Main {

    public static void main(String[] args) {

        int [] numbers2 = {1,3,2,2,4,5,8,5,10};

        int []  numbers = {1,2,3,3,4,5,5,8,9,10,10};
        int countDuplicate = 0;
        int [] pass ={};

        for (int i = 0 ; i <numbers2.length-1; i++){
            pass[0] = numbers2[i];
            for(int j = 0 ; j < i; j++){
                if(numbers2[i] == numbers2[j]){
                    countDuplicate++;
                }
            }
        }
        System.out.println(countDuplicate);


        for (int i = 0 ; i <numbers2.length-1; i++) {


        }


    }
}

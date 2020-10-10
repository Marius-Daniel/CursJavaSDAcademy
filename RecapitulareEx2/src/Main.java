public class Main {

    public static void main(String[] args) {

        int [] numbers2 = {1,3,2,2,4,5,8,5,10};

        int []  numbers = {1,2,3,3,4,5,5,8,9,10,10};
        int countDuplicate = 0;

        // complexitatea este de O(n) deoarece este necesat sa trecem prin toate elementele array-ului ca sa putem compara elementele;
        // si apoi sa facem o operatie de comparatie ptr fiecare;
        for (int i = 0 ; i <numbers2.length-1; i++){
            for(int j = 0 ; j < i; j++){
                if(numbers2[i] == numbers2[j]){
                    countDuplicate++;
                }
            }
        }
        System.out.println(countDuplicate);
    }
}

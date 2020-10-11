public class Suma {

    public static void main(String[] args) {

        int number = 0;
        int suma  = 0;

        while (number <= 1105) {
            suma += number;
            number++;
        }
        System.out.println(suma);
    }
}

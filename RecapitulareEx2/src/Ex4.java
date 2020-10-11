public class Ex4 {

    public static void main(String[] args) {
        char [] chars = {'a','n','a'};
        char [] invertChars = new char[chars.length];
        System.out.println(chars);
        String result = "";

        int cursor = 0;
        for(int i = chars.length -1 ; i >= 0; i--){
            invertChars[cursor] = chars[i];
            cursor++;
        }

        System.out.println(invertChars); // verificare

        for(int i = 0; i <chars.length-1; i++){
            for(int j = 0; j < invertChars.length - 1; j++){
                if(chars[i] != invertChars[i]){
                  result = "The array is not a palindrome";
                }else result = "The array is a palindrome";
            }
        }
        System.out.println(result);
    }
}

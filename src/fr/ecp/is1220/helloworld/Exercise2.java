package fr.ecp.is1220.helloworld;

public class Exercise2 {

    public static boolean palindrome(String input){
        String[] tester = input.toLowerCase().split("");

        for(int i=0 ; i < (tester.length / 2) ; i++) {
            if(!tester[i].equals(tester[tester.length - i - 1])) {
                return false;
            }
        }
            return true;
    }


    public static void main(String[] args) {
        String input = "Saippuakivikauppias";
        /*
         * https://largest.org/culture/longest-known-palindromes/#:~:text=%2010%20Longest%20Known%20Palindromes%20%201%20Rotavator.,winemaking%2C%20since%20it%20reduces%20the%20acidity...%20More%20
         */
        System.out.println(palindrome(input));
    }
}

package fr.ecp.is1220.helloworld;

import java.util.Scanner;

public class Helloworld2 {

    public static void main(String[] args) {
        Message();
    }

    public static void Message(){

        Scanner s = new Scanner(System.in);
        System.out.println("Hello Madam, Sir. Pleaser enter here a word to display :");
        String input = s.nextLine();
        System.out.println("The word you wanted to be printed is : " + input);
    }

}
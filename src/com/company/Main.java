package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// . Un numar palindrom este un număr care este egal cu simetricul său (ex: 121, 10001, 22344322, 88, 7 etc.).
        // Similar, un șir de caractere este palindrom dacă este identic cu simetricul său (ex: „abba“, „ana“, „noon“,
        // „radar“, „madam“). Implementează o metoda (i.e. isPalindromIgnoreCase(String)) care determină dacă un șir de
        // caractere primit ca parametru este sau nu palindrom, fără a se ține cont de tipul literelor (i.e. majuscule vs. minuscule). Testează metoda în main pentru cât mai multe cazuri de excepție.
        System.out.println("The word is a palindrom: "+isPalindromIgnoreCase(" "));
        System.out.println("The word elefant is a palindrom: "+isPalindromIgnoreCase("elefant"));
        System.out.println("The word madam is a palindrom: "+isPalindromIgnoreCase("madam"));
        System.out.println("The word 12321 is a palindrom: "+isPalindromIgnoreCase("12321"));
        System.out.println("The word 12381 is a palindrom: "+isPalindromIgnoreCase("12381"));

        Scanner scan=new Scanner(System.in);
        System.out.println("Introduceti cuvantul:");
        String word=scan.nextLine();
        System.out.println("The word "+word+" is a palindrom: "+ isPalindromIgnoreCase(word));
    }
    public static boolean isPalindromIgnoreCase(String word){
        String lowerCaseWord=word.toLowerCase();

        //Reverse the string using the StringBuilder class
        StringBuilder sb=new StringBuilder(lowerCaseWord);
        String reverseWord=sb.reverse().toString();

        if(lowerCaseWord.equalsIgnoreCase(reverseWord)){
            return true;
        }else
            return false;

    }
}

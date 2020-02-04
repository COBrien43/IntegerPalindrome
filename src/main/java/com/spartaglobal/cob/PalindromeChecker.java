package com.spartaglobal.cob;

public class PalindromeChecker {
    String reversedPalindrome = "";

    public void checksPalindrome(int Palindrome){
        String str1 = Integer.toString(Palindrome);
        for(int i = str1.length() - 1; i >= 0; i--){
            reversedPalindrome = reversedPalindrome + str1.charAt(i);
        }

        if(str1.equals(reversedPalindrome)){
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is not a palindrome");
        }
    }
}

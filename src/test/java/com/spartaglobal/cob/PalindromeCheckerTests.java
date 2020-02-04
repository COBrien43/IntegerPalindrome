package com.spartaglobal.cob;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTests {

    @Test
    public void testToCheckAPalindromeReturnsTrue(){
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        palindromeChecker.checksPalindrome(1001);
    }

    @Test
    void testToCheckAPalindromeReturnsFalse(){
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        palindromeChecker.checksPalindrome(1234);
    }
}

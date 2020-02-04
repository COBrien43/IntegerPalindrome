package com.spartaglobal.cob;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTests {

    @Test
    public void testToCheckAPalindromeReturnsTrue(){
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        palindromeChecker.checksPalindrome(1001);
        assertTrue(true, palindromeChecker.reversedPalindrome);
    }

    @Test
    void testToCheckAPalindromeReturnsFalse(){
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        palindromeChecker.checksPalindrome(1234);
        assertFalse(false, palindromeChecker.reversedPalindrome);
    }

    @Test
    void testToCheckZeroIsAPalindrome(){
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        palindromeChecker.checksPalindrome(0);
        assertTrue(true, palindromeChecker.reversedPalindrome);
    }

    @Test
    void testToCheckMinusNumbersAreFalse(){
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        palindromeChecker.checksPalindrome(-1001);
        assertFalse(false, palindromeChecker.reversedPalindrome);
    }
}

package org.akash.java.palindorme.checker;

import org.akash.java.palindrome.checker.PalindromeChecker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {
    @Test
    public void testPalindrome() {
        assertTrue(PalindromeChecker.isStringPalindrome("madam"));
        assertTrue(PalindromeChecker.isStringPalindrome("racecar"));
        assertTrue(PalindromeChecker.isStringPalindrome("level"));
        assertTrue(PalindromeChecker.isStringPalindrome("a"));
        assertTrue(PalindromeChecker.isStringPalindrome(""));
    }

    @Test
    public void testNonPalindrome() {
        assertFalse(PalindromeChecker.isStringPalindrome("hello"));
        assertFalse(PalindromeChecker.isStringPalindrome("world"));
        assertFalse(PalindromeChecker.isStringPalindrome("java"));
        assertFalse(PalindromeChecker.isStringPalindrome("palindrome"));
    }

    @Test
    public void testMixedCasePalindrome() {
        assertTrue(PalindromeChecker.isStringPalindrome("Madam".toLowerCase()));
        assertTrue(PalindromeChecker.isStringPalindrome("RaceCar".toLowerCase()));
        assertTrue(PalindromeChecker.isStringPalindrome("Level".toLowerCase()));
    }

    @Test
    public void testPalindromeWithSpaces() {
        assertTrue(PalindromeChecker.isStringPalindrome("a man a plan a canal panama".replaceAll("\\s", "")));
    }
}

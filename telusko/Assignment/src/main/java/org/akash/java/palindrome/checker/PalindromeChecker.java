package org.akash.java.palindrome.checker;

public class PalindromeChecker {
    public static boolean isStringPalindrome(String string){
        return new StringBuilder(string).reverse().toString().equals(string);
    }
}

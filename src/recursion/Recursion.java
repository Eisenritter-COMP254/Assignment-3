package recursion;
public class Recursion {
    // Exercise 1 Recursive Multiplication
    static int RecMult(int m, int n){
        if(m == 0 || n == 0) return 0;      // Return 0 if any of the multiplier is 0
        if(m<0 && n>0) return m-RecMult(-m,n-1);    // If m is negative and n is positive
        if(m>0 && n<0) return -m+RecMult(m,n+1);    // If m is positive and n is negative
        return Math.abs(m)+Math.abs(RecMult(m,Math.abs(n)-1));  // If both multiplier have the same signs
    }
    // Exercise 2 Recursive Palindrome
    static boolean RecPalindrome(String s ) {
        // Run first check
        boolean isPalin = (s.substring(0, 1).equals(s.substring(s.length()-1)));
        // Return first check if the length of the string is less than 2
        if (s.length()<=2){
            return (isPalin);
        }
        // If the length of string is more than to, continue running the check, anytime a false is returned,
        // the future will also return false regardless until the string is truncated to a length under two characters.
        else {
        s = s.substring(1, s.length() - 1);
        return isPalin & RecPalindrome(s);}
    }}

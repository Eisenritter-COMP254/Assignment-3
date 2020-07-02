package recursion;
public class Test{
    public static void main(String[] args) {
        Test2();
    }

    // Test cases for multiplication
    static void Test1(){
        // Positive and negative cases
        int result1 = Recursion.RecMult(5,6);
        int result2 = Recursion.RecMult(5,-6);
        int result3 = Recursion.RecMult(-5,6);
        int result4 = Recursion.RecMult(-5,-6);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }

    // Test Cases for Palindrome
    static void Test2(){
        String test = "abcdeedcba"; // 10 char string, even palindrome
        String test2 = "cookies";   // 7 char string, not palindrome
        String test3 = "abcdedcba"; // 9 char string, palindrome
        String test4 = "abcdefdcba";    // 10 char string, not palindrome
        String test5 = "racecar";   // 7 char string, palindrome
        String test6="gohangasalamiimalasagnahog";  // n char string, palindrome
        String test7="a";   // 1 char string, palindrome
        String test8="aa";  // 2 char string, palindrome
        String test9="ab";  // 2 char string, not palindrome

        // String.substring Test
        System.out.println(test6);
        System.out.println(test6.substring(0,1));
        System.out.println(test6.substring(test.length()-1));
        System.out.println(test6.substring(1,test.length()-1));

        // Test Cases
        System.out.println(Recursion.RecPalindrome(test)?test+" is Palindrome":test+" isn't Palindrome");
        System.out.println(Recursion.RecPalindrome(test2)?test2+" is Palindrome":test2+" isn't Palindrome");
        System.out.println(Recursion.RecPalindrome(test3)?test3+" is Palindrome":test3+" isn't Palindrome");
        System.out.println(Recursion.RecPalindrome(test4)?test4+" is Palindrome":test4+" isn't Palindrome");
        System.out.println(Recursion.RecPalindrome(test5)?test5+" is Palindrome":test5+" isn't Palindrome");
        System.out.println(Recursion.RecPalindrome(test6)?test6+" is Palindrome":test6+" isn't Palindrome");
        System.out.println(Recursion.RecPalindrome(test7)?test7+" is Palindrome":test7+" isn't Palindrome");
        System.out.println(Recursion.RecPalindrome(test8)?test8+ " is Palindrome":test8+" isn't Palindrome");
        System.out.println(Recursion.RecPalindrome(test9)?test9+ " is Palindrome":test9+" isn't Palindrome");
    }
}

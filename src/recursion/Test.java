package recursion;
public class Test{
    public static void main(String[] args) {
        Test2();
    }

    static void Test1(){
        int result1 = Recursion.RecMult(5,6);
        int result2 = Recursion.RecMult(5,-6);
        int result3 = Recursion.RecMult(-5,6);
        int result4 = Recursion.RecMult(-5,-6);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }

    static void Test2(){
        String test = "abcdeedcba";
        String test2 = "cookies";
        String test3 = "abcdedcba";
        String test4 = "abcdefdcba";
        String test5 = "racecar";
        String test6="gohangasalamiimalasagnahog";
        String test7="a";
        String test8="aa";
        String test9="ab";


        System.out.println(test6);
        System.out.println(test6.substring(0,1));
        System.out.println(test6.substring(test.length()-1));
        System.out.println(test6.substring(1,test.length()-1));

        System.out.println(Recursion.RecPalindrome(test)?"is Palindrome":"isn't Palindrome");
        System.out.println(Recursion.RecPalindrome(test2)?"is Palindrome":"isn't Palindrome");
        System.out.println(Recursion.RecPalindrome(test3)?"is Palindrome":"isn't Palindrome");
        System.out.println(Recursion.RecPalindrome(test4)?"is Palindrome":"isn't Palindrome");
        System.out.println(Recursion.RecPalindrome(test5)?"is Palindrome":"isn't Palindrome");
        System.out.println(Recursion.RecPalindrome(test6)?"is Palindrome":"isn't Palindrome");
        System.out.println(Recursion.RecPalindrome(test7)?"is Palindrome":"isn't Palindrome");
        System.out.println(Recursion.RecPalindrome(test8)?"is Palindrome":"isn't Palindrome");
        System.out.println(Recursion.RecPalindrome(test9)?"is Palindrome":"isn't Palindrome");
    }
}

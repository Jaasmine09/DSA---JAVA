
public class StringPalindrome {

    public static Boolean isPalindrome(String str){
        for(int i = 0; i < str.length()/2; i++){
            int n = str.length();
            if( str.charAt(i) != str.charAt(n-1-i)){
                System.out.println("Not a Palindrome");
               return false;
            }
        }
        System.out.println("Palindrome!");
        return true;
    }
    public static void main(String args[]){
        String str = "raceca";
        isPalindrome(str);
    }
}

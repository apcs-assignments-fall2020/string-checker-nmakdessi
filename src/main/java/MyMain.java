import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        int counter = 0;
        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'b' || str.charAt(i) == 'c'){
                counter++;
            }
        }
        return counter;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        boolean lowerthe = str.contains("the");
        boolean upperthe = str.contains("The");
        if(upperthe == true || lowerthe == true){
            return true;
        }
        else{
            return false;
        }
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        for(int i = 0; i < (str.length()-1)/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string");
        String string = scan.nextLine();
        System.out.println("Your string contains" + (countABC(string)) + "a's, b's, or c's");
        if(containsThe(string) == true || containsThe(string) == true){
            System.out.println("Your srting DOES contain the or The");

        }
        else{
            System.out.println("Your srting DOESNT contain the or The");
        }
        
        if(isPalindrome(string) == true){
            System.out.println("Your string IS a palindrome");
        }
        else{
            System.out.println("Your string IS NOT a palindrome");
        }
      

        
        scan.close();
    }
    
}

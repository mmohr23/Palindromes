import java.util.Scanner;
public class Palindromes
{
    /**
     * This program lets the user input some text and
     * prints out whether or not that text is a palindrome.
     */
    public static void main(String[] args)
    {
        //clarify scanner. 
        Scanner scanner = new Scanner(System.in);
        
       // Create user input and let user know whether their word is a palindrome or not! 
        System.out.println("Type in your text:");
        
        //collects the user input and stores it in a variable. 
        String text = scanner.nextLine();
        
        //calls the isPalindrome system to run and releases a 
        //different statement depending on results. Is palindrome is true,
        //is false. 
        
        if(isPalindrome(text))
        {
            System.out.println("Your word is a palindrome!");
            //if true, prints this statement. 
        }
        else
        {
            System.out.println("Not a palindrome :(");
            //if false, prints this statement. 
        }
        
    }
    
    /**
     * This method determines if a String is a palindrome,
     * which means it is the same forwards and backwards.
     * 
     * @param text The text we want to determine if it is a palindrome.
     * @return A boolean of whether or not it was a palindrome.
     */
    public static boolean isPalindrome(String text)
    {
       // Your code goes here!
       
       //if the text equals the reversed text, then it is a palindrome.
       
       if(text.equals(reverse(text)))
       //calls for the reverse system to run and return its value. 
       {
           return true;
       }
       else
       {
           return false;
       }
       //else, it is not a palindrome. 
       
    }
    
    /**
     * This method reverses a String.
     * 
     * @param text The string to reverse.
     * @return The new reversed String.
     */
    public static String reverse(String text)
    {
        // Your code goes here!
        
        //code will reverse the text to compare in above system. 
        
        //create empty string for reversed text to go. 
        String reversed = "";
        
        //goes backwards. 
        for(int i = 0; i < text.length(); i++)
        {
            String letter = text.substring(i, i+1);
            
            //adds letter to the reversed text string. 
            reversed = letter + reversed;
        }
        System.out.println(reversed);
        return reversed;
    }

}
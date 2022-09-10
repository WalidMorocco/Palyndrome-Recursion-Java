package mypackage;

import java.util.Scanner;

public class PalindromeCheck {

	//Recursive function that checks 
    //whether the string is palindrome or not
    static boolean Pal(String str, int s, int e) 
    { 
        if (s == e)    // If there is only one character 
            return true;  
        // If first and last characters do not match 
        if ((str.charAt(s)) != (str.charAt(e))) 
            return false;   
        // If there are multiple characters, check if 
        // middle substring is also palindrome or not. 
        if (s < e + 1) 
            return Pal(str, s + 1, e - 1);   
        return true; 
    }   
    

    

    
    // Function to remove the punctioations and space from the input
    static String removePunctuations(String source) {
    	source = source.replaceAll("\\p{Punct}", "");
    	source = source.replaceAll("\\s+","");
        return source;
    }
    
     
    public static void main(String args[]) 
    { 
        //Take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String strInput = sc.nextLine();
        
        //Check whether palindrome or not
        if (Pal(strInput, 0, strInput.length())) 
            System.out.println(strInput+" is palindrome"); 
        else
            System.out.println(strInput+ " is not a palindrome"); 
    }   

}

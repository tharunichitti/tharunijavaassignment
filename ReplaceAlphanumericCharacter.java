package javaAssignment;


//An alphanumeric string is a string that contains only alphabets from a-z, A-Z and some numbers from 0-9. 
public class ReplaceAlphanumericCharacter {
	static String getDigits(String str) 
    { 
        // Replace each non-numeric number with a space
        str = str.replaceAll("[^\\d]", " "); 
        // Remove leading and trailing spaces
        str = str.trim(); 
        // Replace consecutive spaces with a single space
        str = str.replaceAll(" +", " "); 
  
        return str; 
    } 
  
    public static void main(String[] args) 
    { 
        String str = "789Hi   hello5"; 
        System.out.print(getDigits(str)); 
    } 
}

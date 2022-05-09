package javaAssignment;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		String str="yellow";
		for(char i:str.toCharArray())
		{
			if(str.indexOf(i)==str.lastIndexOf(i)) 
			{
				System.out.println("1st non-repeating character is:"+i);
			}
			
		}

	}

}

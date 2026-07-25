/**
 * This Class converts ASCII to Binary Conversion,
 * Binary to ASCII conversion,
 * palindrome checking.
 *
 * @author seand
 */


import java.util.*; //import for functionality, ensure arrays (line 43) can be resolved

/**
 * Converts ASCII text into eight bit binary representation
 * 
 * @param text the ASCII text to convert
 * @return the binary representation of the supplied text
 */


public class InputProcessor 
{
	public static String asciiToBinary(String text) 
	{

		byte[] bytes = text.getBytes(); 
		StringBuilder binaryResult = new StringBuilder(); 
		
		//Converts each byte into eight binary digits
		for (byte currentByte : bytes)
		{ 
			int value = currentByte; 
			
			for(int i = 0; i < 8; i++) 
			{ 
				binaryResult.append((value & 128) == 0 ? 0 : 1);   
				value <<= 1; 
			}
		}
		
		return binaryResult.toString(); 
	}
	
	/**
	 * Converts binary string into ASCII text
	 * 
	 * @param text the binary text to convert
	 * @return corresponding ASCII text
	 */
	
	public static String binaryToAscii(String text) 
	{
		
		if(text.isEmpty()) 
		{
			return "";
		}
		
		StringBuilder asciiResult = new StringBuilder();

		//Splits the input into eight-bit groups and converts them
		Arrays.stream(text.split("(?<=\\G.{8})"))
			.forEach(binaryCharacter -> 
				asciiResult.append(
						(char) Integer.parseInt(binaryCharacter, 2)
						)
				);
		
		return asciiResult.toString();
	}
	
	
	/**
	 * Checks whether text reads the same forwards and backwards
	 * 
	 * @param text the text to examine
	 * @return true if the text is a palindrome; otherwise return false
	 */
	
	public static boolean isPalindrome(String text) 
	{

		int front = 0;
		int back = text.length() - 1; 

		//Compare characters from opposite ends of the string
		while (back > front) 
		{ 
			char frontCharacter = text.charAt(front++); 
			char backCharacter = text.charAt(back--);
			
			if(frontCharacter != backCharacter) 
			{
				return false;  
			}
		}
		
		return true; 
	}
		
}
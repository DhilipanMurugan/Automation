package countCharacters;

//import java.util.Scanner;

public class Countchar {

	String firstname;
	String lastname;
	
	/*	void countDigits()
	{
		 int countCharcters=0;
		 for (int index=0; index<name.length(); index++) 
			     ++countCharcters;
	         
		 System.out.println("Number of characters in the string  " + name  + " =  "+ countCharcters);
	}*/

	
void countWords(String firstname, String lastname) {
		
	if(firstname.length()<lastname.length()) {
			
		System.out.println(lastname + " is the largest");
		
		System.out.println( lastname + " is " + (firstname.length()-lastname.length()) + "characters greater than " + firstname);
		
	}
		
	else if(firstname.length()==lastname.length()) {
			
		System.out.println("both are equal");
		
	 }
		
		else
			
		System.out.println(firstname + " is the largest");
		
		System.out.println( firstname + " is " + (firstname.length()-lastname.length())+" " + "characters greater than " + lastname);

     }	
	
   }

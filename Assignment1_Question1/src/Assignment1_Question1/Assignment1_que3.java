//The program calculates the number of vowels, consonants and spaces in a given sentence.


package Assignment1_Question1;

public class Assignment1_que3
{
	//main function
	public static void main(String[] args)
	{   
		String text = "To be or not to be, that is the question;"         		//The variable text stores the sentence on which operations needs to be performed.
		+"Whether `tis nobler in the mind to suffer"
		+" the slings and arrows of outrageous fortune,"
		+" or to take arms against a sea of troubles,"
		+" and by opposing end them?";

		text= text.toLowerCase();                   //Sentence has been converted to lowercase to reduce runtime and prevent double checking of same letter for both cases
		int spaces = 0;								//initialisation of number of spaces to 0	
		int vowels = 0;								//initialisation of number of vowels to 0						
		char alphabet;                              //alphabet is denoting to any alphabet/space in sentence under test
		
		int letters = text.length();				//count the number of characters in the sentence	
		System.out.print("The number of letters in the sentence is :" + letters);


		for (int i=0; i<letters; i++)
			{	
				alphabet = text.charAt(i);			// The loop checks for each alphabet or space and count it as vowel or spaces.	
				if ( alphabet ==' ') 
					{
						spaces++;
					}
				else if(alphabet =='a' || alphabet== 'e' || alphabet=='i' || alphabet=='o' || alphabet=='u') 
					{
						vowels++;
					}
		
			}

		
		//The number of consonants is calculated by reducing number of spaces and vowels from the total letters in the sentence.
		//The desired output is printed on screen.
		System.out.println("\nThe text contained vowels: " + vowels + "\n" + "consonants is: "+ (letters-vowels-spaces) +
		"\n"+ "spaces: " + spaces);
	}

} 



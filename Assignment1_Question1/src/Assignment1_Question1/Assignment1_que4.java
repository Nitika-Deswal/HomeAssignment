/*The program extracts words from the sentence mentioned. The program first removes commas and semicolon from sentence so that only words are there in sentence.
The program extracts words from the sentence and removes the duplicates using HashSet and sorts the words in alphabetical order. */

/* 
Variable definition:
'words' : each word extracted from the sentence.
'text' : the sentence 
'letters' : Length of sentence
'alphabet': Each Character in the sentence/word
 
 */

package Assignment1_Question1;
import java.util.*;

public class Assignment1_que4 {
	
	static List<String> words= new ArrayList<String>();                //global variable

	//Main function
	public static void main(String[] args) {
		
		
		String text = "To be or not to be, that is the question;"         		//The variable text stores the sentence on which operations needs to be performed.
				+"Whether `tis nobler in the mind to suffer"
				+" the slings and arrows of outrageous fortune,"
				+" or to take arms against a sea of troubles,"
				+" and by opposing end them?";
		
		text=text.replaceAll(",","");					//Remove all commas from sentence to leave only words for sorting in the sentence.
		text=text.replaceAll(";"," ");					//Replace semicolon with space so that two words connected by ; are separated by space
		
		text= text.toLowerCase();
		int letters = text.length();				//count the number of characters in sentences	
		         
		 words = WordSplitter(text, letters) ;              //Function that splits the sentence into words and returns the list of words
		 System.out.println("Array of splitted sentence is: " + words);
		 
		 
		 String[] SortedWordsArrray= bubbleSort(words);        //Function call that sorts the list
		 System.out.println("\nThe list of words after sorting are below: ");
		 for (String word: SortedWordsArrray)					 //prints the sorted words 
		 {               
			 System.out.println(word);
		 }
		 
	}
	
	
	//Function that splits the words in the sentence and stores it in list
	public static List<String> WordSplitter(String text, int letters) 
	{
					
		char alphabet;										//Each character in the sentence
		String concatString=""; 							//variable to store each word		
					
		for (int i=0; i<letters; i++)						
			{	
					
				alphabet = text.charAt(i);					
				if ( alphabet !=' ') 						//If the character is not space, the loop concatenate it to form the word	
					{
						concatString += alphabet; 
					}
				else
					{
						words.add(concatString);				//If the character is space, the word is added to the list and loop runs again to reach the next character
						concatString= "";
						continue;
					}
				
			}
		
		words.add(concatString);							//add the last word to the list
		return (removeDuplicates(words));					//Return the list of words after removing duplicates
				
	}
			
	
	//Function that removes duplicates from list
	public static List<String> removeDuplicates(List<String> WordList) 
	{
		HashSet<String> noduplicateset=new HashSet<String>();
		noduplicateset.addAll(WordList);							//List with duplicates is added to hash set
		WordList.clear();											//The List is cleared to store new values
		WordList.addAll(noduplicateset);							//The hashSet is added back to List

		return WordList;											//List of no duplicate words is returned
	}
	
	
	//Function that performs sorting on List of words
	public static String[] bubbleSort(List<String> words) 
	{
		String temp;
		int n= words.size();                                  //stores the length of list
		String[] arr1 = words.toArray(new String[n]);       //stores list into array 
			
		for (int i=0; i<n-1; i++) 							//sort the words in array
			{                           
				for (int j=0; j<n-i-1; j++) 
					{
						if (arr1[j].compareTo(arr1[j+1])>0) 
							{
								temp = arr1[j];
								arr1[j]= arr1[j+1];
								arr1[j+1]=temp;
							}
					}
			}
			
		return arr1;                                         //return the sorted array
	}
	
		
}
	



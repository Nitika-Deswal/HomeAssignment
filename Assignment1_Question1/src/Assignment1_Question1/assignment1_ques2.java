/*The program checks if the number , between 2 to 50, is prime and prints it on console screen if it turns out to be prime.
In order to reduce the time complexity, number is divided only till the square root.
*/

package Assignment1_Question1;

public class assignment1_ques2 
{
	
	//Main function. 
	public static void main(String[] args)  //It calls the function PrimeCheck and prints the number on output screen if it is prime.
	{
		int nValues = 50;
	
		for(int i = 2; i <= nValues; i++)          //the loop iterate from 2 to 50 and checks if it is prime.
			{	
				if (PrimeCheck(i)) 
				{
					System.out.println(i);			//If the number is prime, it is printed on Output screen.
				}
			}
	}	
	
	
	
	static boolean PrimeCheck(int i)      //function to check if the number is prime. It returns true if number is prime else it returns false.
	{
		for (int j=2; j<=Math.sqrt(i); j++)        //The number is divided only till square root of its own to optimize time complexity
		{
			if(i%j != 0)								
			{
				continue;						//If the number doesnot get divided by a number below it's square root, skip that iteration and continue to check for the other number till square root.		
			}
			return false;                       //In case the number is divided by any number below it's square root, the function returns false.
		}
		return true;                           //In case the number is not divided by any number below it's square root, it comes out from for loop and function returns true.
	}
}	


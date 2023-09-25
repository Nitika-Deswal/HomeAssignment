/*The program calculates volume of sun and earth by using values of radius given. Further, calculates the ratio of volume of sun to volume of Earth.*/

package Assignment1_Question1;

public class assingment1_que1 {

	public static void main(String[] args)
	{
		//variables to define parameters for calculating volume of Sun
		int diameter_Sun = 865000;
		float radius_Sun = 0.0f;
		double volume_Sun=0.0;
		
		//variables to define parameters for calculating volume of earth
		int diameter_earth = 7600;
		float radius_earth = 0.0f;
		double volume_earth =0.0;
		
		//variables to define ratio of volume of sun and volume of earth
		float ratio = 0.0f;
		
		//Calculating volume of Sun and print the output
		radius_Sun = diameter_Sun/2;
		volume_Sun = (4* Math.PI * Math.pow(radius_Sun, 3)/3);
		System.out.println("The volume of the sun with radius " + radius_Sun
		+ " miles is\n " + volume_Sun + " cubic miles\n ");
		
		//Calculating volume of Earth and print the output
		radius_earth = diameter_earth/2;
		volume_earth = (4* Math.PI * Math.pow(radius_earth, 3)/3);
		System.out.println("The volume of the earth with radius " + radius_earth
		+ " miles is\n " + volume_earth + " cubic miles\n ");
		
		//calculate ratio of volume of earth and sun. Print the output
		ratio = (float)(volume_Sun/volume_earth);
		System.out.println("The ratio of volume of earth and sun is " + ratio);
		
		}
}

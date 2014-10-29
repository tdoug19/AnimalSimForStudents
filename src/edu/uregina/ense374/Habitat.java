/**
 * 
 */
package edu.uregina.ense374;

/**
 * @author tdouglas
 *
 */
public class Habitat {
	
	public static int WORLDSIZE =10;
	public Location[][] world = new Location[WORLDSIZE][WORLDSIZE];

	
	/**
	 * Build the locations into the world;
	 */
	public Habitat()
	{
		//Create the Habitat
		for(int x = 0; x< Habitat.WORLDSIZE; ++x)
		{
			for(int y=0; y < Habitat.WORLDSIZE; ++y)
			{
				world[x][y] = new Location();
				
			}
			
		}
	}
}

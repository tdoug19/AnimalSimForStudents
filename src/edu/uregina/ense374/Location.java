/**
 * 
 */
package edu.uregina.ense374;

/**
 * @author tdouglas
 *
 */
public class Location {
	
	private  Organism organism;
	
	
	public Location()
	{
		/** A location will have no reference to an organism at creation. */
		organism = null; //
	}
	
	
	/**
	 * Getter for organism
	 */
	public Organism getOrganism()
	{
		return organism;
	}


}

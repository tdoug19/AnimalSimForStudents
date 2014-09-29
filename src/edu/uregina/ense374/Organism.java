/**
 * 
 */
package edu.uregina.ense374;

import java.util.ArrayList;

/**
 * @author tdouglas
 *
 */
public class Organism {

	protected String name;
	//public Location2D currentLocation;
	protected  ArrayList<Organism> organismEats = new ArrayList<Organism>();
	
	public Organism(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	/**
	 * The organism may eat!
	 */
	public void eat()
	{
		
	}
	
	public ArrayList<Organism> getOrganismEats()
	{
		return organismEats;
	}
	

	public void speak()
	{
		System.out.println("I am a default organism");
	}

	
}

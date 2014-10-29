/**
 * Name: Organism
 * 
 * Description:  This class indicates an Organism.  An organism will 
 * 				perhaps live at a location in our world grid. 
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
	
	public void speak()
	{
		System.out.println("I am a : " + name );
	}
	
	
	public void sleep()
	{
		System.out.println("zzzzzzzzzzzzz");
	}

	public void move()
	{
		System.out.println("I want to move it, move it.");
	}
	
	
	
	public ArrayList<Organism> getOrganismEats()
	{
		return organismEats;
	}
	

	

	
}

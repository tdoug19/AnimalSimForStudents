/*
 * Bluejay.java
 * Description: This class is a Bluejay class.
 * default eat function add Tree class organismEats list
 * if eat function has eat parameter it add if that is Tree class and display "Bluejay eat <organism name>" 
 * else just display message "Bluejay cannot eat <organism name>" 
 * 
 */

package edu.uregina.ense374;

import java.util.ArrayList;

public class Bluejay extends Organism {
public Bluejay()
{
	super("Bluejay");
	
}
public void eat()
{
	Tree t = new Tree();
	
	organismEats.add(t);
}

public void eat(Organism eatOrganism)
{
	
	if(eatOrganism instanceof Tree){
		organismEats.add(eatOrganism);
		System.out.println(this.name + " eat " + eatOrganism.name );
	}
	else 
		System.out.println(this.name + " cannot eat " + eatOrganism.name );
}



}
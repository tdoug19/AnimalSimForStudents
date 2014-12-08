/*
 * Tree.java
 * Description: This class is a Tree class.
 * default eat function does not do any thing
 * if eat function has eat parameter it just display message "Tree cannot eat <organism name>" 
 * 
 */
package edu.uregina.ense374;

public class Tree extends Organism{
	public Tree()
	{
		super("Tree");
	}
	
	public void eat(Organism eatOrganism)
	{
		System.out.println(this.name + " cannot eat " + eatOrganism.name );
	}


}



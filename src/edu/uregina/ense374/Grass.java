/*
 * Grass.java
 * Description: This class is a Grass class.
 * default eat function does not do any thing
 * if eat function has eat parameter it just display message "Grass cannot eat <organism name>" 
 * 
 */

package edu.uregina.ense374;

public class Grass extends Organism{
public Grass(){
super("Grass");
}
public void eat(Organism eatOrganism)
{
	System.out.println(this.name + " cannot eat " + eatOrganism.name );
}


}

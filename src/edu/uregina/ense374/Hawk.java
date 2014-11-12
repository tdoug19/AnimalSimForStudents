/*
 * Hawk.java
 * Description: This class is a Hawk class.
 * default eat function add Mouse and Squirrel class organismEats list
 * if eat function has eat parameter it add if that is Mouse or Squirrel class and display "Hawk eat <organism name>" 
 * else just display message "Hawk cannot eat <organism name>" 
 * 
 */

/*
 * Additional note: This class has error because the Mouse and Squirrel class are not existing
 */


package edu.uregina.ense374;

public class Hawk extends Organism{
Hawk()
{
	super("Hawk");
	
}
public void eat()
{
	Mouse m = new Mouse();
	Squirrel s = new Squirrel();
	
	organismEats.add(m);
	organismEats.add(s);
	
}

public void eat(Organism eatOrganism)
{
	
	if(eatOrganism instanceof Mouse || eatOrganism instanceof Squirrel){
		organismEats.add(eatOrganism);
		System.out.println(this.name + " eat " + eatOrganism.name );
	}
	else 
		System.out.println(this.name + " cannot eat " + eatOrganism.name );
}

}

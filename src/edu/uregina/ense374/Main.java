package edu.uregina.ense374;

public class Main {

	public static void main(String[] args) {
		Habitat map = new Habitat();
		for(int x = 0; x< Habitat.WORLDSIZE; ++x)
		{
			for(int y=0; y < Habitat.WORLDSIZE; ++y)
			{
				Populate(map.world[x][y]);
			}
		}
		iterateWorld(map);
		return;
	}
	//used to travel through the world and notifies the user of any life found while on their travels
	public static void iterateWorld (Habitat map)
	{
		for (int i = 0; i < map.WORLDSIZE; i++)
		{
			for (int j = 0; j < 10; j ++)
			{
				if (map.world[i][j] != null)
				{
					System.out.println ("At location (" + i + ", " + j + "), " +
							map.world[i][j].getOrganism().getName() + " is here.");
					int c = randInt(1,4); //13,14 = no animal present
					switch (c) 
					{
						case 1: //Speak
							map.world[i][j].getOrganism().speak();
							break;
						case 2: //Move
							map.world[i][j].getOrganism().move();
							break;
						case 3: //Eat
							map.world[i][j].getOrganism().eat();
							break;
						case 4: //Sleep
							map.world[i][j].getOrganism().sleep();
							break;
					}
				}
				else
				{
					System.out.println ("At location (" + i + ", " + j + "), there is no life."); 
				}
				
			}
		}
	}
	public static Location Populate(Location creature)
	{
		int c = 0;
		c = randInt(1,14); //13,14 = no animal present
		switch (c) 
		{
			case 0: creature.organism = new Organism("Fish"); //This is a test animal if no organisms are in the file yet.
				break;
	        case 1:  creature = new Wolf();
	                 break;
	        case 2:  creature = new Tree();
	                 break;
	        case 3:  creature = new Squirrel();
	                 break;
	        case 4:  creature = new Rabbit();
	                 break;
	        case 5:  creature = new Mouse();
	                 break;
	        case 6:  creature = new Hawk();
	                 break;
	        case 7:  creature = new Grasshopper();
	                 break;
	        case 8:  creature = new Grass();
	                 break;
	        case 9:  creature = new Fox();
	                 break;
	        case 10: creature = new Deer();
	                 break;
	        case 11: creature = new Caterpillar();
	                 break;
	        case 12: creature = new Bluejay();
	                 break;
		}
		return creature;
	}
	public static int randInt(int min, int max) {

		int x = (int) (Math.random() * ( max - min ));
		return x;
		
	}
}



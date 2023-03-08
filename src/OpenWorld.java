import java.util.ArrayList;

import javax.management.loading.PrivateClassLoader;

public class OpenWorld {
	
	private int northSouthBoundary, eastWestBoundary; 
	private PlayerLocation playerLocation;
	private ArrayList<Encounter> encounters = new ArrayList<Encounter>();
	
	
	public OpenWorld()
	{
	
	}
	
	
	private void initialise() 
	{

		playerLocation.changeCoordinates(new Coordinates(0,0));
		for (Encounter encounter : encounters) {
			encounter.printEncounterDetails();
		}
		System.out.println("---------------------------");
	}
	
	private void playerMove(int northSouthChange, int eastWestChange)
	{

		System.out.println("---------------------------");
	}
	

	public static void main(String[]args)
	{
		OpenWorld world = new OpenWorld();
		// world.initialise(2,2);
		world.playerMove(1,0);
		world.playerMove(0,1);
		
		
	}

}

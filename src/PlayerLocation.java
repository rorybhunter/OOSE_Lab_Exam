import java.util.ArrayList;

public class PlayerLocation 
{
	private Coordinates playerCoordinates;
	private int northSouthBoundary;
	private int eastWestBoundary;

	
	public PlayerLocation(int northSouthBoundary, int eastWestBoundary)
	{
		this.northSouthBoundary = northSouthBoundary;
		this.eastWestBoundary = eastWestBoundary;
		
	}
		
	public void changeCoordinates(Coordinates updateCoordinates)
	{
		if (updateCoordinates.getNorthSouth() >= 0 && updateCoordinates.getNorthSouth() <= northSouthBoundary && updateCoordinates.getEastWest()>=0 && updateCoordinates.getEastWest()<=eastWestBoundary)
		{
			playerCoordinates = updateCoordinates;
			System.out.println("You are at location:" + playerCoordinates.toString());
		}
		else 
		{
			System.out.println("Out of bounds move attempted - position has not changed, you are at:" + playerCoordinates.toString());
		}
	}	

}

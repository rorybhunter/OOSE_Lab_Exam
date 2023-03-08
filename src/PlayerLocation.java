import java.util.ArrayList;
import java.util.List;

public class PlayerLocation implements Subject
{
	private Coordinates playerCoordinates;
	private int northSouthBoundary;
	private int eastWestBoundary;
	private List<Observer> observers;

	
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
			notifyObserver();
			System.out.println("You are at location:" + playerCoordinates.toString());
		}
		else 
		{
			System.out.println("Out of bounds move attempted - position has not changed, you are at:" + playerCoordinates.toString());
		}
	}	

	public void registerObserver(Observer observer)
	{
		observers.add(observer);
	}

	public void removeObserver(Observer observer)
	{
		observers.remove(observer);
	}

	public void notifyObserver()
	{
		for (Observer observer : observers)
		{
			observer.update(this.playerCoordinates);
		}
	}
}

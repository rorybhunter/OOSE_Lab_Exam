import java.util.ArrayList;
import java.util.List;

public class PlayerLocation implements Subject
{
	private Coordinates playerCoordinates;
	private int northSouthBoundary;
	private int eastWestBoundary;
	private ArrayList<Observer> observers;

	
	public PlayerLocation(int northSouthBoundary, int eastWestBoundary)
	{
		this.northSouthBoundary = northSouthBoundary;
		this.eastWestBoundary = eastWestBoundary;
		this.observers = new ArrayList<Observer>();
	}
		
	public void changeCoordinates(Coordinates updateCoordinates)
	{
		if (updateCoordinates.getNorthSouth() >= 0 && updateCoordinates.getNorthSouth() <= northSouthBoundary && updateCoordinates.getEastWest()>=0 && updateCoordinates.getEastWest()<=eastWestBoundary)
		{
			playerCoordinates = updateCoordinates;
			System.out.println("You are at location:" + playerCoordinates.toString());
			notifyObserver();
		}
		else 
		{
			System.out.println("Out of bounds move attempted - position has not changed, you are at:" + playerCoordinates.toString());
		}
		// surroundings
		LogAnalytics.getLogAnalytics().logMove(playerCoordinates);
	}	

	public void printSurroundings(){

	}
	public void registerObserver(Observer observer) { observers.add(observer); }

	public void removeObserver(Observer observer)
	{
		observers.remove(observer);
	}

	public void notifyObserver() {
		if (!observers.isEmpty()) {
			for (Observer observer : observers) {
				observer.update(this.playerCoordinates);
			}
		}
	}

	public Coordinates getPlayerCoordinates() {
		return playerCoordinates;
	}
}

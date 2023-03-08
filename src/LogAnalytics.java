
public class LogAnalytics
{
	public LogAnalytics()
	{
		System.out.println("Making a connection to the external database");
	}
	
	public void logMove(Coordinates newCoordinates)
	{
		System.out.println("Logging:" +newCoordinates.toString());
	}
}

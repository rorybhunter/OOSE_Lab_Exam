
public class LogAnalytics
{
	private static LogAnalytics logAnalytics;
	private LogAnalytics()
	{
		System.out.println("Making a connection to the external database");
	}
	
	public void logMove(Coordinates newCoordinates)
	{
		System.out.println("Logging:" +newCoordinates.toString());
	}

	public synchronized static LogAnalytics getLogAnalytics()
	{
		if (logAnalytics == null)
		{
			logAnalytics = new LogAnalytics();
		}
		return logAnalytics;
	}
}

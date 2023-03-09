
public abstract class Encounter implements Observer{
	
	Coordinates encounterCoordinates;
	String name;
	String nearbyAlert;
	String encounterDetails;
	Coordinates playerCoordinates;

	public Encounter(String name, Coordinates coordinates)
	{
		this.name = name;
		this.encounterCoordinates = coordinates;
	}


	public void printEncounterDetails() {
		if (encounterDetails == null)
		{
			System.out.println(name + " "+ encounterCoordinates.toString());
			return;
		}
		System.out.println(encounterDetails);
	}

	public void setEncounterDetails(String newEncounterDetails)
	{
		this.encounterDetails = newEncounterDetails;
	}

	public void update(Coordinates coordinates)
	{
		this.playerCoordinates = coordinates;
	}

	public void setNearbyAlert(String newNearbyAlert)
	{
		this.nearbyAlert = newNearbyAlert;
	}





}

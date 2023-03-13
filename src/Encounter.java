
public abstract class Encounter implements Observer{
	
	Coordinates encounterCoordinates;
	String name;
	String nearbyAlert;
	String encounterDetails;
	Coordinates playerCoordinates;
	Player player;

	public Encounter(String name, Coordinates coordinates, Player player)
	{
		player.getPlayerLocation().registerObserver(this);
		this.name = name;
		this.encounterCoordinates = coordinates;
		this.player = player;
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
		if (playerCoordinates.isHere(encounterCoordinates)){
			printEncounterDetails();
		}
	}

	public void setNearbyAlert(String newNearbyAlert)
	{
		this.nearbyAlert = newNearbyAlert;
	}
}

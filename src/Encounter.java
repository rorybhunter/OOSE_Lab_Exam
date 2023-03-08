
public abstract class Encounter implements Observer{
	
	Coordinates encounterCoordinates;
	String name;
	String nearbyAlert;


	public void printEncounterDetails() {
		System.out.println(name + " "+ encounterCoordinates.toString());
	}

	public void update(Coordinates coordinates)
	{

	}
}

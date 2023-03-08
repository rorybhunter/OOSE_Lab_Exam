
public abstract class Encounter{
	
	Coordinates encounterCoordinates;
	String name;
	String nearbyAlert;


	public void printEncounterDetails() {
		System.out.println(name + " "+ encounterCoordinates.toString());
	}

}

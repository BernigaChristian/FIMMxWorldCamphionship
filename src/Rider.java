
public class Rider {
	private String name;
	private String surname;
	private String nationality;
	private int raceNumber;
	private Team team;
	private Bike bike;
	private int points;
	private int gpResults[]=new int[18];
	//constructors
	public Rider(String name, String surname, String nationality, int raceNumber, Team team) {
		this.name = name;
		this.surname = surname;
		this.nationality = nationality;
		this.raceNumber = raceNumber;
		this.team = team;
		//this.bike = bike;
	}
	public Rider(Rider r) {
		this.name = r.name;
		this.surname = r.surname;
		this.nationality = r.nationality;
		this.raceNumber =r.raceNumber;
		this.team = r.team;
		//this.bike = bike;
	}
	//getters
	public String getSurname() {
		return surname;
	}
	public int getGpResult(int i) {
		return gpResults[i];
	}
	public int getPoints() {
		return points;
	}
	//setters
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public void setGpResult(int i,int result) {
		gpResults[i] = result;
	}
	public void setPoints(int points) {
		this.points=points;
	}
	//methods
	public String toString() {
		return name+" "+surname;
	}
	

	public String toStringData() {
		return "NATIONALITY: "+nationality+"\nRACE NUMBER: "+raceNumber+"\nTEAM: "+team.toString();
	}
	
	
}

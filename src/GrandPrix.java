
public class GrandPrix {
	private String location;
	private String country;
	private Rider mxgpWinner;
	private Rider mx2Winner;
	//constructors
	public GrandPrix(String location,String country) {
		this.location=location;
		this.country=country;
	}
	//getters
	
	//setters
	
	//methods
	public String halfToString() {
		return "MXGP of "+country;
	}
	public String toString() {
		return "MXGP of "+country+"\nLocation: "+location;
	}
}

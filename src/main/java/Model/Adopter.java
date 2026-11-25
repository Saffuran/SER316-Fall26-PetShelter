public class Adopter {

	private String id;

	private String preferredSpecies;

	private int minAge;

	private int maxAge;

	public Adopter(String id, String preferredSpecies, int minAge, int maxAge) {
		this.id = id;
		this.preferredSpecies = preferredSpecies;
		this.minAge = minAge;
		this.maxAge = maxAge;
	}

	public String getID(){
		return id;
	}

	public String getPreferredSpecies(){
		return preferredSpecies;
	}

	public getMinAge(){
		return minAge;
	}

	public getMaxAge() {
		return maxAge;
	}
}

import java.util.List;

public class Animal {

	private String id;

	private String species;

	private int age;

	private String health;

	private String status;

	private List<String> notes = new ArrayList<>();

	public void addNote(String note) {

	}

	public String getSpecies() {
		return species;
	}

	public int getAge() {
		return age;
	}

	public String getHealth() {
		return health;
	}

	public String getStatus() {
		return status;
	}

	public setHealth(String health){
		this.health = health;
	}
	public getStatus(){
		return status;
	}
	public List<String> getNotes() {
		return notes;
	}

}

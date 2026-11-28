package model;

import java.util.ArrayList;
import java.util.List;

public class Animal {

	private final String id;

	private final String species;

	private final int age;

	private String health;

	private String status;

	private final List<String> notes = new ArrayList<>();

	public Animal(String id, String species, int age, String health, String status) {
		this.id = id;
		this.species = species;
		this.age = age;
		this.health = health;
		this.status = status;
	}

	public void addNote(String note){ notes.add(note); }

	public String getId() { return id; }

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

	public void setHealth(String health){ this.health = health; }

	public void setStatus(String status){ this.status = status; }
	public List<String> getNotes(){ return notes; }

}

package model.staff;

public abstract class Staff {

	private final String name;

	protected Staff(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}

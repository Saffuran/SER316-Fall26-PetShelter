public abstract class Staff {

	private String name;

	private final String name;

	protected Staff(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}

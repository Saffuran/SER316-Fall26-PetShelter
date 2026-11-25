public class AdoptionPeople extends Staff {

	private MatchHandler matchChain;

	public AdoptionCoordinator(String name, MatchHandler matchChain) {
		super(name);
		this.matchChain = matchChain;
	}


	public boolean tryAdopt(Adopter adopter, Animal animal) {
		if (matchChain.check(adopter, animal)) {
			animal.setStatus("ADOPTED");
			return true;
		}
		return false;
	}

}

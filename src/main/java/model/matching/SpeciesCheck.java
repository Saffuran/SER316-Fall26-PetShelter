package model.matching;

import model.Adopter;
import model.Animal;

public class SpeciesCheck extends MatchHandler {

	@Override
	public boolean check(Adopter adopter, Animal animal) {
		if (!animal.getSpecies().equals(adopter.getPreferredSpecies())) {
			return false;
		}
		return super.check(adopter, animal);
	}
}
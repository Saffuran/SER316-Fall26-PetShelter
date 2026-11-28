package model.matching;

import model.Adopter;
import model.Animal;

public class AgeRangeCheck extends MatchHandler {

	@Override
	public boolean check(Adopter adopter, Animal animal) {
		if (animal.getAge() < adopter.getMinAge() || animal.getAge() > adopter.getMaxAge()) {
			return false;
		}
		return super.check(adopter, animal);
	}
}

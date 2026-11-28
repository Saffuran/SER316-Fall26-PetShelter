package model.matching;

import model.Adopter;
import model.Animal;

public class AvailabilityCheck extends MatchHandler {

	@Override
	public boolean check(Adopter adopter, Animal animal) {
		if (!"AVAILABLE".equals(animal.getStatus())) {
			return false;
		}
		return super.check(adopter, animal);
	}
}

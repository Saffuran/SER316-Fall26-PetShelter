package model.matching;

import model.Adopter;
import model.Animal;

public class HealthCheck extends MatchHandler {

	@Override
	public boolean check(Adopter adopter, Animal animal) {
		if (!"Healthy".equals(animal.getHealth())) {
			return false;
		}
		return super.check(adopter, animal);
	}
}

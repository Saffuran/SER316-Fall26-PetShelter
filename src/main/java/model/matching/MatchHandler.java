package model.matching;

import model.Adopter;
import model.Animal;

public abstract class MatchHandler {

	private MatchHandler next;

	public MatchHandler setNext(MatchHandler next) {
		this.next = next;
		return next;
	}

	public boolean check(Adopter adopter, Animal animal) {
		if (next == null) {
			return true;
		}
		return next.check(adopter, animal);
	}
}
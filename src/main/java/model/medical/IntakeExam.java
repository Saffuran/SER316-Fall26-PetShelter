package model.medical;

import model.Animal;

public class IntakeExam implements MedicalProcedure {
	@Override
	public void perform(Animal animal) {
		//injured animals need a second visit, everyone else is good to go
		if ("Injured".equals(animal.getHealth())) {
			animal.setHealth("Recovering");
		} else {
			animal.setHealth("Healthy");
		}
	}
}

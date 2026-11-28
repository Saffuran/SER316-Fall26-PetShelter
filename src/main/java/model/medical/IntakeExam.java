package model.medical;

import model.Animal;

public class IntakeExam implements MedicalProcedure {
	@Override
	public void perform(Animal animal) {
	animal.setHealth("Healthy");
	}

}

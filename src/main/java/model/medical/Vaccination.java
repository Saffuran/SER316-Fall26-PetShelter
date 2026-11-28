package model.medical;

import model.Animal;

public class Vaccination extends ProcedureDecorator {

	public Vaccination(MedicalProcedure wrapped) {
		super(wrapped);
	}

	@Override
	public void perform(Animal animal) {
		wrapped.perform(animal);
		animal.addNote("Vaccinated");
	}

}

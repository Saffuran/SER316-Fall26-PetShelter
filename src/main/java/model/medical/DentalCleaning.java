package model.medical;

import model.Animal;


public class DentalCleaning extends ProcedureDecorator {

	public DentalCleaning(MedicalProcedure wrapped) {
		super(wrapped);
	}

	public void perform(Animal animal) {
		wrapped.perform(animal);
		animal.addNote("Teeth cleaned");
	}

}

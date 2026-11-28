package model.medical;

import model.Animal;


public class DentalCleaning extends ProcedureDECORATOR {

	public DentalCleaning(MedicalProcedure wrapped) {
		super(wrapped);
	}

	public void perform(Animal animal) {
		wrapped.perform(animal);
		animal.addNote("Teeth cleaned");
	}

}

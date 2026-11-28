package model.medical;

import model.Animal;

public class Vaccination extends ProcedureDECORATOR {

	public Vaccination(MedicalProcedure wrapped) {
		super(wrapped);
	}

	public void perform(Animal animal) {
		wrapped.perform(animal);
		animal.addNote("Vaccinated");
	}

}

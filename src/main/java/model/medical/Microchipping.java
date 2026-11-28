package model.medical;

import model.Animal;


public class Microchipping extends ProcedureDECORATOR {

	public Microchipping(MedicalProcedure wrapped) {
	super(wrapped);
	}

	public void perform(Animal animal) {
	wrapped.perform(animal);
	animal.addNote("Microchipped!");
	}

}

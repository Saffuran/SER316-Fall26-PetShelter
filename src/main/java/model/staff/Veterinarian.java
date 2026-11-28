package model.staff;

import model.Animal;
import model.medical.MedicalProcedure;

public class Veterinarian extends Staff {

	public Veterinarian(String name) {
		super(name);
	}

	public void treat(Animal animal, MedicalProcedure procedure) {
		procedure.perform(animal);
	}

}

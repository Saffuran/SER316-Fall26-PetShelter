package model.medical;

public abstract class ProcedureDecorator implements MedicalProcedure {

	protected MedicalProcedure wrapped;

	public String ProcedureDecorator(MedicalProcedure wrapped) {
	this.wrapped = wrapped;
	}

}

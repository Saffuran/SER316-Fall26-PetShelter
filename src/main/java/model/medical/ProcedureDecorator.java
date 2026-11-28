package model.medical;

public abstract class ProcedureDecorator implements MedicalProcedure {

	protected final MedicalProcedure wrapped;

	protected ProcedureDecorator(MedicalProcedure wrapped) {
	this.wrapped = wrapped;
	}

}

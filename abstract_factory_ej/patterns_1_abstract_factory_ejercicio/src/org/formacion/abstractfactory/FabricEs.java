package org.formacion.abstractfactory;

public class FabricEs implements FrabricAbstrac{
	
	@Override
	public Saludos gtSaludos() {
		return new SaludosEs();
	}

	@Override
	public Preguntas gtPreguntas() {
		return new PreguntasEs();
	}
}

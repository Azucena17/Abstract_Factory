package org.formacion.abstractfactory;

public class FabricEn implements FrabricAbstrac{
	
	@Override
	public Saludos gtSaludos() {
		return new SaludosEn();
	}
	
	@Override
	public Preguntas gtPreguntas() {
		return new PreguntasEn();
	}

}

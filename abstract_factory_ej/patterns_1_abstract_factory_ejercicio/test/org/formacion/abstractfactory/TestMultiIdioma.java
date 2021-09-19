package org.formacion.abstractfactory;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMultiIdioma {

	@Test
	public void test_es() {
		
		FrabricAbstrac FabricEs = FabricProduc.gtFabrica("es");
		
		//implementar Abstract factory
		Preguntas preguntas = FabricEs.gtPreguntas();
		
		assertEquals("¿qué hora es?", preguntas.preguntaHora() );
		assertEquals("¿qué tiempo hace?", preguntas.preguntaTiempo() );
		//implementar Abstract factor
		Saludos saludos = FabricEs.gtSaludos();
		
		assertEquals("buenos días", saludos.buenosDias());
		assertEquals("buenas tardes", saludos.buenasTardes());
	}
	
	@Test
	public void test_en() {
		
		FrabricAbstrac FabricEn = FabricProduc.gtFabrica("en");
		//implementar Abstract factor
		Preguntas preguntas = FabricEn.gtPreguntas();
		
		assertEquals("what time is it?", preguntas.preguntaHora() );
		assertEquals("how is the weather?", preguntas.preguntaTiempo() );
		
		//implementar Abstract factor
		Saludos saludos = FabricEn.gtSaludos();
		
		assertEquals("good morning", saludos.buenosDias());
		assertEquals("good afternoon", saludos.buenasTardes());
	}

}

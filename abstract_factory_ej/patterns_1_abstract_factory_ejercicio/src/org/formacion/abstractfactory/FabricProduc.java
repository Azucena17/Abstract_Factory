package org.formacion.abstractfactory;

public class FabricProduc {
	
	public static FrabricAbstrac gtFabrica(String idioma) {
		if(idioma == "es") {
			return new FabricEs();
		}
		else if(idioma == "en") {
			return new FabricEn();
		}
		else {
			return null;
		}
	}

}

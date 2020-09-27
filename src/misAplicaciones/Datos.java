package misAplicaciones;

import miApi.ColaCadenaTDA;
import miApi.ColaTDA;
import misImplementaciones.estaticas.ColaCircular;

public class Datos {
	//una vez este la implementacion de ColaCadena, cambiar!
	public static ColaTDA obtenerMovimientos() {
		//III = ID de la persona
		//PP = código de proveedor
		//SSSS = código de película
		
		String[] datos = {
				//IIIPPSSSS (ver si nos conviene rellenar con ceros para cumplir bien el formato)
				"141139",
				"50021",
				"7781916",
				"264124",
				"8812613",
				"5912510",
				"42743",
				"3042016",
				"3921915",
				"8161714",
				"1471611",
				"838228",
				"567241",
				"994112",
				"822187",
				"26482",
				"453151",
				"7442316",
				"337314",
				"841295",
				"7162715",
				"142910",
				"1401415",
				"2482815",
				"690106",
				"150615",
				"1931114",
				"1232112",
				"85679",
				"27656"
		};
		
		ColaTDA cola = new ColaCircular();
		cola.inicializarCola();
		
		for(int i = 0; i < datos.length; i++) {
			cola.acolar(Integer.parseInt(datos[i]));
			System.out.println(datos[i]);
		}
		
		return cola;
	}
}

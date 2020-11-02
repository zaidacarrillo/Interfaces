package ejercicioTablas;

import java.util.ArrayList;

public class Utilidades {

	public static ArrayList<Coche> creacionListaCoches() {
		ArrayList <Coche> listaCoches = new ArrayList();
		Coche c1 = new Coche("Seat","No se","Negro","111111B",2006);
		Coche c2 = new Coche("Ferrari","No se2","Verde","22222B",2009);
		listaCoches.add(c1);
		listaCoches.add(c2);
		modeladoDatos md = new modeladoDatos(listaCoches);
		return listaCoches;
		
	}

}

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitPrueba {

	@Test
	public void test() {
		Principal p = new Principal();
		//Para la edad
		int edad = p.edad("19/07/1996");
		assertEquals(20,edad);
		//Para los primos
		boolean bandera = p.esPrimo(24);
		assertEquals(false,bandera);
		bandera = p.esPrimo(3);
		assertEquals(true,bandera);
		//Para personas
		Persona per1 = new Persona("Rodrigo","Ing. Sistemas",21);
		Persona per2 = new Persona("Kevin","Ing. Industrial",19);
		Persona per3;
		per3=p.AplicaPersona(per1, per2, "Ing. Sistemas");
		assertEquals(per1,per3);
		per1.Person("Rodrigo","Ing. Industrial",21);
		per2.Person("Kevin","Ing. Sistemas",19);
		per3=p.AplicaPersona(per1, per3, "Ing. Sistemas");
		assertEquals(per2,per3);
		per1.Person("Rodrigo","Ing. Sistemas",21);
		per2.Person("Kevin","Ing. Sistemas",19);
		per3=p.AplicaPersona(per1, per3, "Ing. Sistemas");
		assertEquals(per1,per3);
		per1.Person("Rodrigo","Ing. Sistemas",19);
		per2.Person("Kevin","Ing. Sistemas",21);
		per3=p.AplicaPersona(per1, per3, "Ing. Sistemas");
		assertEquals(per2,per3);
	}
}

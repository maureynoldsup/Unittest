import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bienvenido!!");
		System.out.println("Su edad es: " + edad("19/07/1996"));
		System.out.println(esPrimo(24));
		Persona per1 = new Persona("Rodrigo","Ing. Sistemas",21);
		Persona per2 = new Persona("Kevin","Ing. Industrial",19);
		Persona per3;
		per3=AplicaPersona(per1, per2, "Ing. Sistemas");
		System.out.println("La persona es: " + per3.getNombre());
		
	}

	public void mostrar(int d){
		System.out.println("Edad "+ d);
	}
	public static int edad(String fecha_nac) { // fecha_nac debe tener el
		// formato dd/MM/yyyy

		Date fechaActual = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		String hoy = formato.format(fechaActual);
		String[] dat1 = fecha_nac.split("/");
		String[] dat2 = hoy.split("/");
		int años = Integer.parseInt(dat2[2]) - Integer.parseInt(dat1[2]);
		int mes = Integer.parseInt(dat2[1]) - Integer.parseInt(dat1[1]);
		if (mes < 0) {
			años = años - 1;
		} else if (mes == 0) {
			int dia = Integer.parseInt(dat2[0]) - Integer.parseInt(dat1[0]);
			if (dia > 0) {
				años = años - 1;
			}
		}
		return años;
	}
	//Para medir ver los numeros primos
	public static boolean esPrimo(int num) {
		int cont = 2;
		boolean esPrimo = true;

		while ((esPrimo) && (cont != num)) {
			if (num % cont == 0) {
				esPrimo = false;
			}
			cont++;
		}
		return esPrimo;
	}
	//Para las personas
	public static Persona AplicaPersona(Persona A, Persona B, String valor) {
		System.out.println("valor " + valor);
		if (A.getProfesion() == valor && B.getProfesion() != valor) {
			System.out.println("Entre a la 1");
			return A;
		} else if (A.getProfesion() != valor && B.getProfesion() == valor) {
			System.out.println("Entre a la 2");
			return B;
		} else if (A.getProfesion() == valor && B.getProfesion() == valor) {
			System.out.println("Entre a la 3");
			if (A.getEdad() > B.getEdad()) {
				System.out.println("Entre a la 3.1");
				return A;
			} else {
				System.out.println("Entre a la 3.2");
				return B;
			}
		} else {
			return null;
		}
	}
}

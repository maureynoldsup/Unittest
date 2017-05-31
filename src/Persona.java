
public class Persona {

	public static String nombre;
	public static String profesion;
	public static int edad;
	
	public Persona(String nombre,String profesion,int edad){
		this.nombre=nombre;
		this.profesion=profesion;
		this.edad=edad;
	}
	public void Person(String nombre,String profesion,int edad){
		this.nombre=nombre;
		this.profesion=profesion;
		this.edad=edad;
	}
	public static String getNombre() {
		return nombre;
	}
	public static void setNombre(String nombre) {
		Persona.nombre = nombre;
	}
	public static String getProfesion() {
		return profesion;
	}
	public static void setProfesion(String profesion) {
		Persona.profesion = profesion;
	}
	public static int getEdad() {
		return edad;
	}
	public static void setEdad(int edad) {
		Persona.edad = edad;
	}
	
}

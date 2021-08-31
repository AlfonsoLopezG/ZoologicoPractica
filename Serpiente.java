package Empresa;

public class Serpiente extends Animal{
	private String datos;
	private float longitud;
	
	//Constructor
	public Serpiente() {
		super();
		datos="";
		longitud=0;
	}
	
	public Serpiente(String nombre, String genero, int edad, float longitud) {
		this.setNombre(nombre);
		this.setGenero(genero);
		this.setEdad(edad);
		this.longitud=longitud;
	}
	
	//Metodo para obtener la longitud de la serpiente
	public String getLongitud() {
		return longitud +"mts";
	}
	
	//Metodo para Establecer/Cambiar longitud de serpiente
	public void setLongitud(float longitud) {
		this.longitud=longitud;
	}

	//Metodo de sonido
		public void makeSound() {
			
		}
	
	//Metodo para los datos de la serpiente
	public String toString() {
		datos = super.toString()+
				"Longitud: " +getLongitud() +".\n\n";
		return datos;
	}

}

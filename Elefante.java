package Empresa;

public class Elefante extends Animal{
	private String datos;
	private String tipo;
	
	//Constructor
	public Elefante() {
		super();
		datos="";
		tipo="";
	}
	
	public Elefante(String nombre, String genero, int edad, String tipo) {
		this.setNombre(nombre);
		this.setGenero(genero);
		this.setEdad(edad);
		this.tipo=tipo;
	}
	
	//Metodo para obtener el tipo del caballo
	public String getTipo() {
		return tipo;
	}
	
	//Metodo para Establecer/Cambiar el tipo del caballo
	public void setTipo(String tipo) {
		this.tipo=tipo;
	}
	
	//Metodo toString para los datos del caballo
	public String toString() {
		datos= super.toString()+
			   "Tipo " +getTipo() +"\n\n";
		return datos;
	}

}

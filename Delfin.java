package Empresa;

public class Delfin extends Animal {
	private String datos;
	private String tipo;
	
	//Constructor
	public Delfin() {
		super();
		datos="";
		tipo="";
	}
	
	public Delfin(String nombre, String genero, int edad, String tipo) {
		this.setNombre(nombre);
		this.setGenero(genero);
		this.setEdad(edad);
		this.tipo=tipo;
	}
	
	//Metodo para obtener el tipo del animal
	public String getTipo() {
		return tipo;
	}
	
	//Metodo para Establecer/Cambiar el tipo del animal
	public void setTipo(String tipo) {
		this.tipo=tipo;
	}
	
	//Metodo para obtener los datos del animal
	public String toString() {
		datos=super.toString()+
			  "Tipo: " +getTipo() +"\n\n";
		return datos;
	}
}

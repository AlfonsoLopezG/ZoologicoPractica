package Empresa;

public class Conejo extends Animal{
	private String tipo;
	private String datos;
	
	//Constructor
	public Conejo() {
		super();
		tipo="";
		datos="";
	}
	
	public Conejo(String nombre, String genero, int edad, String tipo) {
		this.setNombre(nombre);
		this.setGenero(genero);
		this.setEdad(edad);
		this.tipo=tipo;
	}
	
	//Metodo obtener tipo
	public String getTipo() {
		return tipo;
	}
	
	//Metodo establecer/cambiar tipo
	public void setTipo(String tipo) {
		this.tipo=tipo;
	}
	
	//Metodo de sonido
	public void makeSound() {
		
	}
	

	//Metodo toString
	public String toString() {
		datos= super.toString() 
	          +"Tipo: " +this.getTipo() +".\n\n";
		return datos;
	}
	

}

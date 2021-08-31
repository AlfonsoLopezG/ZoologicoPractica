package Empresa;
import java.io.File;

public class Caballo extends Animal {
	private String tipo;
	private String datos;
	
	//Constructor
	public Caballo() {
		super();
		tipo="";
		datos="";
	}
	
	public Caballo(String nombre, String genero, int edad, String tipo) {
		this.setNombre(nombre);
		this.setGenero(genero);
		this.setEdad(edad);
		this.tipo=tipo;
	}
	
	//Metodo para obtener el tipo del caballo
	public String getTipo() {
		return tipo;
	}
	
	//Metodo para establecer/cambiar el tipo del caballo
	public void setTipo(String tipo) {
		this.tipo=tipo;
	}
	
	 // Metodo para guardar el sonido referente al animal
	  public void makeSound() {
		  File sound= new File("C:\\Users\\AlfonsoLopez\\eclipse-workspace\\TareaEmpresa\\src\\Empresa\\caballo.WAV");
		  super.PlaySound(sound);
	  }
	  
	//Metodo para obtener la informacion del caballo
	public String toString() {
		datos= super.toString() 
		       +"Tipo: " +this.getTipo() +".\n\n";
		return datos;
	}

}

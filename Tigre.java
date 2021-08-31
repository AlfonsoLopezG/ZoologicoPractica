package Empresa;

import java.io.File;

public class Tigre extends Animal {
	private String datos;
	private String tipo;
	
	//Constructor
	public Tigre() {
		super();
		datos="";
		tipo="";
	}
	
	public Tigre(String nombre, String genero, int edad, String tipo) {
		this.setNombre(nombre);
		this.setGenero(genero);
		this.setEdad(edad);
		this.tipo=tipo;
	}
	
	//Metodo para obtener el tipo del tigre
	public String getTipo() {
		return tipo;
	}
	
	//Metodo para Establecer/cambiar el tipo del tigre
	public void setTipo(String tipo) {
		this.tipo=tipo;
	}


	 // Metodo para guardar el sonido referente al animal
	  public void makeSound() {
		  File sound= new File("C:\\Users\\AlfonsoLopez\\eclipse-workspace\\TareaEmpresa\\src\\Empresa\\tigre.wav");
		  super.PlaySound(sound);
	  }
	//Metodo para obtener los datos del tigre
	public String toString() {
		datos = super.toString()+
				"Tipo: " +getTipo() +".\n\n";
		return datos;
	}
}

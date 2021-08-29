package Empresa;

public class Gorila extends Animal{
	private String datos;
	private float peso;
	
	public Gorila() {
		super();
		datos="";
		peso=0;
	}
	
	public Gorila(String nombre, String genero, int edad, float peso) {
		this.setNombre(nombre);
		this.setGenero(genero);
		this.setEdad(edad);
		this.peso=peso;
	}
	
	//Metodo para obtener el peso del gorila
	public String getPeso() {
		return peso +" Kg";
	}
	
	//Metodo para Establecer/Cambiar peso del gorila
	public void setPeso(float peso) {
		this.peso=peso;
	}
	
	//Metodo para obtener los datos del gorila
	public String toString() {
		datos = super.toString()+
				"Peso: " +getPeso() +"\n\n";
		return datos;
	}
}

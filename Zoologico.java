package Empresa;

public class Zoologico extends Empresa {
	private String horario;
	private String datos;
	private int CantAnimal;
	
	//Constructor
	public Zoologico() {
		super();
		horario="11:00";
		CantAnimal=0;
		datos="";
	}
	
	public Zoologico(String nombre, String ubicacion, int personal, String horario, int cantanimal) {
		this.setNombre(nombre);
		this.setUbicacion(ubicacion);
		this.setPersonal(personal);
		this.horario=horario;
		this.CantAnimal=cantanimal;
	}
	
	//Metodo para obtener el horario del Zoologico
	public String getHorario() {
		return horario;
	}
	
	//Metodo para establecer/cambiar horario
	public void setHorario(String horario) {
		this.horario=horario;
	}
	
	//Metodo para obtener la cantidad de animales
	public int getCantAnimal() {
		return CantAnimal;
	}
	
	//Metodo para establecer/cambiar el numero de animales
	public void setCantAnimal(int CantAnimal) {
		this.CantAnimal=CantAnimal;
	}
	
	//Metodo para obtener los datos del zoologico
	public String toString() {
		datos= super.toString()
			 +"Horario: " +getHorario() +"\n"
			 +"Cantidad de animales: " +getCantAnimal() +".\n\n";
		return datos;
	}
}

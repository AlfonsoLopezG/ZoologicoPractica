package Empresa;

public class Zoologico extends Empresa {
	private String horario;
	
	//Constructor
	public Zoologico() {
		super();
		horario="11:00";
	}
	
	public Zoologico(String nombre, String horario) {
		this.setNombre(nombre);
		this.horario=horario;
	}
	
	//Metodo para obtener el horario del Zoologico
	public String getHorario() {
		return horario;
	}
	
	//Metodo para establecer/cambiar horario
	public void setHorario(String horario) {
		this.horario=horario;
	}
}

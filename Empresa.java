package Empresa;

public class Empresa {
	private String nombre;
	private String ubicacion;
	private int personal;
	private String datos;
	
	
	//Constructor
	public Empresa() {
		datos="";
		nombre=" ";
		ubicacion="";
		personal=0;
	}
	
	//Metodo para obtener el nombre
	public String getNombre(){
		return nombre;
	}
	
	//Metodo para establecer/cambiar el nombre
	public void setNombre(String nombre) {
		this.nombre= nombre;
	}
	
	//Metodo para obtener su ubicacion
	public String getUbicacion() {
		return ubicacion;
	}
	
	//Metodo para establecer/cambiar su ubicacion
	public void setUbicacion(String ubicacion) {
		this.ubicacion=ubicacion;
	}
	
	//Metodo para obtener el numero de empleados
	public int getPersonal() {
		return personal;
	}
	
	//Metodo para establecer/actualizar el numero del personal
	public void setPersonal(int personal) {
		this.personal=personal;
	}
	
	//Metodo para obtener los datos de la empresa
	public String toString() {
		datos="Nombre: " +getNombre() +"\n"
			 +"Ubicacion: " +getUbicacion() +"\n"
			 +"Personal disponible: " +getPersonal() +"\n";
		return datos;
	}
	
	
}

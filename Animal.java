package Empresa;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Animal {
	private String nombre;
	private String genero;
	private int edad;
	private String datos="";
	
	//Constructor
	public Animal() {
		nombre="";
		genero="";
		edad=0;
		datos="Datos del animal: \n";
	}
	
	//Metodo para obtener el nombre
	public String getNombre() {
		return nombre;
	}
	
	//Metodo para obtener el genero
	public String getGenero() {
		return genero;
	}
	
	//Metodo para obtener la edad
	public int getEdad() {
		return edad;
	}
	
	//Metodo para establecer/cambiar nombre
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	//Metodo para establecer/cambiar genero
	public void setGenero(String genero) {
		this.genero=genero;
	}
	
	//Metodo para establecer/cambiar edad
	public void setEdad(int edad) {
		this.edad=edad;
	}
	
	//Metodo Para datos del animal
	public String toString() {
		datos+="Nombre: " +getNombre() +"\n" 
	          +"Genero: " +getGenero() +"\n"
	          +"Edad: "   +getEdad() +" años\n";
		return datos;
	}
	
	//Metodo para reproducir los sonidos de los animales
	public void PlaySound(File sound) {
		  try{Clip clip=AudioSystem.getClip();
		  clip.open(AudioSystem.getAudioInputStream(sound));
		  clip.start();
		  Thread.sleep(clip.getMicrosecondLength()/1000);
		  }catch(Exception e) {  
	  			}
	  }
}

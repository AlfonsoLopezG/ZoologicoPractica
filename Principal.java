/*
 Programa creado por: Alfonso López
 Fecha de creación: 28/08/2021
 Descripción: 
 Programa que emplea los conceptos básicos de la programacion orientada a objetos
 Con el ejemplo de una Clase llamada empresa que tiene de hijo la clase zoologico, que se compone de animales con nombres y sonidos.
 
 */
package Empresa;
import java.util.*;

public class Principal {
public static ArrayList<Empresa> empresas=new ArrayList<Empresa>();
public static ArrayList<Animal> animales = new ArrayList<Animal>();
	public static void main(String[] args) {
		
		//Animales
		Caballo luis=new Caballo("Luis", "Macho", 2, "Pinto");
		Caballo baal=new Caballo("Baal","Hembra",3,"Pura Sangre");
		Conejo pancho=new Conejo("Pancho", "Macho",15 ,"Californiano");
		Conejo emma=new Conejo("Emma", "hembra",2 ,"Mini Rex");
		Delfin pedro=new Delfin("Pedro", "Macho", 1, "Costero");
		Delfin lisa =new Delfin("Lisa", "Hembra",2,"Oceanico");
		Elefante maria=new Elefante("Maria", "Hembra",4,"Africano");
		Elefante ben= new Elefante("Ben","Macho",2,"Asiatico");
		Gorila mona=new Gorila("Mona","Hembra",5,115);
		Gorila dil=new Gorila("Dil","Macho",2,40);
		Serpiente grey=new Serpiente("Grey","Macho",3,20);
		Serpiente jean=new Serpiente("Jean","Hembra",5,40);
		Tigre feli=new Tigre("Feli","Hembra",4,"Blanco");
		Tigre cobu=new Tigre("Cobu","Macho",6,"Amur");
		
		animales.add(luis);
		animales.add(baal);
		animales.add(pancho);
		animales.add(emma);
		animales.add(pedro);
		animales.add(lisa);
		animales.add(maria);
		animales.add(ben);
		animales.add(mona);
		animales.add(dil);
		animales.add(grey);
		animales.add(jean);
		animales.add(feli);
		animales.add(cobu);
		

		//Zologico
		Zoologico Aventura=new Zoologico("Aventura","Calle Olmo",55, "11:00 am",animales.size());
		empresas.add(Aventura);
		//En caso de querer cambiar un dato a un animal
		for(int i=0;i<animales.size();i++) {
			if(animales.get(i).getNombre()=="Mona") {
				animales.get(i).setNombre("Hola");
				animales.get(i).setGenero("Macho");
			}
		}
		System.out.print("Animales en el zoologico: \n"+animales.toString());
		System.out.print("Informacion del zoologico: \n" +empresas.toString());
	}
}
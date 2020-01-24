package pe.edu.unmsm.agenda;

import java.util.Scanner;

public class Agenda {
	 static Contacto [] listaContactos = new Contacto[10];
	 
	 public static void main(String [] args) {
		 listaContactos[0] = new Contacto("Raul",25,1200.00);
	 }
	 
		public void agregarContactos() {
			for(int i=0;i<9;i++) {
				System.out.println("nombre-edad-salario");
				Scanner entrada = new Scanner(System.in);
				
			
			}
		}
		
		public void eliminarContactos(int indice) {

			listaContactos[indice]=null;		
		}
		
}



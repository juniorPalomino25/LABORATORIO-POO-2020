package pe.edu.unmsm.agenda;

import java.util.Scanner;

public class Contacto{
	Scanner entrada = new Scanner(System.in);
	String nombre;
	int edad;
	double salario;
	
	public Contacto(){
		
	}
	public Contacto(String nombre, int edad, double salario){
		this.nombre = nombre;
		this.salario = salario;
		this.edad = edad;
		}
	
		public void SetNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public String getNombre() {
			return nombre;
		}
		
		public void SetSalario (double salario) {
			this.salario = salario;
		}
		
		public double getSalario() {
			return salario;
		}
	
		public void SetEdad (int edad) {
			this.edad = edad;
		}
		
		public int getEdad() {
			return edad;
		}
		public void mostrarContactos() {
			System.out.println(this.getNombre() + this.getSalario() + this.getEdad());
		}
		
}

package Agenda;

import java.util.Scanner;


public class Agenda {
	private Contacto arr[];
	private int i;
	private int tam;
	
	public Agenda(int n) {
		this.tam = n;
		this.i = 0;
		this.arr= new Contacto[tam];
	}
	
	public  void agregarContactos(Contacto contacto) {
		 Scanner in = new Scanner(System.in);
		 if(this.tam == this.i) {
				System.out.println("\nCAPACIDAD EXCEDIDA!");
			}else {
				this.arr[this.i] = contacto;
				this.i++;
				System.out.println("\nAgregado exitosamente!");
			}
		 for( int i=0; i<arr.length; i++) {
				
				System.out.println("Datos del contacto " + (i+1) + ": ");
				System.out.println("Nombre: ");
				String nom = in.nextLine();
			
				System.out.println("telefono: ");
				String tel = in.nextLine();
				
				System.out.println("detalle: ");
				String deta = in.nextLine();
				
				in.nextLine();
				
			}
	 }
	
	public static void pedidoContactos(Contacto[] arr) {
		System.out.println("\nNOMBRE\tTELEFONO\tDETALLE");
		for( int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	
	public static int numeroContactos(Contacto[] arr) {
		int cant=0;
		
		cant = arr.length;
		
		return cant;
	}
	
	public static void busquedaContacto(String nombre, Contacto [] arr) {
		
		int i=0;
		boolean estado=false ;
		while (estado == true) {
			estado = nombre.equals(arr[i]);
			i++;
		}
			if (estado = true) {
				System.out.println("el nombre:"+nombre);
				System.out.print("fue encontrado");
			}
				else {
					System.out.println("el nombre no fue encontrado");
				}
			
		}
		
		
		
	}
	


package tienda;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {
	//Opcion 1 : Todo en un vector
	private String nombreTienda;
	ArrayList<Electrodomestico> v= new ArrayList<Electrodomestico>();

	/*Opcion 2 : Un vector para cada tipo de objeto
	private String nombreTienda;
	ArrayList<Nevera> v= new ArrayList<Nevera>();
	ArrayList<Televisor> v= new ArrayList<Televisor>();
	*/
	public void rellenar() {
		Scanner in = new Scanner(System.in);
		System.out.print("Nombre de la tienda = ");
		this.nombreTienda=in.nextLine();
		System.out.println("---Rellene los electrodomesticos de la tienda---");
		String respuesta="";
		int opcion; 
		do {
			//elegir entre tv o nevera
			System.out.print("(1). TV \n(2). Nevera \nElegir opcion = ");
			opcion= in.nextInt();			
			if (opcion==1) {
				Televisor unTelevisor=new Televisor();
				unTelevisor.rellenar();
				v.add(unTelevisor);		
			}
			else{
				Nevera unaNevera= new Nevera();
				unaNevera.rellenar();
				v.add(unaNevera);
			}
			System.out.println("¿Deseas introducir otro aparato? (si/no)");
			in.nextLine();
			respuesta=in.nextLine();
		}while (respuesta.equalsIgnoreCase("SI"));
		
	}

	public void visualizar() {
		System.out.println("\n****INFORMACION DE LA TIENDA ****");
		System.out.println("Nombre = " + this.nombreTienda);
		System.out.println("Listado de aparatos");
		for (Electrodomestico electrodomestico : v) {
			System.out.println("Tipo de electrodomestico : "+ electrodomestico.getClass().getSimpleName());
			electrodomestico.visualizar();
		}
		
	}

	public void crearRAF() {
		/*
		 * Con el fin de exportar los datos se grabará a un fichero RAF 
		 * de nombre “tvplasma.txt” el código, precio y descripción de 
		 * la enumeración de solo los televisores con pantalla de plasma, 
		 * el campo de la descripción se almacenara con una longitud de 50 
		 * caracteres. 
		 */
		try {
			RandomAccessFile f = new RandomAccessFile("tvplasma.txt", "rw");
			f.seek(f.length());
			for (Electrodomestico electrodomestico : v) {
				if (electrodomestico.getClass().getSimpleName().equals("Televisor")) {
					Televisor unTelevisor= new Televisor();
					unTelevisor=(Televisor) electrodomestico;
					if (unTelevisor.getTipoTelevisor()==TipoTelevisores.PLASMA) {
						f.writeInt(unTelevisor.getCodigo());
						f.writeFloat(unTelevisor.getPvp());
						f.writeUTF(formatearCadena(unTelevisor.getTipoTelevisor().getDescripcion(),50));
					}
							
				}
				
			}

			f.close();
		}catch(IOException e){
			System.out.println("Error");
		}
	}

	private String formatearCadena(String nombre, int lon) {
		if (nombre.length()>lon) {
			return nombre.substring(0, lon); 
		}
		else {
			for (int i=nombre.length(); i<lon; i++) {
				nombre=nombre +" ";
			}
			return nombre;
		}
	}

	public void modificarRAF() {
		/* Pregunta si deseas modificar 
		 * la descripción de un dato en el RAF, 
		 * en el caso de que sea cierto modifícala y 
		 * a continuación vuelve a mostrar el archivo modificado
		 */
		Scanner in= new Scanner(System.in);
		System.out.println("¿Deseas modificar la descripcion de un TV?");
		String respuesta=in.nextLine();
		if (respuesta.equalsIgnoreCase("si")==true){
			try {
				System.out.println("¿Que descripcion quieres modificar?");
				String descripcionAModificar=in.nextLine();
				RandomAccessFile f = new RandomAccessFile("tvplasma.txt", "rw");
				boolean finArchivo=false;
				boolean encontrado=false;
				do {
					try {
						int codigo= f.readInt();
						float pvp=f.readFloat();
						String descripcion=f.readUTF();
						if (descripcion.trim().equalsIgnoreCase(descripcionAModificar)){
							System.out.println("Nueva descripcion= ");
							String newDescripcion=in.nextLine();
							f.seek(f.getFilePointer()-(2+50));
							f.writeUTF(formatearCadena(newDescripcion,50));
							encontrado=true;
						}
					}catch(EOFException e) {
						finArchivo=true;
					}
				}while(finArchivo==false);
				f.close();
				if (encontrado==false) {
					System.out.println("la descripcion no ha sido encontrada");
				}
			}catch(IOException e){
				System.out.println("Error");
			}
		}
		else {
			System.out.println("Ok, los datos no se modifican");
		}
		
	}
	public void visualizarRAF() {
		/*Una vez creado el archivo vuelve a acceder a él para 
		 * mostrarlo por pantalla. Pregunta si deseas modificar 
		 * la descripción de un dato en el RAF, 
		 * en el caso de que sea cierto modifícala y 
		 * a continuación vuelve a mostrar el archivo modificado
		 */
		System.out.println("****  INFORMACION DE TV DE PLASMA ****");
		try {
			RandomAccessFile f = new RandomAccessFile("tvplasma.txt", "rw");
			f.seek(0);//no es necesario
			boolean finArchivo=false;
			do {
				try {
					int codigo= f.readInt();
					float pvp=f.readFloat();
					String descripcion=f.readUTF();
					System.out.println("Codigo = " + codigo);
					System.out.println("PVP = " + pvp);
					System.out.println("Descripcion = " + descripcion);
				}catch(EOFException e) {
					finArchivo=true;
				}
			}while(finArchivo==false);
			f.close();
		}catch(IOException e){
			System.out.println("Error");
		}
		
	}
	
}

package alumnos;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RAF {

	private Scanner scan = new Scanner(System.in);

	public void comprobarRAF(ArrayList<Alumno> alumnos, String nombreArchivo) {
		File f = new File(nombreArchivo);
		if (f.exists()) {
			System.out.println("El colegio " + nombreArchivo + " ya tiene un registro");
			boolean fin = false;
			do {
				System.out.println("Deseas añadir datos a este?");
				String respuesta = scan.next();
				if (respuesta.trim().toLowerCase().equalsIgnoreCase("si")) {
					addRAF(alumnos, nombreArchivo);
					fin=true;
				}
				if (respuesta.trim().toLowerCase().equalsIgnoreCase("no")) {
					borrarRAF(nombreArchivo);
					crearRAF(alumnos, nombreArchivo);
					fin=true;
				} 
			} while (!fin);
		}
	}
	
	public void addRAF(ArrayList<Alumno> alumnos, String nombreArchivo) {

		try {
			RandomAccessFile f = new RandomAccessFile(nombreArchivo, "rw");

			// LEER
			f.seek(f.length());
			for (Alumno alumno : alumnos) {
				f.writeUTF(alumno.getNombre());
				f.writeUTF(alumno.getCiclo());
				f.writeByte(alumno.getCurso());
				f.writeInt(alumno.getCantidadModulos());
				for (int i = 0; i < alumno.getCantidadModulos(); i++) {
					f.writeUTF(alumno.getNombreModulo(i));
					f.writeFloat(alumno.getNotaModulo(i));
				}
			}
			f.close();
		} catch (IOException e) {
			System.out.println("Algo ha fallado");
		}

	}

	public void crearRAF(ArrayList<Alumno> alumnos, String nombreArchivo) {

		try {
			RandomAccessFile f = new RandomAccessFile(nombreArchivo, "rw");

			// LEER
			for (Alumno alumno : alumnos) {
				f.writeUTF(alumno.getNombre());
				f.writeUTF(alumno.getCiclo());
				f.writeByte(alumno.getCurso());
				f.writeInt(alumno.getCantidadModulos());
				for (int i = 0; i < alumno.getCantidadModulos(); i++) {
					f.writeUTF(alumno.getNombreModulo(i));
					f.writeFloat(alumno.getNotaModulo(i));
				}
			}
			f.close();
		} catch (IOException e) {
			System.out.println("Algo ha fallado");
		}

	}

	public void buscarRAF(String nombreArchivo) {

		System.out.println("Que nombre quieres buscar?:");
		String nombreBusqueda = scan.next();
		boolean encontrado = false;
		try {
			RandomAccessFile f = new RandomAccessFile(nombreArchivo, "rw");

			boolean fin = false;

			do {
				try {
					String nombre = f.readUTF();
					if (nombre.trim().toLowerCase().equalsIgnoreCase(nombreBusqueda.trim().toLowerCase())) {
						System.out.println("El alumno existe");
						encontrado = true;
					}
					f.readUTF();
					f.readByte();
					int cantidadModulos = f.readInt();
					for (int i = 0; i < cantidadModulos; i++) {
						f.readUTF();
						f.readFloat();
					}

				} catch (EOFException e) {
					fin = true;
				}
			} while (!fin);
			f.close();
		} catch (IOException e) {
			System.out.println("Algo ha fallado");
		}
		if (!encontrado) {
			System.out.println("No se ha encontrado");
		}
	}

	public void visualizarRAF(String nombreArchivo) {

		try {
			RandomAccessFile f = new RandomAccessFile(nombreArchivo, "rw");

			System.out.println("***CONTENIDO DEL COLEGIO " + nombreArchivo.toUpperCase() + "***");
			boolean fin = false;
			do {
				try {
					String nombre = f.readUTF();
					String ciclo = f.readUTF();
					byte curso = f.readByte();
					int cantidadModulos = f.readInt();
					System.out.println("- Nombre = " + nombre);
					System.out.println("- Ciclo = " + ciclo);
					System.out.println("- Curso = " + curso);
					System.out.println("- Modulos = " + cantidadModulos);
					for (int i = 0; i < cantidadModulos; i++) {
						String nombreModulo = f.readUTF();
						float nota = f.readFloat();
						System.out.println("  - Modulo: " + nombreModulo);
						System.out.println("  - Nota: " + nota);
					}

				} catch (EOFException e) {
					fin = true;
				}
			} while (!fin);
			f.close();
		} catch (IOException e1) {
			System.out.println("Algo ha fallado");
		}
	}

	public void remplazarModuloRAF(String nombreArchivo) {

		System.out.println("Que alumno quieres modificar?:");
		String buscarNombre = scan.next();

		try {
			RandomAccessFile f = new RandomAccessFile(nombreArchivo, "rw");

			boolean fin = false;
			do {
				try {
					String nombre = f.readUTF();
					if (nombre.trim().toLowerCase().equalsIgnoreCase(buscarNombre.trim().toLowerCase())) {
						System.out.println("Que modulo quieres remplazar?:");
						String buscarModulo = scan.next();
						f.readUTF();
						f.readByte();
						int cantidadModulos = f.readInt();
						for (int i = 0; i < cantidadModulos; i++) {
							String modulo = f.readUTF();
							if (modulo.trim().toLowerCase().equalsIgnoreCase(buscarModulo)) {
								f.seek(f.getFilePointer() - 12);
								String nuevoModulo = "";
								do {
									System.out.println("Introduce el nuevo nombre de modulo:");
									nuevoModulo = scan.next();
								} while (nuevoModulo.length() > 10);
								nuevoModulo = formatear(nuevoModulo, 10);
								f.writeUTF(nuevoModulo);
							}
							f.readFloat();
						}
					}
					f.readUTF();
					f.readByte();
					int cantidadModulos = f.readInt();
					for (int i = 0; i < cantidadModulos; i++) {
						f.readUTF();
						f.readFloat();
					}
				} catch (EOFException e) {
					fin = true;
				}
			} while (!fin);
			f.close();
		} catch (IOException e) {
			System.out.println("Algo ha fallado");
		}

	}

	private String formatear(String nombre, int longitud) {
		for (int j = nombre.length(); j < longitud; j++) {
			nombre += " ";
		}
		return nombre;
	}

	public void remplazarNotaRAF(String nombreArchivo) {

		System.out.println("Que alumno quieres modificar?:");
		String buscarNombre = scan.next();

		try {
			RandomAccessFile f = new RandomAccessFile(nombreArchivo, "rw");

			boolean fin = false;
			do {
				try {
					String nombre = f.readUTF();
					if (nombre.trim().toLowerCase().equalsIgnoreCase(buscarNombre.trim().toLowerCase())) {
						System.out.println("Que modulo quieres remplazar?:");
						String buscarModulo = scan.next();
						f.readUTF();
						f.readByte();
						int cantidadModulos = f.readInt();
						for (int i = 0; i < cantidadModulos; i++) {
							String modulo = f.readUTF();
							if (modulo.trim().toLowerCase().equalsIgnoreCase(buscarModulo)) {
								System.out.println("Que nota quieres poner:");
								float nota = 0;
								boolean fin2 = false;
								do {
									try {
										System.out.println("Nota");
										nota = scan.nextFloat();
										if (nota > 0 && nota <= 10) {
											fin2 = true;
										}
									} catch (InputMismatchException e) {
										System.out.println("Introduce del 1 al 10");
										fin2 = false;
										scan.next();
									}
								} while (!fin2);

								f.writeFloat(nota);
								System.out.println("Nota cambiada");
							}
							f.readFloat();
						}
					}
					f.readUTF();
					f.readByte();
					int cantidadModulos = f.readInt();
					for (int i = 0; i < cantidadModulos; i++) {
						f.readUTF();
						f.readFloat();
					}
				} catch (EOFException e) {
					fin = true;
				}
			} while (!fin);
			f.close();
		} catch (IOException e) {
			System.out.println("Algo ha fallado");
		}

	}

	public void alumnoConMasNota(String nombreArchivo) {

		String alumnoMax = "";
		float notaMax = 0;

		try {
			RandomAccessFile f = new RandomAccessFile(nombreArchivo, "rw");

			boolean fin = false;
			do {
				try {
					float notaAlumno = 0;
					String nombre = f.readUTF();
					f.readUTF();
					f.readByte();
					int cantidadModulos = f.readInt();
					for (int i = 0; i < cantidadModulos; i++) {
						f.readUTF();
						notaAlumno += f.readFloat();
					}
					if ((notaAlumno / cantidadModulos) > notaMax) {
						alumnoMax = nombre;
						notaMax = notaAlumno / cantidadModulos;
					}

				} catch (EOFException e) {
					fin = true;
				}
			} while (!fin);
			f.close();
		} catch (IOException e1) {
			System.out.println("Algo ha fallado");
		}

		System.out.println("El alumno con mas nota media es: " + alumnoMax + "\n con una media de: " + notaMax);

	}

	public void borrarRAF(String nombreArchivo) {

		System.out.println("Deseas guardar antes de salir?");
		String respuesta = scan.next();
		if (respuesta.trim().toLowerCase().equalsIgnoreCase("no")) {
			File file = new File(nombreArchivo);
			file.delete();
		}
		

	}

}

package main;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Banco {
	
	private String nombreBanco;
	ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	ArrayList<String> lista = new ArrayList<String>();
	
	public String getNombreBanco() {
		return nombreBanco;
	}
	public void setNombreBanco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}

	
	void rellenar() {
		Scanner scan = new Scanner(System.in);
		String nombre = "";
		while (!nombre.equals("*")) {
			System.out.println("Introduce un nombre (* fin) : ");
			nombre = scan.next();
			if (!nombre.equals("*")) {
				System.out.println("Introduce el salario: ");
				int salario = scan.nextInt();
				this.clientes.add(new Cliente(nombre+":"+salario));
			}
						
		}
		
	}
	
	void visualizar() {
		for (Cliente cliente : clientes) {
			cliente.visualizar();
		}
	}
	
	void ordenar() {
		
		for (Cliente cliente : clientes) {
			lista.add(cliente.getDatos());
		}
		Collections.sort(lista);
	}
	
	void imprimir() {
		Scanner scan = new Scanner(System.in);
		PrintWriter destino;
		System.out.println("Introduce nombre del archivo de salida: ");
		String salida = scan.next();
		
		try {
			destino = new PrintWriter (new FileWriter(salida+".txt",true));
							
			for (String string : lista) {
				String v[] = string.split(":");
				for (int i = 0; i < v.length; i++) {
					System.out.println();
					if (i%2==0) {
						destino.println("Nombre : "+v[i]);
					}
					if (i%2!=0) {
						destino.println("Sueldo : "+v[i]);
					}
				}
			}
						
			destino.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

package main;

import Personal.Empresa;

public class Main {

	public static void main(String[] args) {

		Empresa empresa = new Empresa("Montessori");
		
		empresa.rellenarEmpresa();
		empresa.visualizarEmpresa();

	}

}

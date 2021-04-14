package main;

import empresa.Empleado;
import empresa.Empresa;
import empresa.Jefe;

public class Main {

	public static void main(String[] args) {

		Empresa empresa = new Empresa();
		Empleado empleado = new Empleado();
		Jefe jefe = new Jefe();

		empresa.rellenarEmpresa();
		empresa.visualizarEmpresa();

	}

}

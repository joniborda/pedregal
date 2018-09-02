package edu.unlam.pedregal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pedregal {
	public static void main(String args[]) throws FileNotFoundException {
		String path = "src/archivos/";
		File entrada = new File(path + "pedregal.in");
		File salida = new File(path + "pedregal.out");
		Scanner scEntrada = new Scanner(entrada);
		Scanner scSalida = new Scanner(salida);

		Pedregal.porCordenadas(new File(path + "pedregal.in"), new File(path + "pedregal.out"));
		if (scSalida.next().equals("NO")) {
			System.out.println("NO PUEDE IDENTIFICAR SI ES CORRECTO");
			scEntrada.close();
			scSalida.close();
			return;
		}

		int dimensionX = Integer.valueOf(scEntrada.next());
		int dimensionY = Integer.valueOf(scEntrada.next());
		int frente = Integer.valueOf(scEntrada.next());
		int fondo = Integer.valueOf(scEntrada.next());
		int cantidadPedregales = scEntrada.nextInt();
		scEntrada.nextLine();// LEE UNA LINEA EN BLANCO Y NO SE

		String[] pedregales = new String[cantidadPedregales];

		for (int i = 0; i < cantidadPedregales; i++) {
			pedregales[i] = scEntrada.nextLine();
		}

		int inferiorX = Integer.valueOf(scSalida.next());
		int inferiorY = Integer.valueOf(scSalida.next());
		char orientacion = scSalida.next().charAt(0);

		String[] casa = new String[frente * fondo];
		if (!(orientacion == 'N' || orientacion == 'S')) {
			int aux = frente;
			frente = fondo;
			fondo = aux;
		}

		// ME FIJO SI LOS PEDREGALES ESTAN EN LA CASA EMPEZANDO POR LA X
		for (int i = 0; i < frente; i++) {
			for (int j = 0; j < fondo; j++) {
				for (int o = 0; o < pedregales.length; o++) {
					if (pedregales[o].equals(String.valueOf(inferiorX + i) + ' ' + String.valueOf(inferiorY + j))) {
						System.out.println("SALIDA INCORRECTA");
						return;
					}
				}
				// SI LA CASA SE VA DEL TERRENO
				if (inferiorX + i > dimensionX || inferiorY + j > dimensionY) {
					System.out.println("SALIDA INCORRECTA");
					return;
				}
			}
		}

		System.out.println("SALIDA CORRECTA");
		scEntrada.close();
		scSalida.close();
	}

	private static void porCordenadas(File entrada, File salida) throws FileNotFoundException {
		Scanner scEntrada = new Scanner(entrada);
		Scanner scSalida = new Scanner(salida);

		if (scSalida.next().equals("NO")) {
			System.out.println("NO PUEDE IDENTIFICAR SI ES CORRECTO");
			scEntrada.close();
			scSalida.close();
			return;
		}

		int dimensionX = scEntrada.nextInt();
		int dimensionY = scEntrada.nextInt();
		int frente = scEntrada.nextInt();
		int fondo = scEntrada.nextInt();
		int cantidadPedregales = scEntrada.nextInt();
		scEntrada.nextLine();// LEE UNA LINEA EN BLANCO Y NO SE

		int inferiorX = scSalida.nextInt();
		int inferiorY = scSalida.nextInt();
		char orientacion = scSalida.next().charAt(0);

		if (!(orientacion == 'N' || orientacion == 'S')) {
			int aux = frente;
			frente = fondo;
			fondo = aux;
		}

		int pedregalX = 0;
		int pedregalY = 0;
		for (int i = 0; i < cantidadPedregales; i++) {
			pedregalX = scEntrada.nextInt();
			pedregalY = scEntrada.nextInt();

			if (pedregalX >= inferiorX && pedregalX < inferiorX + frente && pedregalY >= inferiorY
					&& pedregalY < inferiorY + fondo) {
				System.out.println("El pedregal (" + pedregalX + "," + pedregalY + ") está dentro de la casa");
			}

			if (inferiorX + frente > dimensionX || inferiorY + fondo > dimensionY) {
				System.out.println("Casa fuera del terreno");
			}
		}

		System.out.println("Salida correcta");
		scEntrada.close();
		scSalida.close();
	}
}
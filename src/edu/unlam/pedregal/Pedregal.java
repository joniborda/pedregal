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
		if (scSalida.next().equals("NO")) {
			scEntrada.close();
			scSalida.close();
			return;
		}

		int dx = Integer.valueOf(scEntrada.next());
		int dy = Integer.valueOf(scEntrada.next());
		int frente = Integer.valueOf(scEntrada.next());
		int fondo = Integer.valueOf(scEntrada.next());
		int cantidadPedregales = scEntrada.nextInt();
		scEntrada.nextLine();// LEE UNA LINEA EN BLANCO Y NO SE

		String[] pedregales = new String[cantidadPedregales];

		for (int i = 0; i < cantidadPedregales; i++) {
			pedregales[i] = scEntrada.nextLine();
		}

		int aristaX = Integer.valueOf(scSalida.next());
		int aristaY = Integer.valueOf(scSalida.next());
		char orientacion = scSalida.next().charAt(0);

		String[] casa = new String[frente * fondo];
		int pos = 0;
		if (orientacion == 'N' || orientacion == 'S') {
			for (int i = 0; i < frente; i++) {
				for (int j = 0; j < fondo; j++) {
					casa[pos] = String.valueOf(aristaX + i) + ' ' + String.valueOf(aristaY + j);
					pos++;
				}
			}
		} else {
			for (int i = 0; i < fondo; i++) {
				for (int j = 0; j < frente; j++) {
					casa[pos] = String.valueOf(aristaX + i) + ' ' + String.valueOf(aristaY + j);
					pos++;
				}
			}
		}

		for (int i = 0; i < casa.length; i++) {
			for (int j = 0; j < pedregales.length; j++) {
				if (casa[i].equals(pedregales[j])) {
					System.out.println("SALIDA INCORRECTA");
					return;
				}
			}
		}

		for (int i = 0; i < casa.length; i++) {
			String[] valores = casa[i].split(" ");
			int x = Integer.valueOf(valores[0]);
			int y = Integer.valueOf(valores[1]);
			if (x > dx || y > dy) {
				System.out.println("SALIDA INCORRECTA");
				return;
			}

		}
		System.out.println("SALIDA CORRECTA");
		scEntrada.close();
		scSalida.close();
	}
}
package application;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Projeto do curso.");
		
		Scanner sc = new Scanner(System.in);
		int coluna = sc.nextInt();
		int linha = sc.nextInt();
		int posicao;
		int[][] matriz = new int[coluna][linha];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		posicao = sc.nextInt();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == posicao) {
					System.out.println("Position " + i + ", " + j + ":");
					if (j > 0) {
						System.out.println("Left: " + matriz[i][j-1]);
					}
					if (j < matriz[i].length-1) {
						System.out.println("Right: " + matriz[i][j+1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matriz[i-1][j]);
					}
					if (i < matriz.length-1) {
						System.out.println("Down: " + matriz[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
		
	}
}
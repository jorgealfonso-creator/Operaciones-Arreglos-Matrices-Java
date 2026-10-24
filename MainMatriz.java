package Problema4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainMatriz {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        IntercambioFilas obj = new IntercambioFilas();
        int[][] matriz = new int[4][4];
        try {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.println("Ingrese el valor [" +
                            (i + 1) + "][" + (j + 1) + "]:");
                    matriz[i][j] = Integer.parseInt(br.readLine());
                }
            }
            obj.setMatriz(matriz);
            System.out.println("Matriz original:");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println("Ingrese la primera fila (1 a 4):");
            int fila1 = Integer.parseInt(br.readLine());
            System.out.println("Ingrese la segunda fila (1 a 4):");
            int fila2 = Integer.parseInt(br.readLine());
            if (fila1 < 1 || fila1 > 4 ||
                    fila2 < 1 || fila2 > 4) {
                System.out.println("Las filas deben estar entre 1 y 4.");
                return;
            }
            int[][] modificada = obj.intercambiarFilas(
                    fila1 - 1, fila2 - 1);
            System.out.println("Matriz modificada:");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(modificada[i][j] + "\t");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Error al ingresar los datos.");
        }
    }
}

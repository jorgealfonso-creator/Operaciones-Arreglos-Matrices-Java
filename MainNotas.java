package Problema3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainNotas {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        NotasEstudiantes obj = new NotasEstudiantes();
        double[][] notas = new double[25][3];
        try {
            for (int i = 0; i < 25; i++) {
                System.out.println("Estudiante " + (i + 1));
                for (int j = 0; j < 3; j++) {
                    System.out.println("Ingrese la nota " + (j + 1) + ":");
                    notas[i][j] = Double.parseDouble(br.readLine());
                }
            }
            obj.setNotas(notas);
            double[][] matriz = obj.getNotas();
            System.out.println("RESULTADOS:");
            for (int i = 0; i < 25; i++) {
                System.out.print("Estudiante " + (i + 1) + ": Notas = ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(matriz[i][j]);
                    if (j < 2) {
                        System.out.print(", ");
                    }
                }
                System.out.printf(" | Promedio = %.2f%n",
                        obj.calcularPromedio(i));
            }
        } catch (Exception e) {
            System.out.println("Error al ingresar las notas.");
        }
    }
}

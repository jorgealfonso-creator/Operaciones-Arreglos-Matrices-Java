package Problema1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainDistancia {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        DistanciaMaxima obj = new DistanciaMaxima();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Ingrese el numero " + (i + 1) + ":");
                int numero = Integer.parseInt(br.readLine());
                obj.asignar(i, numero);
            }
            System.out.println("Valor maximo: " + obj.calcularMaximo());
            for (int i = 0; i < 5; i++) {
                System.out.println("Numero: " + obj.obtenerNumero(i)
                        + " | Distancia: " + obj.calcularDistancia(i));
            }
        } catch (Exception e) {
            System.out.println("Error al ingresar los datos.");
        }
    }
}
package Problema2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainVector {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        OperacionesVector obj = new OperacionesVector();
        try {
            System.out.println("Ingrese la cantidad de elementos:");
            int n = Integer.parseInt(br.readLine());
            if (n <= 0) {
                System.out.println("La cantidad debe ser mayor que cero.");
                return;
            }
            int[] vector = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Ingrese el elemento " + (i + 1) + ":");
                vector[i] = Integer.parseInt(br.readLine());
            }
            obj.setVector(vector);
            System.out.println("Ingrese el valor t que desea sumar:");
            int t = Integer.parseInt(br.readLine());
            System.out.println("Ingrese el numero que desea buscar:");
            int buscado = Integer.parseInt(br.readLine());
            int[] original = obj.getVector();
            int[] invertido = obj.invertirVector();
            int[] aumentado = obj.sumarValor(t);
            System.out.println("Vector original:");
            for (int i = 0; i < original.length; i++) {
                System.out.print(original[i] + " ");
            }
            System.out.println("\nVector invertido:");
            for (int i = 0; i < invertido.length; i++) {
                System.out.print(invertido[i] + " ");
            }
            System.out.println("\nVector con valor sumado:");
            for (int i = 0; i < aumentado.length; i++) {
                System.out.print(aumentado[i] + " ");
            }
            System.out.println("\nApariciones del numero: "
                    + obj.contarNumero(buscado));
            System.out.println("Cantidad de pares: "
                    + obj.contarPares());
            System.out.println("Suma total: "
                    + obj.calcularSuma());
        } catch (Exception e) {
            System.out.println("Error al ingresar los datos.");
        }
    }
}

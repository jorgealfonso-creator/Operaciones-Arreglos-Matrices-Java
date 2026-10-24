
package Problema2;
public class OperacionesVector {
    private int[] vector;
    public void setVector(int[] vector) {
        this.vector = vector;
    }
    public int[] getVector() {
        return vector;
    }
    public int[] invertirVector() {
        int[] invertido = new int[vector.length];
        for (int i = 0; i < vector.length; i++) {
            invertido[i] = vector[vector.length - 1 - i];
        }
        return invertido;
    }
    public int[] sumarValor(int t) {
        int[] resultado = new int[vector.length];
        for (int i = 0; i < vector.length; i++) {
            resultado[i] = vector[i] + t;
        }
        return resultado;
    }
    public int contarNumero(int n) {
        int contador = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == n) {
                contador++;
            }
        }
        return contador;
    }
    public int contarPares() {
        int pares = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                pares++;
            }
        }
        return pares;
    }
    public int calcularSuma() {
        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma = suma + vector[i];
        }
        return suma;
    }
}


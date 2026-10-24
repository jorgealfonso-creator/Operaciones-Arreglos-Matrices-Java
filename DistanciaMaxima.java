package Problema1;

public class DistanciaMaxima {

    private int[] numeros = new int[5];
    public void asignar(int posicion, int numero) {
        numeros[posicion] = numero;
    }
    public int calcularMaximo() {
        int maximo = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }
        return maximo;
    }
    public int calcularDistancia(int posicion) {
        return calcularMaximo() - numeros[posicion];
    }
    public int obtenerNumero(int posicion) {
        return numeros[posicion];
    }
}

package Problema4;

public class IntercambioFilas {
    private int[][] matriz;
    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }
    public int[][] getMatriz() {
        return matriz;
    }
    public int[][] intercambiarFilas(int i, int j) {
        int[][] modificada = new int[4][4];
        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                modificada[fila][columna] = matriz[fila][columna];
            }
        }
        for (int columna = 0; columna < 4; columna++) {
            int auxiliar = modificada[i][columna];
            modificada[i][columna] = modificada[j][columna];
            modificada[j][columna] = auxiliar;
        }
        return modificada;
    }
}

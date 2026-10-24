package Problema3;

public class NotasEstudiantes {
    private double[][] notas;
    public void setNotas(double[][] notas) {
        this.notas = notas;
    }
    public double[][] getNotas() {
        return notas;
    }
    public double calcularPromedio(int estudiante) {
        double suma = 0;
        for (int j = 0; j < 3; j++) {
            suma = suma + notas[estudiante][j];
        }
        return suma / 3;
    }
}


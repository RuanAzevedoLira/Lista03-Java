/* Elabore um programa que preencha uma matriz 10 ×10 com números reais, 
execute as trocas especificadas a seguir e mostre a matriz resultante:
a. A linha 2 com a linha 8;
b. A coluna 4 com a coluna 10;
c. A diagonal principal com a diagonal secundária;
d. A linha 5 com a coluna 10. */

import java.util.Random;

public class TrocaMatriz {
    public static void main(String[] args) {
        // Criação e inicialização da matriz (10x10) com números reais
        double[][] matriz = new double[10][10];
        preencherMatriz(matriz);

        // Trocas especificadas
        trocarLinhas(matriz, 1, 7);
        trocarColunas(matriz, 3, 9);
        trocarDiagonais(matriz);
        trocarLinhaComColuna(matriz, 4, 9);

        // Impressão da matriz resultante
        System.out.println("Matriz Resultante:");
        imprimirMatriz(matriz);
    }

    // Método para preencher a matriz com números aleatórios
    public static void preencherMatriz(double[][] matriz) {
        Random random = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = random.nextDouble() * 10; // Números reais entre 0 e 10
            }
        }
    }

    // Método para trocar duas linhas da matriz
    public static void trocarLinhas(double[][] matriz, int linha1, int linha2) {
        double[] temp = matriz[linha1];
        matriz[linha1] = matriz[linha2];
        matriz[linha2] = temp;
    }

    // Método para trocar duas colunas da matriz
    public static void trocarColunas(double[][] matriz, int coluna1, int coluna2) {
        for (int i = 0; i < matriz.length; i++) {
            double temp = matriz[i][coluna1];
            matriz[i][coluna1] = matriz[i][coluna2];
            matriz[i][coluna2] = temp;
        }
    }

    // Método para trocar a diagonal principal com a diagonal secundária
    public static void trocarDiagonais(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            double temp = matriz[i][i];
            matriz[i][i] = matriz[i][matriz.length - 1 - i];
            matriz[i][matriz.length - 1 - i] = temp;
        }
    }

    // Método para trocar uma linha com uma coluna da matriz
    public static void trocarLinhaComColuna(double[][] matriz, int linha, int coluna) {
        double[] temp = new double[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            temp[i] = matriz[i][linha];
            matriz[i][linha] = matriz[linha][i];
            matriz[linha][i] = temp[i];
        }
    }

    // Método para imprimir a matriz
    public static void imprimirMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("%.2f\t", matriz[i][j]);
            }
            System.out.println();
        }
    }
}

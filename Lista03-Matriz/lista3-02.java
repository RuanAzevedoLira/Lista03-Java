/* Escreva um programa querecebe uma matriz 3 ×4 com números reais e retorne:
a.Asoma dos elementos de cada linha;
b.A soma dos elementos de cada coluna. */

import java.util.Scanner;

public class SomaMatriz {
    public static void main(String[] args) {
        // Criação e inicialização da matriz (3x4)
        double[][] matriz = new double[3][4];

        // Preenchimento da matriz pelo usuário
        preencherMatriz(matriz);

        // Cálculo e impressão da soma dos elementos de cada linha
        System.out.println("Soma dos elementos de cada linha:");
        for (int i = 0; i < matriz.length; i++) {
            double somaLinha = calcularSomaLinha(matriz, i);
            System.out.println("Linha " + (i + 1) + ": " + somaLinha);
        }

        // Cálculo e impressão da soma dos elementos de cada coluna
        System.out.println("\nSoma dos elementos de cada coluna:");
        for (int j = 0; j < matriz[0].length; j++) {
            double somaColuna = calcularSomaColuna(matriz, j);
            System.out.println("Coluna " + (j + 1) + ": " + somaColuna);
        }
    }

    // Método para preencher a matriz
    public static void preencherMatriz(double[][] matriz) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os elementos da matriz (3x4):");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }
    }

    // Método para calcular a soma dos elementos de uma linha específica
    public static double calcularSomaLinha(double[][] matriz, int linha) {
        double soma = 0;

        for (int j = 0; j < matriz[0].length; j++) {
            soma += matriz[linha][j];
        }

        return soma;
    }

    // Método para calcular a soma dos elementos de uma coluna específica
    public static double calcularSomaColuna(double[][] matriz, int coluna) {
        double soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][coluna];
        }

        return soma;
    }
}

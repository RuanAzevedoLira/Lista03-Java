/* Em teoria dos sistemas, define-se o elemento MINMAX de uma matriz como o maior elemento da linha 
em que se encontra o menor elemento da matriz. Elabore um programa que lê uma matriz 4 x 7 com números reais, 
alcule e mostre seu MINMAX e sua posição (linha e coluna). */

import java.util.Scanner;

public class MinMaxMatriz {
    public static void main(String[] args) {
        // Criação e inicialização da matriz (4x7) com números reais
        double[][] matriz = new double[4][7];

        // Preenchimento da matriz pelo usuário
        preencherMatriz(matriz);

        // Cálculo do MINMAX e sua posição
        double[] minMaxInfo = calcularMinMax(matriz);

        // Impressão do resultado
        System.out.println("O MINMAX da matriz é: " + minMaxInfo[0]);
        System.out.println("Posição (linha, coluna): (" + (int) minMaxInfo[1] + ", " + (int) minMaxInfo[2] + ")");
    }

    // Método para preencher a matriz com números reais
    public static void preencherMatriz(double[][] matriz) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os elementos da matriz (4x7):");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }
    }

    // Método para calcular o MINMAX e sua posição na matriz
    public static double[] calcularMinMax(double[][] matriz) {
        double min = matriz[0][0];
        double maxOfMinRow = matriz[0][0];
        int minRow = 0;
        int minCol = 0;

        for (int i = 0; i < matriz.length; i++) {
            // Encontrar o menor elemento da linha
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] < min) {
                    min = matriz[i][j];
                    minRow = i;
                    minCol = j;
                }
            }

            // Atualizar o MAX da linha se necessário
            if (matriz[i][minCol] > maxOfMinRow) {
                maxOfMinRow = matriz[i][minCol];
            }
        }

        // Retornar o resultado em um array de double
        return new double[]{maxOfMinRow, minRow + 1, minCol + 1};
    }
}

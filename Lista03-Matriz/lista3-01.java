/* Faça  um  programa  que  preencha  uma  matriz  M  (2 ×2),  calcule  e  mostre  a  matriz  R, 
resultante da multiplicação dos elementos de M pelo seu maior elemento. */

import java.util.*;

import java.util.Scanner;

public class MultiplicacaoMatriz {
    public static void main(String[] args) {

        // Criação e inicialização da matriz M (2x2)
        int[][] matrizM = new int[2][2];
        
        // Preenchimento da matriz M pelo usuário
        preencherMatriz(matrizM);

        // Cálculo do maior elemento da matriz M
        int maiorElemento = encontrarMaiorElemento(matrizM);

        // Criação e preenchimento da matriz R (resultado)
        int[][] matrizR = multiplicarPorMaiorElemento(matrizM, maiorElemento);

        // Impressão da matriz R
        System.out.println("Matriz Resultante (R):");
        imprimirMatriz(matrizR);
    }

    // Método para preencher a matriz M
    public static void preencherMatriz(int[][] matriz) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite os elementos da matriz M (2x2):");
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Elemento M[" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = s.nextInt();
            }
        }
    }

    // Método para encontrar o maior elemento da matriz M
    public static int encontrarMaiorElemento(int[][] matriz) {
        int maior = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }

        return maior;
    }

    // Método para multiplicar os elementos de M pelo seu maior elemento e armazenar em R
    public static int[][] multiplicarPorMaiorElemento(int[][] matriz, int maiorElemento) {
        int[][] resultado = new int[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                resultado[i][j] = matriz[i][j] * maiorElemento;
            }
        }

        return resultado;
    }

    // Método para imprimir uma matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

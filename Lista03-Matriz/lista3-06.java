/* Faça um programa que preencha uma matriz 10 × 3 com as notas de dez estudantes em três  provas.  
O  programa  deverá  mostrar  um  relatório  com  o  número  dos  estudantes (número  da  linha)  
e  a  prova  em  que  cada  estudante  obteve  a  menor  nota.  Ao  final  do relatório, 
deverá  mostrar  quantos  estudantes  tiveram  a  menor  nota  em  cada  uma  das provas: 
na prova 1, na prova 2 e na prova 3. */

import java.util.Scanner;

public class RelatorioNotas {
    public static void main(String[] args) {
        // Criação e inicialização da matriz (10x3) com notas
        double[][] notas = new double[10][3];

        // Preenchimento da matriz pelo usuário
        preencherNotas(notas);

        // Geração do relatório
        gerarRelatorio(notas);
    }

    // Método para preencher a matriz com notas
    public static void preencherNotas(double[][] matriz) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as notas dos estudantes (10x3):");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Nota do estudante " + (i + 1) + " na prova " + (j + 1) + ": ");
                matriz[i][j] = scanner.nextDouble();
            }
        }
    }

    // Método para gerar o relatório
    public static void gerarRelatorio(double[][] notas) {
        System.out.println("\nRelatório de Notas:");

        // Array para armazenar a prova em que cada estudante obteve a menor nota
        int[] provaMenorNota = new int[notas.length];

        // Inicialização do array com -1 (indicando que a prova ainda não foi definida)
        for (int i = 0; i < provaMenorNota.length; i++) {
            provaMenorNota[i] = -1;
        }

        // Loop para encontrar a prova em que cada estudante obteve a menor nota
        for (int i = 0; i < notas.length; i++) {
            double menorNota = notas[i][0];
            int prova = 1;

            for (int j = 1; j < notas[0].length; j++) {
                if (notas[i][j] < menorNota) {
                    menorNota = notas[i][j];
                    prova = j + 1;
                }
            }

            provaMenorNota[i] = prova;
            System.out.println("Estudante " + (i + 1) + ": Menor nota na prova " + prova);
        }

        // Contagem de estudantes com menor nota em cada prova
        int[] contagemMenorNotaProva = new int[3];

        for (int i = 0; i < provaMenorNota.length; i++) {
            int prova = provaMenorNota[i] - 1;
            contagemMenorNotaProva[prova]++;
        }

        // Impressão da contagem de estudantes com menor nota em cada prova
        System.out.println("\nContagem de estudantes com menor nota em cada prova:");
        for (int i = 0; i < contagemMenorNotaProva.length; i++) {
            System.out.println("Prova " + (i + 1) + ": " + contagemMenorNotaProva[i] + " estudante(s)");
        }
    }
}

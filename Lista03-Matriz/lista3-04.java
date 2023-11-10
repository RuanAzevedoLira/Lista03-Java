/* Faça  um  programa  que lê o  nome  e duasnotas  de seis alunos.
Em  seguida, mostre  o relatórioa seguir:
Nome       |Nota 1|Nota 2| Média| Situação 
Estudante1 | 8,0  |  9,0 |  8,5 | Aprovado
Estudante2 | 4,0  |  5,0 |  4,5 | Reprovado

O programa, também, deve apresentar:
a.Média da turma;
b.Percentual de estudantes aprovados;
c.Percentual de estudantes reprovados. */

import java.util.Scanner;

public class RelatorioAlunos {
    public static void main(String[] args) {
        // Número de alunos
        int numeroAlunos = 6;

        // Arrays para armazenar os dados dos alunos
        String[] nomes = new String[numeroAlunos];
        double[] notas1 = new double[numeroAlunos];
        double[] notas2 = new double[numeroAlunos];
        double[] medias = new double[numeroAlunos];
        String[] situacoes = new String[numeroAlunos];

        // Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Preenchimento dos arrays com os dados dos alunos
        for (int i = 0; i < numeroAlunos; i++) {
            System.out.println("Informe o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();

            System.out.println("Informe a nota 1 do aluno " + (i + 1) + ": ");
            notas1[i] = scanner.nextDouble();

            System.out.println("Informe a nota 2 do aluno " + (i + 1) + ": ");
            notas2[i] = scanner.nextDouble();

            // Cálculo da média e situação
            medias[i] = (notas1[i] + notas2[i]) / 2;
            situacoes[i] = medias[i] >= 6 ? "Aprovado" : "Reprovado";

            // Limpar o buffer do scanner
            scanner.nextLine();
        }

        // Impressão do relatório
        System.out.println("Relatório de Alunos:");
        System.out.println("Nome\tNota 1\tNota 2\tMédia\tSituação");
        for (int i = 0; i < numeroAlunos; i++) {
            System.out.printf("%s\t%.1f\t%.1f\t%.1f\t%s\n", nomes[i], notas1[i], notas2[i], medias[i], situacoes[i]);
        }

        // Cálculo da média da turma
        double mediaTurma = calcularMediaTurma(medias);
        System.out.println("\nMédia da turma: " + mediaTurma);

        // Cálculo do percentual de estudantes aprovados
        double percentualAprovados = calcularPercentualAprovados(situacoes);
        System.out.println("Percentual de estudantes aprovados: " + percentualAprovados + "%");

        // Cálculo do percentual de estudantes reprovados
        double percentualReprovados = calcularPercentualReprovados(situacoes);
        System.out.println("Percentual de estudantes reprovados: " + percentualReprovados + "%");
    }

    // Método para calcular a média da turma
    public static double calcularMediaTurma(double[] medias) {
        double soma = 0;

        for (double media : medias) {
            soma += media;
        }

        return soma / medias.length;
    }

    // Método para calcular o percentual de estudantes aprovados
    public static double calcularPercentualAprovados(String[] situacoes) {
        int aprovados = 0;

        for (String situacao : situacoes) {
            if (situacao.equals("Aprovado")) {
                aprovados++;
            }
        }

        return ((double) aprovados / situacoes.length) * 100;
    }

    // Método para calcular o percentual de estudantes reprovados
    public static double calcularPercentualReprovados(String[] situacoes) {
        int reprovados = 0;

        for (String situacao : situacoes) {
            if (situacao.equals("Reprovado")) {
                reprovados++;
            }
        }

        return ((double) reprovados / situacoes.length) * 100;
    }
}

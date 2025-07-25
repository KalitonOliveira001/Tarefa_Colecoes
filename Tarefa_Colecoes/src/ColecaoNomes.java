
import java.util.Arrays;
import java.util.Scanner;

public class ColecaoNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Parte 1: Ler nomes e ordenar
        System.out.println("Digite nomes separados por vírgula (ex: Ana,João,Maria):");
        String entrada = scanner.nextLine(); // Lê a linha digitada

        // O comando split separa a string onde tem vírgula
        String[] nomes = entrada.split(",");

        // Organiza os nomes em ordem alfabética
        Arrays.sort(nomes);

        // Imprime os nomes organizados
        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome.trim());
        }

        // Pulando uma linha para separar as partes
        System.out.println("\n--- PARTE 2 ---");

        // Parte 2: Nome e Sexo separados por traço
        System.out.println("Digite nomes e sexo separados por traço e vírgula (ex: Ana-F,João-M):");
        String entradaGenero = scanner.nextLine(); // Lê a nova linha digitada

        String[] pessoas = entradaGenero.split(",");

        // Criando listas para separar masculino e feminino
        StringBuilder masculinos = new StringBuilder();
        StringBuilder femininos = new StringBuilder();

        // Para cada pessoa, separar o nome do sexo e agrupar
        for (String pessoa : pessoas) {
            String[] partes = pessoa.split("-");

            if (partes.length == 2) {
                String nome = partes[0].trim();
                String sexo = partes[1].trim().toUpperCase();

                if (sexo.equals("M")) {
                    masculinos.append(nome).append("\n");
                } else if (sexo.equals("F")) {
                    femininos.append(nome).append("\n");
                }
            }
        }

        // Imprimir os grupos separados
        System.out.println("Grupo Masculino:");
        System.out.println(masculinos);

        System.out.println("Grupo Feminino:");
        System.out.println(femininos);

        scanner.close(); // Fecha o scanner
    }
}

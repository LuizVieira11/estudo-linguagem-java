package Códigos;

import java.util.ArrayList;
import java.util.Scanner;

public class BancoOrganizadorAtivos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList <String> ativos = new ArrayList <> ();

        int quantidadeAtivos = scanner.nextInt();

        for (int i = 0; i <= quantidadeAtivos; i++) {
            String codigoAtivo = scanner.nextLine();
            ativos.add(codigoAtivo);
        }

        ativos.stream().sorted().toList().forEach(System.out::println);

    }

}

/*                                   Descrição

Após uma análise cuidadosa realizada pela equipe de desenvolvimento de uma empresa bancaria,
foi identificado a necessidade de uma nova funcionalidade para otimizar os processos e melhorias
da experiência dos usuários. Agora, sua tarefa é implementar uma solução que organize em ordem
lfabética uma lista de ativos que será informada pelos usuários. Os ativos são representados por
strings que representam seus tipos, como por exemplo: Reservas de liquidez, Ativos intangiveis e dentre outros.
 */

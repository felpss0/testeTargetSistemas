package teste_Estagio;

import java.util.Scanner;

public class VerificaLetraA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita uma string do usuário
        System.out.print("Informe uma palavra: ");
        String input = scanner.nextLine();

        // Inicializa a contagem
        int contador = 0;

        // Verifica a existência de 'a' ou 'A' na string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'a' || c == 'A') {
                contador++;
            }
        }

        // Exibe o resultado
        if (contador > 0) {
            System.out.println("A letra 'a' ou 'A' aparece " + contador + " vezes.");
        } else {
            System.out.println("A letra 'a' ou 'A' não aparece na string.");
        }

        scanner.close();
    }
}

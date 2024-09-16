package teste_Estagio;

import java.util.Scanner;

public class FibonacciChecker {

    // Função para verificar se um número pertence à sequência de Fibonacci
    public static boolean isFibonacci(int n) {
        int a = 0, b = 1, c = 0;
        
        // Gera a sequência de Fibonacci até que c seja maior ou igual a n
        while (c < n) {
            c = a + b;
            a = b;
            b = c;
        }

        // Se o número gerado for igual ao informado, ele pertence à sequência
        return c == n || n == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o número do usuário
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        // Verifica se o número pertence à sequência de Fibonacci
        if (isFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}

package TabuadaMultiplicacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();

        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = sc.nextInt();
        tabuada.mostrarTabuada(numero);

        sc.close();
    }
}

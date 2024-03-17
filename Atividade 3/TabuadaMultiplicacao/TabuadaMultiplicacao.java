package TabuadaMultiplicacao;

public class TabuadaMultiplicacao implements Tabuada {

    @Override
    public void mostrarTabuada(int numero) {
        System.out.println("\nTabuada do " + numero);
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", numero, i, numero * i);
        }
    }
    
}
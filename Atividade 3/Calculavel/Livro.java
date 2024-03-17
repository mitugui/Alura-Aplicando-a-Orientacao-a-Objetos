package Calculavel;

public class Livro implements Calculavel {
    private String autor;
    private double preco;

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularPrecoFinal() {
        return this.preco * 0.9;
    }
    
}

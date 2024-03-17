package Vendavel;

public class Produto implements Vendavel {
    private String nome;
    private double precoUnitario;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoUnitario * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        precoUnitario -= precoUnitario * (percentualDesconto / 100);
    }
}

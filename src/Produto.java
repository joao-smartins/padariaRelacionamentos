public class Produto {


    private int cod;
    private double valor;
    private String nome;
    private int estoque;
    private Tipo tipos;

    public Produto(int cod, String nome,double valor, int estoque, Tipo tipos) {
        this.cod = cod;
        this.valor = valor;
        this.nome = nome;
        this.estoque = estoque;
        this.tipos = tipos;

    }

    public Produto(){


    }

}

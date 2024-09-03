public class Tipo {

    private static int id = 0;
    private String nome;

    public Tipo(String nome) {
        id ++;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        Tipo.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

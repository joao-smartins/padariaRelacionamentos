import java.util.ArrayList;

public class Caixa {

    private ArrayList<Comanda> comandas;

    public Caixa(){

        this.comandas = new ArrayList<Comanda>();

    }

    public Comanda nova (String cliente){

        this.comandas.add(cliente);

    }

    public Comanda getComanda (int id){

        return this.comandas.get(id - 1);
    }


    public void pagarComanda(int id){


    }


}

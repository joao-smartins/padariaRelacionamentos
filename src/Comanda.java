import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Comanda {

    private static int id = 0;
    private LocalDate data;
    private String cliente;
    private ArrayList<>

    public Comanda(String cliente) {
        this.data = LocalDate.now();
        id ++;
    }

    public void addProduto(Produto produto, int quant){



    }

    public double totalizar(){
        double total = 0;

    }


}

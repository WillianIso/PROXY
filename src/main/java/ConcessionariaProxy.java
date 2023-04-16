import java.util.ArrayList;
import java.util.List;

public class ConcessionariaProxy implements Concessionaria {
    private ConcessionariaReal concessionariaReal;
    private List<String> carrosVendidos = new ArrayList<String>();

    public void venderCarro(String modelo) {
        if (concessionariaReal == null) {
            concessionariaReal = new ConcessionariaReal();
        }

        if (carrosVendidos.contains(modelo)) {
            System.out.println("Desculpe, o carro " + modelo + " já foi vendido.");
        } else {
            concessionariaReal.venderCarro(modelo);
            carrosVendidos.add(modelo);
        }
    }
}

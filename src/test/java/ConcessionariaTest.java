import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ConcessionariaTest {
    @Test
    public void testVendaCarro() {
        Concessionaria concessionaria = new ConcessionariaProxy();

        concessionaria.venderCarro("Civic");
        concessionaria.venderCarro("Corolla");
        concessionaria.venderCarro("Ka");

        String esperado = "Vendendo carro Civic\n" +
                "Vendendo carro Corolla\n" +
                "Vendendo carro Ka";
        assertEquals(esperado, getOutput());
    }

    private String getOutput() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        return outputStream.toString();
    }
}

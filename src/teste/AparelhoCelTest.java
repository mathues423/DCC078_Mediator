package teste;

import main.AparelhoCel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AparelhoCelTest {
    @Test
    void deveElogiarSecretaria() {
        AparelhoCel tijolão = new AparelhoCel();
        assertEquals("O roteador recebeu o pedido de Conecção.\n"+
                "O provedor recebeu o pedido de Conecção tendo a seguinte resposta.\n"+
                ">>O pedido do IP:1.1.1.1 sera analizado.",
                tijolão.pedirConeccaoRoteador("1.1.1.1"));
    }

    @Test
    void deveReclamarSecretaria() {
        AparelhoCel tijolão = new AparelhoCel();
        assertEquals("O roteador recebeu o pedido de Brodcast.\n"+
                "O provedor recebeu o pedido de Brodcast tendo a seguinte resposta.\n"+
                ">>Não fazemos brodcast de toda a rede Sr(a)1.1.1.1.",
                tijolão.pedirBrodcastRoteador("1.1.1.1"));
    }
}
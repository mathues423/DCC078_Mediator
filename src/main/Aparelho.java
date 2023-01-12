package main;

public class Aparelho {

    public String pedirConeccaoRoteador(String IP) {
        return Roteador.getInstancia().receberConecção(IP);
    }

    public String pedirBrodcastRoteador(String IP) {
        return Roteador.getInstancia().receberBrodcast(IP);
    }
}

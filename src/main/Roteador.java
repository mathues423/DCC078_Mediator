package main;

public class Roteador implements Distribuidor{

    private static Roteador instancia = new Roteador();

    private Roteador() {}

    public static Roteador getInstancia() {
        return instancia;
    }

    public String receberConecção(String IP) {
        return "O roteador recebeu o pedido de Conecção.\n"+
                "O provedor recebeu o pedido de Conecção tendo a seguinte resposta.\n" +
                ">>" + Provedor.getInstancia().receberConecção(IP);
    }

    public String receberBrodcast(String IP) {
        return "O roteador recebeu o pedido de Brodcast.\n"+
                "O provedor recebeu o pedido de Brodcast tendo a seguinte resposta.\n" +
                ">>" + Provedor.getInstancia().receberBrodcast(IP);
    }
}

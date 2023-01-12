package main;

public class Provedor implements Distribuidor{
    private static Provedor instancia = new Provedor();

    private Provedor() {}

    public static Provedor getInstancia() {
        return instancia;
    }

    public String receberConecção(String IP) {
        return "O pedido do IP:"+IP+" sera analizado.";
    }

    public String receberBrodcast(String IP) {
        return "Não fazemos brodcast de toda a rede Sr(a)"+IP+".";
    }
}

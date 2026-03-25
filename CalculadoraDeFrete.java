public class CalculadoraDeFrete {

    public double calcularFrete(TipodeFrete tipo, double distancia) {
        return tipo.calcular(distancia);
    }
}
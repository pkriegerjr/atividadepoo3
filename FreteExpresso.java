public class FreteExpresso implements TipodeFrete {

    @Override
    public double calcular(double distancia) {
        return distancia * 2.50;
    }
}
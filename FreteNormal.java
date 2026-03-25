public class FreteNormal implements TipodeFrete {

    @Override
    public double calcular(double distancia) {
        return distancia * 1.25;
    }
}
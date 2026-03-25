public class Main {
    public static void main(String[] args) {
        double distancia = 100;

        CalculadoraDeFrete calculadora = new CalculadoraDeFrete();

        TipodeFrete normal = new FreteNormal();
        TipodeFrete expresso = new FreteExpresso();
        TipodeFrete retirada = new FreteRetirada();

        System.out.println("Frete Normal: " + calculadora.calcularFrete(normal, distancia));
        System.out.println("Frete Expresso: " + calculadora.calcularFrete(expresso, distancia));
        System.out.println("Frete Retirada: " + calculadora.calcularFrete(retirada, distancia));
    }
    
}

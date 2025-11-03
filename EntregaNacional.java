public class EntregaNacional extends Entrega {
   private double distancia;

   public EntregaNacional(String codigoPedido, double distancia) {
       super(codigoPedido);
       this.distancia = distancia;
   }

   @Override
   public double calcularValorFrete() {
       return distancia * 1.5;
   }
}

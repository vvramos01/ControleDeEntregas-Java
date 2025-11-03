public abstract class Entrega {
   protected String codigoPedido;


   public Entrega(String codigoPedido) {
       this.codigoPedido = codigoPedido;
   }


   public abstract double calcularValorFrete();


   public void exibirResumo() {
       System.out.println("Codigo do pedido: " + codigoPedido);
       System.out.println("Valor do frete: R$ " + calcularValorFrete());
       System.out.println("---------------------------------");
   }
}

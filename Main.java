public class Main {
   public static void main(String[] args) {

       Entrega pedidoLocal = new EntregaLocal("PED123");
       Entrega pedidoNacional = new EntregaNacional("PED789", 200);

       pedidoLocal.exibirResumo();
       pedidoNacional.exibirResumo();
   }
}


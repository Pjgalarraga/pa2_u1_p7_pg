import com.edu.ec.negocio.Pedido;
import com.edu.ec.negocio.PedidoService;

public class App {
    public static void main(String[] args) throws Exception {
    
        //Creamos manualmente el objeto de la clase pedido
        Pedido pedido = new Pedido("Juan Pérez", "Laptop", "juan.perez@example.com", 1500.00);

        PedidoService pedidoService = new PedidoService();

        pedidoService.realizar(pedido);
        pedido=null; // el objeto es elegible por el garbage collector
        pedidoService = null;


    }
}

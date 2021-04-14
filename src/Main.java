//Clase restaurante
// Se supone que debe controlar las demás clases aparte de manejar
//Listas de clientes, productos random y lista de produccion
public class Main {

    public static void main(String[] args) throws  Exception{
        //Ventana_Main ventan = new Ventana_Main();
        Reader nuevo = new Reader();
        nuevo.leer_platos_fuertes();
        nuevo.leer_acompa();
        nuevo.leer_bebidas();

        
        // pass
    /*
    Cliente clienteNormal;
    clienteNormal = new Cliente();
    System.out.println(clienteNormal.verPaciencia());

    ClienteImpaciente clienteImpacientin;
    clienteImpacientin = new ClienteImpaciente();
    System.out.println(clienteImpacientin.verPaciencia());
    */
    
    }
}

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

//Clase restaurante
// Se supone que debe controlar las demás clases aparte de manejar
//Listas de clientes, productos random y lista de produccion
public class Main {
    public static boolean tick;
    //public static Ventana_Main ventana = new Ventana_Main();
    public static Produccion produccion = new Produccion();

    public static void main(String[] args) throws Exception {
        Ventana_Main ventana = new Ventana_Main();
        ventana.prodVentana.getFilaClientes();
        
        
    }
}


import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

//Clase restaurante
// Se supone que debe controlar las demás clases aparte de manejar
//Listas de clientes, productos random y lista de produccion
public class Main {
    public static boolean tick;
    public static Ventana_Main ventana = new Ventana_Main();
    public static Produccion produccion = new Produccion();

    public static void main(String[] args) throws Exception {

        //Este while debe de estar dentro de otro while que sea
        //de que while lista de clientes != 0:
        int perroCasa = 5;
        while (perroCasa != 0) {
            System.out.println("SI ENTRA A perroCasa");
            produccion.getFilaClientes();
            System.out.println("pASO");
            produccion.ProducirPedido();
            if (ventana.get_ciclo() == false){
                System.out.println("entra al if");
            }
            perroCasa --;

            while (ventana.get_ciclo() == false) {
                System.out.println("SI ENTRA A EL WHILE");
                produccion.getFilaClientes();
                System.out.println("pASO");
                produccion.ProducirPedido();
                System.out.println("Entradas: " + perroCasa);
                perroCasa --;
                ventana.cambiar_ciclo(true);
            }
        }
    }
}


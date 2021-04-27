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
        while (perroCasa != 0) { //Perro casa es un loop temporal solo para pruebas
            System.out.println("SI ENTRA A perroCasa");
            produccion.getFilaClientes();
            System.out.println("pASO");
            produccion.ProducirPedido();
            if (produccion.lista_por_producir.get(0) == null ){
                System.out.println("Produccion terminada");
            }
            else{
                produccion.producir_2();
                System.out.println("no se ha vaciado la lista");
            }
        }
    }
}


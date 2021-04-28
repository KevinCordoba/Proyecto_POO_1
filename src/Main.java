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
        produccion.getFilaClientes();
        while (produccion.verListaPersonas().get(0) == null){
            if (!ventana.get_ciclo()){ //if boton es false
                if (produccion.lista_por_producir.get(0) == null) {
                    System.out.println("Produccion terminada");
                } else {
                    produccion.producir_2();
                    System.out.println("no se ha vaciado la lista");
                }
            }
        }
    }
}


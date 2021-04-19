import java.util.ArrayList;
import java.util.List;

//Clase restaurante
// Se supone que debe controlar las demás clases aparte de manejar
//Listas de clientes, productos random y lista de produccion
public class Main {

    public static void main(String[] args) throws  Exception{
        //Ventana_Main ventan = new Ventana_Main();

        /*List<ArrayList<String>> probando = new ArrayList<ArrayList<String>>();
        ArrayList<String> lista_temp = new ArrayList<String>();
        ArrayList<String> lista_temp2 = new ArrayList<String>();

        lista_temp.add("FileteDePescado");
        lista_temp.add("delfinio");
        lista_temp.add("moona");
        probando.add(lista_temp);
        lista_temp2.add("Patacones");
        lista_temp2.add("delfinio");
        lista_temp2.add("Inanis");
        probando.add(lista_temp2); */

        
        Cliente ramon = new Cliente();
        ramon.crear_orden();
        System.out.println("ver_platosFuertes Ramon:" + ramon.ver_platosFuertes());
        System.out.println("ver_sideD Ramon:" + ramon.ver_SideD());
        System.out.println("ver_bebidas Ramon:" + ramon.ver_bebidas());

        
        //Fila_Produccion fila = new Fila_Produccion(); 
        //fila.sumar_tamanno_perro(ramon.ver_platosFuertes(), ramon.ver_SideD(), ramon.ver_bebidas());
        //System.out.println(ramon.ver_platosFuertes());

       // Produccion prod = new Produccion();
        //prod.probarFila_Prod();

        //System.out.println("Main\n" + probando + "\n-----------");
        //System.out.println("Funcion retorna:\n\n\n");
        //Reader leer = new Reader();

        }

        //Combos combo = new Combos();
        //combo.comprobar_combo(probando);

        
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


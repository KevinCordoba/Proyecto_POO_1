import java.util.ArrayList;
import java.util.List;

//Clase restaurante
// Se supone que debe controlar las demás clases aparte de manejar
//Listas de clientes, productos random y lista de produccion
public class Main {
    public static boolean tick;

    public static void main(String[] args) throws  Exception{
        Ventana_Main ventana = new Ventana_Main();
        //while(ventana.contando <5){
        //    System.out.println("probando en el main el contando " + ventana.contando);
       // }

        Produccion produccion = new Produccion();
        produccion.getFilaClientes();
        produccion.ProducirPedido();
        //produccion.sumar_tamanno_perro(produccion.persona1.pedido_Fuerte, produccion.persona1.pedido_SideD, produccion.persona1.pedido_bebidas);

        //cambiarEstado(ventana.get_ciclo());

        if (ventana.get_ciclo()){
            produccion.setCiclos(ventana.get_ciclo());
        }
        else{
            //produccion.setCiclos(ventana.get_ciclo());
            //lo demás 
            System.out.println("hola está en falso");
        } 

        /*Cliente Juan = new Cliente();
        Juan.crear_orden();
        Fila_Produccion fila = new Fila_Produccion();
        fila.sumar_tamanno_perro(Juan.pedido_Fuerte, Juan.pedido_SideD, Juan.pedido_bebidas);*/

        /*Cliente Raul = new Cliente();
        Raul.crear_orden();
        System.out.println( Raul.ver_platosFuertes() );
        System.out.println( Raul.ver_SideD() );
        System.out.println( Raul.ver_bebidas() ); */

       /* PlatosFuertes manF = new PlatosFuertes();
        Acompanamientos manA = new Acompanamientos();
        Bebidas manB = new Bebidas();

        manF.getPlatos();
        manA.getAcompas();
        manB.getBebidas(); */

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

        
       /* Cliente ramon = new Cliente();
        ramon.crear_orden();
        System.out.println("ver_platosFuertes Ramon:" + ramon.ver_platosFuertes());
        System.out.println("ver_sideD Ramon:" + ramon.ver_SideD());
        System.out.println("ver_bebidas Ramon:" + ramon.ver_bebidas()); */

        
       // Fila_Produccion fila = new Fila_Produccion(); 
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


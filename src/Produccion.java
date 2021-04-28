//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Produccion extends Fila_Produccion{
    Cliente persona1 = new Cliente();
    Cliente persona2 = new Cliente();
    ClienteImpaciente persona3 = new ClienteImpaciente();
    Cliente persona4 = new Cliente();
    Cliente persona5 = new Cliente();
    Cliente persona6 = new Cliente();
    Cliente persona7 = new Cliente();
    ClienteImpaciente persona8 = new ClienteImpaciente();
    Cliente persona9 = new Cliente();
    Cliente persona10 = new Cliente();

    List<Cliente> listaPersonas = new ArrayList<Cliente>();

    //Reader readerPrueba = new Reader();
    
    
    List<String> listaProduccion = new ArrayList<String>();
    int contPrep;

    int numeroAl = 0;

    Produccion(){
        contPrep = 0;
    }

    public void getFilaClientes(){
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);
        listaPersonas.add(persona4);
        listaPersonas.add(persona5);
        listaPersonas.add(persona6);
        listaPersonas.add(persona7);
        listaPersonas.add(persona8);
        listaPersonas.add(persona9);
        listaPersonas.add(persona10);
        for(int i = 0; i<listaPersonas.size(); i++){
            listaPersonas.get(i).crear_orden();
        }
        //System.out.println(listaPersonas);
    }

    public void ProducirPedido(){
        /*while (!listaPersonas.isEmpty()){
            sumar_tamanno_perro(listaPersonas.get(0).pedido_Fuerte, listaPersonas.get(0).pedido_SideD, listaPersonas.get(0).pedido_bebidas);
            System.out.println("Lista con : " + listaPersonas.size());
            listaPersonas.remove(0);
        } */

        Cliente copiaTemp = new Cliente();
        copiaTemp = listaPersonas.get(0);
        sumar_tamanno_perro(copiaTemp.pedido_Fuerte, copiaTemp.pedido_SideD, copiaTemp.pedido_bebidas);
        if (copiaTemp.pedido_Fuerte.isEmpty() && copiaTemp.pedido_SideD.isEmpty() && copiaTemp.pedido_bebidas.isEmpty()){
            listaPersonas.remove(0);
        }
        //persona1.crear_orden();
       // sumar_tamanno_perro(persona1.ver_platosFuertes(), persona1.ver_SideD(), persona1.ver_platosFuertes());
        //System.out.println(tamanno_pedido);
    }

    //esta funcion se debe de llamar 3 veces, para platoFuerte, SideD, bebidas
    int tempo_Fuerte = 0; 
    int precioTotalPedido = 0;
    int tempo_SD = 0;
    int tempo_Bb = 0;
    int tempoCompleto = 0;
    ArrayList<String> nombres = new ArrayList<String>();
    public void get_tiempoForte(){
        nombres = new ArrayList<String>();
        tempoCompleto = 0;
        tempo_Fuerte = 0;
        tempo_SD = 0;
        tempo_Bb = 0;
        for (int i=0; i<listaPersonas.get(0).pedido_Fuerte.size(); i++){
            precioTotalPedido += Integer.parseInt( listaPersonas.get(0).pedido_Fuerte.get(i).get(1) );
            tempo_Fuerte += Integer.parseInt( listaPersonas.get(0).pedido_Fuerte.get(i).get(2) );
            nombres.add( listaPersonas.get(0).pedido_Fuerte.get(i).get(0) );
            //System.out.println("El precio es: " + precioTotalPedido + "  El tiempo es: " + tempo_Fuerte);

        }

        for (int i=0; i<listaPersonas.get(0).pedido_SideD.size(); i++){
            precioTotalPedido += Integer.parseInt( listaPersonas.get(0).pedido_SideD.get(i).get(1) );
            tempo_SD += Integer.parseInt( listaPersonas.get(0).pedido_SideD.get(i).get(2) );
            nombres.add( listaPersonas.get(0).pedido_SideD.get(i).get(0) );
            //System.out.println("El precio es: " + precioTotalPedido + "  El tiempo es: " + tempo_SD);
        }

        for (int i=0; i<listaPersonas.get(0).pedido_bebidas.size(); i++){
            precioTotalPedido += Integer.parseInt( listaPersonas.get(0).pedido_bebidas.get(i).get(1) );
            tempo_Bb += Integer.parseInt( listaPersonas.get(0).pedido_bebidas.get(i).get(2) );
            nombres.add( listaPersonas.get(0).pedido_bebidas.get(i).get(0) );
            //System.out.println("El precio es: " + precioTotalPedido + "  El tiempo total es: " + tempo_Bb );
        }
        tempoCompleto = tempo_Fuerte + tempo_SD + tempo_Bb;
        listaPersonas.remove(0);
        //System.out.println(listaPersonas.get(0));
    }

    /*int tempo_SD = 0;
    public void get_tiempoSidoD(){
        nombres = new ArrayList<String>();
        for (int i=0; i<listaPersonas.get(0).pedido_SideD.size(); i++){
            precioTotalPedido += Integer.parseInt( listaPersonas.get(0).pedido_SideD.get(i).get(1) );
            tempo_SD += Integer.parseInt( listaPersonas.get(0).pedido_SideD.get(i).get(2) );
            nombres.add( listaPersonas.get(0).pedido_SideD.get(i).get(0) );
            System.out.println("El precio es: " + precioTotalPedido + "  El tiempo es: " + tempo_SD);
        }
        //listaPersonas.remove(0);
    } */

    public int get_tiempo_produccion(){
        return tempo_Fuerte;
    }

    //esta funcion se debe de llamar 3 veces, para platoFuerte, SideD, bebidas
    int precios = 0; //Declarar esto publico al principo para futuros usos
    public void sumar_precios(List lista_comidas){
        ArrayList<String> lista_temp = new ArrayList<String>();
        String por_mientras;

        for (int i = 0; i < lista_comidas.size(); i++) {
            lista_temp = (ArrayList<String>) lista_comidas.get(i);
            por_mientras = lista_temp.get(1);
            precios += Integer.parseInt(por_mientras);

        }
    }
    public int get_precios(){
        return precios;
    }


    
}

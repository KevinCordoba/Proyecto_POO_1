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
        for(int i = 0; i<listaPersonas.size(); i++){
            listaPersonas.get(i).crear_orden();
        }
        System.out.println(listaPersonas);
    }
    public List verListaPersonas(){
        return listaPersonas;
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
    int tiempo_de_produccion = 0; //Declarar esto publico al principo para futuros usos
    public void get_tiempo_cliente(List lista_comidas){
        ArrayList<String> lista_temp = new ArrayList<String>();
        ArrayList<String> definitiva = new ArrayList<String>();
        String por_mientras;

        for (int i = 0; i < lista_comidas.size(); i++) {
            lista_temp = (ArrayList<String>) lista_comidas.get(i);
            por_mientras = lista_temp.get(2);
            tiempo_de_produccion += Integer.parseInt(por_mientras);
            //definitiva.add(por_mientras);
        }
    }
    public int get_tiempo_produccion(){
        return tiempo_de_produccion;
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

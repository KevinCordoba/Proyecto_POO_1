//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Produccion extends Fila_Produccion{
    Cliente persona1 = new Cliente();
    Cliente persona2 = new Cliente();
    ClienteImpaciente persona3 = new ClienteImpaciente();
    List<Cliente> listaPersonas = new ArrayList<Cliente>();

    Reader readerPrueba = new Reader();
    
    
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
    }

    public void getFilaProducir(){
        //listaProduccion.add(listaPersonas)
    }

    /*public int sumaTimePrep(){
        Cliente Ctemporal = new Cliente();
        List<String> listClTmp = new ArrayList<String>();
        Ctemporal = listaPersonas.get(0);
        listClTmp = Ctemporal.listaDelCliente;
        for(int i = 0; i < Ctemporal.listaDelCliente.size(); i++){
            if(listClTmp.get(i).equals("Hamburguesa") || listClTmp.get(i).equals("ArrozConCamarones") || listClTmp.get(i).equals("ArrozConPollo") || listClTmp.get(i).equals("FileteDePescado") ){
                contPrep = contPrep + 3;
            }
            if(listClTmp.get(i).equals("Ensalada") || listClTmp.get(i).equals("Patacones") || listClTmp.get(i).equals("PapasFritas") || listClTmp.get(i).equals("Pure") ){
                contPrep = contPrep + 2;
            }
            if(listClTmp.get(i).equals("Coca") || listClTmp.get(i).equals("Fanta") || listClTmp.get(i).equals("cafe") || listClTmp.get(i).equals("Chocolate") ){
                contPrep = contPrep + 1;
            }
        }
        System.out.println(Ctemporal.listaDelCliente);
        System.out.println(contPrep);
        return contPrep;
    } */


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

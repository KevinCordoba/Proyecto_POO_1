//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Produccion {
    Cliente persona1 = new Cliente();
    Cliente persona2 = new Cliente();
    ClienteImpaciente persona3 = new ClienteImpaciente();
    List<Cliente> listaPersonas = new ArrayList<Cliente>();

    Reader readerPrueba = new Reader();
    List<ArrayList<String>> Fuertes = new ArrayList<ArrayList<String>>();
    List<ArrayList<String>> Acompa = new ArrayList<ArrayList<String>>();
    List<ArrayList<String>> Bebida = new ArrayList<ArrayList<String>>();
    ArrayList<String> platoTemporal = new ArrayList<String>();
    ArrayList<String> sideDTemporal = new ArrayList<String>();
    ArrayList<String> bebidaTemporal = new ArrayList<String>();
    
    List<String> listaProduccion = new ArrayList<String>();
    int contPrep;

    int numeroAl = 0;

    Produccion(){
        contPrep = 0;
    }

    public void asignarFuerte(Cliente _clnt){ //asigna un plato fuerte
        numeroAl = (int)(Math.random()*(3-0+1)+0); // numero aleatorio
        
        readerPrueba.leer_platos_fuertes();
        Fuertes = readerPrueba.retornarPlato();
        platoTemporal = new ArrayList<String>();
        platoTemporal = Fuertes.get(numeroAl);
        _clnt.listaDelCliente.add(platoTemporal.get(0)); //agrega nombre del plato fuerte
        //System.out.println(_clnt.listaDelCliente);
    }

    public void asignarSideD(Cliente _clnt){ //asigna un acompañamiento
        numeroAl = (int)(Math.random()*(3-0+1)+0);
        readerPrueba.leer_acompa();
        Acompa = readerPrueba.retornarSideD();
        sideDTemporal = new ArrayList<String>();
        sideDTemporal = Acompa.get(numeroAl);
        _clnt.listaDelCliente.add(sideDTemporal.get(0));
    }

    public void asignarBebida(Cliente _clnt){ // asigna una bebida
        numeroAl = (int)(Math.random()*(3-0+1)+0);
        readerPrueba.leer_bebidas();
        Bebida = readerPrueba.retornarBebida();
        bebidaTemporal = new ArrayList<String>();
        bebidaTemporal = Bebida.get(numeroAl);
        _clnt.listaDelCliente.add(bebidaTemporal.get(0));
    }

    public void asigFuerte_impaciente(ClienteImpaciente _clntImp){ //asigna plato fuerte a un impaciente
        numeroAl = (int)(Math.random()*(3-0+1)+0);
        readerPrueba.leer_platos_fuertes();
        Fuertes = readerPrueba.retornarPlato();
        platoTemporal = new ArrayList<String>();
        platoTemporal = Fuertes.get(numeroAl);
        _clntImp.listaDelCliente.add(platoTemporal.get(0));
    }

    public void asigSideD_impaciente(ClienteImpaciente _clntImp){ //asigna un acompañamiento a un impaciente
        numeroAl = (int)(Math.random()*(3-0+1)+0);
        readerPrueba.leer_acompa();
        Acompa = readerPrueba.retornarSideD();
        sideDTemporal = new ArrayList<String>();
        sideDTemporal = Acompa.get(numeroAl);
        _clntImp.listaDelCliente.add(sideDTemporal.get(0));
    }

    public void asigBebida_impaciente(ClienteImpaciente _clntImp){ // asigna una bebida a un impaciente
        numeroAl = (int)(Math.random()*(3-0+1)+0);
        readerPrueba.leer_bebidas();
        Bebida = readerPrueba.retornarBebida();
        bebidaTemporal = new ArrayList<String>();
        bebidaTemporal = Bebida.get(numeroAl);
        _clntImp.listaDelCliente.add(bebidaTemporal.get(0));
    }

    public void set(){
        asignarFuerte(persona1);
        asignarFuerte(persona1);
        asignarSideD(persona1);
        asignarBebida(persona1);
        asignarFuerte(persona2);
        asigFuerte_impaciente(persona3);
        asigSideD_impaciente(persona3);
        asigBebida_impaciente(persona3);
        System.out.println("pedido de persona 1: " + persona1.listaDelCliente);
        System.out.println("pedido de persona 2: " + persona2.listaDelCliente);
        System.out.println("pedido de persona 3: " + persona3.listaDelCliente);
    }

    public void getFilaClientes(){
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);
    }

    public void getFilaProducir(){
        //listaProduccion.add(listaPersonas)
    }

    public int sumaTimePrep(){
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
    public int get_tiempo_produccion{
        return tiempo_de_produccion;
    }

    int tamanno_cola = 10; //Declararlas Public
    int tamanno_pedido = 0; //declararlo public y al inicio de la clase para que siempre inicie en 0
    //Deben de entrarle las 3 listas
    public void sumar_tamanno(List platoF, List sideD, List bebidas){
        List<ArrayList<String>> lista_temp = new ArrayList<ArrayList<String>>();
        lista_temp = platoF;

        while (tamanno_pedido <= tamanno_cola){
            for (int i = 0; i < platoF.size(); i++) {
                tamanno_pedido += 3;
                if (tamanno_pedido <= tamanno_cola) {
                    System.out.println("ListaFuerte > 10");
                    break;
                }
                lista_temp.remove(i); //Remueve el que ya verifico
            }
            if (tamanno_pedido <= tamanno_cola) {
                System.out.println("Tamanno pedido1 > 10");
                break;
            }

            lista_temp = sideD;
            for (int i = 0; i < sideD.size(); i++) {
                tamanno_pedido += 2;
                if (tamanno_pedido <= tamanno_cola) {
                    System.out.println("ListaSide > 10");
                    break;
                }
                lista_temp.remove(i);
            }
            if (tamanno_pedido <= tamanno_cola) {
                System.out.println("Tamanno pedido2 > 10");
                break;
            }

            lista_temp = bebidas;
            for (int i = 0; i < bebidas.size(); i++) {
                tamanno_pedido += 1;
                if (tamanno_pedido <= tamanno_cola) {
                    System.out.println("Listaebidas > 10");
                    break;
                }
                lista_temp.remove(i);
            }
            if (tamanno_pedido <= tamanno_cola) {
                System.out.println("Tamanno pedido3 > 10");
                break;
            }
        }
        if (tamanno_pedido >= 10){
            System.out.println("Muy grande en:" + lista_temp);
        }

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
    public int get_precios{
        return precios;
    }


    
}

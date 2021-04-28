import java.util.ArrayList;
import java.util.List;

public class Fila_Produccion {
    public int tamanno_cola = 10;
    public int tamanno_pedido = 0;
    public boolean pausa = false;
    public List<ArrayList<String>> lista_temp = new ArrayList<ArrayList<String>>();
    ArrayList<String> contenedor = new ArrayList<String>();
    String por_mientras;
    int clicks = 0;
    boolean ciclos;
    //-------------
    public List<ArrayList<String>> lista_por_producir = new ArrayList<ArrayList<String>>();
    ArrayList<String> bodega = new ArrayList<String>();


    //Deben de entrarle las 3 listas
    public void sumar_tamanno_perro(List platoF, List sideD, List bebidas){
        lista_temp = platoF;

        while (tamanno_pedido <= tamanno_cola) {
            //while (!pausa) { //por ahora no lo ocupamos
                System.out.println("Tamanno lista " + platoF.size());
                //for (List i: lista_temp){
                for (int i = 0; i < platoF.size(); i++) {
                    System.out.println("Indice:" + i);
                    tamanno_pedido += 3;
                    lista_por_producir.add(lista_temp.get(i));
                    System.out.println(tamanno_pedido);

                    if (tamanno_pedido > tamanno_cola) {
                        System.out.println("ListaFuerte > 10");
                        System.out.println("tamanno muy grande" + tamanno_pedido);
                        pausa = true;
                        break;

                    }
                    else if ((tamanno_pedido + 3 > 10) && (lista_temp.size() >= i)){
                        pausa = true;
                        System.out.println("pausa: " + pausa);
                        break;
                    }


                }
                //*************************************************************
                System.out.println(tamanno_pedido);
                if (tamanno_pedido > tamanno_cola) {
                    System.out.println("Tamanno pedido1 > 10");
                    System.out.println("tamanno muy grande " + tamanno_pedido);
                    pausa = true;
                    System.out.println("pausa: " + pausa);
                    break;
                }
                else if(pausa){
                    producir_2();
                    System.out.println("pausa++: " + pausa);
                }
                System.out.println("Se hizo los fuertes");
                //--------------------------------------------------------------

                lista_temp = sideD;
                System.out.println("Tamanno lista " + sideD.size());
                for (int i = 0; i < sideD.size(); i++) {
                    System.out.println("Indice:" + i);
                    tamanno_pedido += 2;
                    lista_por_producir.add(lista_temp.get(i));
                    System.out.println(tamanno_pedido);

                    if (tamanno_pedido > tamanno_cola) {
                        System.out.println("ListaSide > 10");
                        System.out.println("tamanno muy grande: " + tamanno_pedido);
                        pausa = true;
                        System.out.println("pausa: " + pausa);
                        break;
                    }
                    else if ((tamanno_pedido + 2 > 10) && (lista_temp.size() >= i)){ //Verificar ma;ana el "="
                        pausa = true;
                        System.out.println("pausa: " + pausa);
                        break;
                    }


                }
                //**********************************************************
                System.out.println("salio" + tamanno_pedido);
                if (tamanno_pedido >= tamanno_cola) {
                    System.out.println("Tamanno pedido2 > 10");
                    System.out.println("tamanno muy grande " + tamanno_pedido);
                    pausa = true;
                    System.out.println("pausa: " + pausa);
                    break;
                }
                else if(pausa){
                    producir_2();
                }
                System.out.println("Se hizo los Acompannamientos");
                //------------------------------------------------------------

                lista_temp = bebidas;
                System.out.println("Tamanno lista " + bebidas.size());
                for (int i = 0; i < bebidas.size(); i++) {
                    System.out.println("Indice:" + i);
                    tamanno_pedido += 1;
                    lista_por_producir.add(lista_temp.get(i));
                    System.out.println(tamanno_pedido);

                    if (tamanno_pedido > tamanno_cola) {
                        System.out.println("Listaebidas > 10");
                        System.out.println("tamanno muy grande " + tamanno_pedido);
                        pausa = true;
                        System.out.println("pausa: " + pausa);
                        break;
                    }
                    else if ((tamanno_pedido + 1 > 10) && (lista_temp.size() >= i)){ //Verificar ma;ana el "="
                        pausa = true;
                        System.out.println("pausa: " + pausa);
                        break;
                    }


                }
                //********************************************************
                if (tamanno_pedido > tamanno_cola) {
                    System.out.println("Tamanno pedido3 > 10");
                    System.out.println("tamanno muy grande " + tamanno_pedido);
                    pausa = true;
                    System.out.println("pausa: " + pausa);
                    break;
                }
                System.out.println("Se hizo las bebidas");
                System.out.println(tamanno_pedido);
                setPausa(true);
                System.out.println("pausa: " + pausa);
                producir_2();
            //} llave de la pausa
        }
    }
    //---------------------------------------------------------------------
    public void producir(){
        for (int i = 0; i < lista_por_producir.size(); i++) {
            bodega = lista_por_producir.get(i);
            por_mientras = bodega.get(2); // Agarro el tiempo de produccion
            clicks = Integer.parseInt(por_mientras); //Declaro el numero de clicks
            while (clicks != 0) { //va a estar enciclado por mientras
                while (!ciclos) {
                    System.out.println("Esta en el loop");
                    restarClicks();
                    setCiclos(true);
                }
            }

        }
        System.out.println("Listo!!\nLista limpia!");
        lista_por_producir.clear();
        setPausa(false);
        System.out.println("pausa: " + pausa);
        System.out.println("Lista por producir: " + lista_por_producir);
    }

    public void producir_2(){
        if (getClicks() == 0){
            setClicks();
        }
        System.out.println("Un click menos");
        restarClicks();

    }

    //---------------------------------------------------------------------

    public void setPausa(boolean valor){
        pausa = valor;
    }

    public void setCiclos(boolean valor){
        pausa = valor;
    }

    public void sumarClicks(){
        this.clicks += 1;
    }

    public void restarClicks(){
        this.clicks -= 1;
    }

    public void setClicks() {
        bodega = lista_por_producir.get(0);
        por_mientras = bodega.get(2);
        this.clicks = Integer.parseInt(por_mientras); //setear clicks
        lista_por_producir.remove(0);
    }
    public int getClicks(){
        return this.clicks;
    }

}




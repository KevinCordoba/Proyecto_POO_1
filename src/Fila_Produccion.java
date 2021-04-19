import java.util.ArrayList;
import java.util.List;

public class Fila_Produccion {
    public int tamanno_cola = 10;
    public int tamanno_pedido = 0;
    public boolean pausa = false;


    //Deben de entrarle las 3 listas
    public void sumar_tamanno_perro(List platoF, List sideD, List bebidas){
        List<ArrayList<String>> lista_temp = new ArrayList<ArrayList<String>>();
        lista_temp = platoF;

        while (tamanno_pedido <= tamanno_cola) {
            while (!pausa) {

                for (int i = 0; i < platoF.size(); i++) {
                    tamanno_pedido += 3;
                    if (tamanno_pedido <= tamanno_cola) {
                        System.out.println("ListaFuerte > 10");
                        pausa = true;
                        break;
                    }
                    lista_temp.remove(i); //Remueve el que ya verifico
                }
                if (tamanno_pedido <= tamanno_cola) {
                    System.out.println("Tamanno pedido1 > 10");
                    pausa = true;
                    break;
                }
                System.out.println("Se hizo los fuertes");

                lista_temp = sideD;
                for (int i = 0; i < sideD.size(); i++) {
                    tamanno_pedido += 2;
                    if (tamanno_pedido <= tamanno_cola) {
                        System.out.println("ListaSide > 10");
                        pausa = true;
                        break;
                    }
                    lista_temp.remove(i);
                }
                if (tamanno_pedido <= tamanno_cola) {
                    System.out.println("Tamanno pedido2 > 10");
                    pausa = true;
                    break;
                }
                System.out.println("Se hizo los Acompannamientos");

                lista_temp = bebidas;
                for (int i = 0; i < bebidas.size(); i++) {
                    tamanno_pedido += 1;
                    if (tamanno_pedido <= tamanno_cola) {
                        System.out.println("Listaebidas > 10");
                        pausa = true;
                        break;
                    }
                    lista_temp.remove(i);
                }
                if (tamanno_pedido <= tamanno_cola) {
                    System.out.println("Tamanno pedido3 > 10");
                    pausa = true;
                    break;
                }
                System.out.println("Se hizo las bebidas");
            }
        }
    }

    public void setPausa(boolean valor){
        pausa = valor;
    }

}

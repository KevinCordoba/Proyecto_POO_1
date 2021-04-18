/*
Combos:
Hamburguesa - PapasFritas
FileteDePescado - Patacones
ArrozConPollo - Ensalada - Coca
ArrozConCamarones - Fanta
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combos {
    public String[][] lista_combos = {{"FileteDePescado","Patacones"}, {"ArrozConPollo", "Ensalada", "Coca"}, {"ArrozConCamarones", "Fanta"}};
    String por_mientras;

    ArrayList<String> lista_temp = new ArrayList<String>();
    ArrayList<String> definitiva = new ArrayList<String>();


    public void mostrar_combos(){
        for (String[] i : lista_combos)
            System.out.println(i);
    }
    //Primero hago lista de los nombres para comprobar los combos B)
    //Debe de entrar el array de cada uno de los platos
    //Retornar BOOl para proceder a hacer descuento
    public boolean comprobar_combo(List lista_menu, List lista_sideD, List lista_bebidas) {

        //Hacer recursion para meter en una lista los nombres de platos fuertes
        for (int i = 0; i < lista_menu.size(); i++){
            lista_temp = (ArrayList<String>) lista_menu.get(i);
            por_mientras = lista_temp.get(0);
            definitiva.add(por_mientras);

        }
        //Lista de acompannamientos
        for (int i = 0; i < lista_sideD.size(); i++){
            lista_temp = (ArrayList<String>) lista_sideD.get(i);
            por_mientras = lista_temp.get(0);
            definitiva.add(por_mientras);

        }
        //Lista de bebidas
        for (int i = 0; i < lista_bebidas.size(); i++){
            lista_temp = (ArrayList<String>) lista_bebidas.get(i);
            por_mientras = lista_temp.get(0);
            definitiva.add(por_mientras);

        }

        System.out.println("Lista de Nombres:\n" + definitiva);

        //A este punto ya tengo la lista de los nombres de los alimentos
        if (definitiva.contains("FileteDePescado") && definitiva.contains("Patacones")) {
            System.out.println("combo 1");
            return true;
        }
        else if(definitiva.contains("ArrozConPollo") && definitiva.contains("Ensalada") && definitiva.contains("Coca")){
            System.out.println("combo 2");
            return true;
        }
        else if(definitiva.contains("ArrozConCamarones") && definitiva.contains("Fanta")){
            System.out.println("combo 3");
            return true;
        }
        else {
            System.out.println("No hay combo");
            return false;
        }
    }

}

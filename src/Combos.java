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
    public String[] prueba = {"Ensalada"};
    String por_mientras;

    ArrayList<String> lista_temp = new ArrayList<String>();
    ArrayList<String> definitiva = new ArrayList<String>();


    public void mostrar_combos(){
        for (String[] i : lista_combos)
            System.out.println(i);
    }
    //Primero hago lista de los nombre para comprobar los combos B)
    //Debe de entrar el array que con los platos
    //Retornar BOOl para proceder a hacer descuento
    public boolean comprobar_combo(List lista_menu) {
        int contador = 0;
        //Hacer recursion para meter en una lista los nombres
        for (int i = 0; i < lista_menu.size(); i++){
            lista_temp = (ArrayList<String>) lista_menu.get(contador);
            por_mientras = lista_temp.get(0);
            definitiva.add(por_mientras);
            contador += 1;
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

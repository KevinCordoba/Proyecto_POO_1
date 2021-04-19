import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Reader {
    //public static void main(String[] args) throws Exception {
    public Reader() {
        System.out.println("Reader Activo");

    }

    List<ArrayList<String>> menu_fuerte = new ArrayList<ArrayList<String>>();
    List<ArrayList<String>> menu_bebidas = new ArrayList<ArrayList<String>>();
    List<ArrayList<String>> menu_sideD = new ArrayList<ArrayList<String>>();


    public void leer_platos_fuertes() {
        JSONParser parser = new JSONParser();

        ArrayList<String> platoFuerte1 = new ArrayList<String>();
        ArrayList<String> platoFuerte2 = new ArrayList<String>();
        ArrayList<String> platoFuerte3 = new ArrayList<String>();
        ArrayList<String> platoFuerte4 = new ArrayList<String>();


        try (FileReader reader = new FileReader("Menu.json")) {

            Object obj = parser.parse(reader);

            JSONObject pJsonObj = (JSONObject) obj;

            JSONArray array = (JSONArray) pJsonObj.get("PlatoFuerte");


            for (int i = 0; i < 1; i++) {
                JSONObject PlatoFuerte = (JSONObject) array.get(i);

                String nombrePlato = (String) PlatoFuerte.get("nombre");
                platoFuerte1.add(nombrePlato);

                String precioPlato = (String) PlatoFuerte.get("precio");
                platoFuerte1.add(precioPlato);

                String duracionPlato = (String) PlatoFuerte.get("duracion");
                platoFuerte1.add(duracionPlato);

                String tamanoPlato = (String) PlatoFuerte.get("tamaño");
                platoFuerte1.add(tamanoPlato);

               /* System.out.println("\nLos Platos fuertes son: ");
                System.out.println("Nombre del plato: " + nombrePlato);
                System.out.println("Precio: " + precioPlato);
                System.out.println("Duracion: " + duracionPlato);
                System.out.println("Tamaño: " + tamanoPlato); */

                menu_fuerte.add(platoFuerte1);

            }
            for (int i = 1; i < 2; i++) {
                JSONObject PlatoFuerte = (JSONObject) array.get(i);

                String nombrePlato = (String) PlatoFuerte.get("nombre");
                platoFuerte2.add(nombrePlato);

                String precioPlato = (String) PlatoFuerte.get("precio");
                platoFuerte2.add(precioPlato);

                String duracionPlato = (String) PlatoFuerte.get("duracion");
                platoFuerte2.add(duracionPlato);

                String tamanoPlato = (String) PlatoFuerte.get("tamaño");
                platoFuerte2.add(tamanoPlato);

                /*System.out.println("\nLos Platos fuertes son: ");
                System.out.println("Nombre del plato: " + nombrePlato);
                System.out.println("Precio: " + precioPlato);
                System.out.println("Duracion: " + duracionPlato);
                System.out.println("Tamaño: " + tamanoPlato); */

                menu_fuerte.add(platoFuerte2);


            }
            for (int i = 2; i < 3; i++) {
                JSONObject PlatoFuerte = (JSONObject) array.get(i);

                String nombrePlato = (String) PlatoFuerte.get("nombre");
                platoFuerte3.add(nombrePlato);

                String precioPlato = (String) PlatoFuerte.get("precio");
                platoFuerte3.add(precioPlato);

                String duracionPlato = (String) PlatoFuerte.get("duracion");
                platoFuerte3.add(duracionPlato);

                String tamanoPlato = (String) PlatoFuerte.get("tamaño");
                platoFuerte3.add(tamanoPlato);

                /*System.out.println("\nLos Platos fuertes son: ");
                System.out.println("Nombre del plato: " + nombrePlato);
                System.out.println("Precio: " + precioPlato);
                System.out.println("Duracion: " + duracionPlato);
                System.out.println("Tamaño: " + tamanoPlato);*/

                menu_fuerte.add(platoFuerte3);

            }
            for (int i = 3; i < 4; i++) {
                JSONObject PlatoFuerte = (JSONObject) array.get(i);

                String nombrePlato = (String) PlatoFuerte.get("nombre");
                platoFuerte4.add(nombrePlato);

                String precioPlato = (String) PlatoFuerte.get("precio");
                platoFuerte4.add(precioPlato);

                String duracionPlato = (String) PlatoFuerte.get("duracion");
                platoFuerte4.add(duracionPlato);

                String tamanoPlato = (String) PlatoFuerte.get("tamaño");
                platoFuerte4.add(tamanoPlato);

               /* System.out.println("\nLos Platos fuertes son: ");
                System.out.println("Nombre del plato: " + nombrePlato);
                System.out.println("Precio: " + precioPlato);
                System.out.println("Duracion: " + duracionPlato);
                System.out.println("Tamaño: " + tamanoPlato); */

                menu_fuerte.add(platoFuerte4);
                //System.out.println("\nARRAY FUERTES: ");
                //System.out.println(menu_fuerte);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }


    public void leer_acompa(){

        ArrayList<String> sideDish1 = new ArrayList<String>();
        ArrayList<String> sideDish2 = new ArrayList<String>();
        ArrayList<String> sideDish3 = new ArrayList<String>();
        ArrayList<String> sideDish4 = new ArrayList<String>();

        JSONParser parser = new JSONParser();
        try (FileReader reader = new FileReader("Menu.json")) {

            Object obj = parser.parse(reader);

            JSONObject pJsonObj = (JSONObject) obj;

            JSONArray array = (JSONArray) pJsonObj.get("Acompañamiento");


            for (int i = 0; i < 1; i++) {
                JSONObject SideDish = (JSONObject) array.get(i);

                String nombrePlato = (String) SideDish.get("nombre");
                sideDish1.add(nombrePlato);

                String precioPlato = (String) SideDish.get("precio");
                sideDish1.add(precioPlato);

                String duracionPlato = (String) SideDish.get("duracion");
                sideDish1.add(duracionPlato);

                String tipoPlato = (String) SideDish.get("tipo");
                sideDish1.add(tipoPlato);

               /* System.out.println("\nLos Acompannamientos son: ");
                System.out.println("Nombre del plato: " + nombrePlato);
                System.out.println("Precio: " + precioPlato);
                System.out.println("Duracion: " + duracionPlato);
                System.out.println("Tipo: " + tipoPlato); */

                menu_sideD.add(sideDish1);
            }
            for (int i = 1; i < 2; i++) {
                JSONObject SideDish = (JSONObject) array.get(i);

                String nombrePlato = (String) SideDish.get("nombre");
                sideDish2.add(nombrePlato);

                String precioPlato = (String) SideDish.get("precio");
                sideDish2.add(precioPlato);

                String duracionPlato = (String) SideDish.get("duracion");
                sideDish2.add(duracionPlato);

                String tipoPlato = (String) SideDish.get("tipo");
                sideDish2.add(tipoPlato);

                /*System.out.println("\nLos Acompannamientos son: ");
                System.out.println("Nombre del plato: " + nombrePlato);
                System.out.println("Precio: " + precioPlato);
                System.out.println("Duracion: " + duracionPlato);
                System.out.println("Tipo: " + tipoPlato); */

                menu_sideD.add(sideDish2);
            }
            for (int i = 2; i < 3; i++) {
                JSONObject SideDish = (JSONObject) array.get(i);

                String nombrePlato = (String) SideDish.get("nombre");
                sideDish3.add(nombrePlato);

                String precioPlato = (String) SideDish.get("precio");
                sideDish3.add(precioPlato);

                String duracionPlato = (String) SideDish.get("duracion");
                sideDish3.add(duracionPlato);

                String tipoPlato = (String) SideDish.get("tipo");
                sideDish3.add(tipoPlato);

                /*System.out.println("\nLos Acompannamientos son: ");
                System.out.println("Nombre del plato: " + nombrePlato);
                System.out.println("Precio: " + precioPlato);
                System.out.println("Duracion: " + duracionPlato);
                System.out.println("Tipo: " + tipoPlato); */

                menu_sideD.add(sideDish3);
            }
            for (int i = 3; i < 4; i++) {
                JSONObject SideDish = (JSONObject) array.get(i);

                String nombrePlato = (String) SideDish.get("nombre");
                sideDish4.add(nombrePlato);

                String precioPlato = (String) SideDish.get("precio");
                sideDish4.add(precioPlato);

                String duracionPlato = (String) SideDish.get("duracion");
                sideDish4.add(duracionPlato);

                String tipoPlato = (String) SideDish.get("tipo");
                sideDish4.add(tipoPlato);

                /*System.out.println("\nLos Acompannamientos son: ");
                System.out.println("Nombre del plato: " + nombrePlato);
                System.out.println("Precio: " + precioPlato);
                System.out.println("Duracion: " + duracionPlato);
                System.out.println("Tipo: " + tipoPlato); */

                menu_sideD.add(sideDish4);
                //System.out.println("\nARRAY sideDishes: ");
                //System.out.println(menu_sideD);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


    public void leer_bebidas(){

        ArrayList<String> bebidas1 = new ArrayList<String>();
        ArrayList<String> bebidas2 = new ArrayList<String>();
        ArrayList<String> bebidas3 = new ArrayList<String>();
        ArrayList<String> bebidas4 = new ArrayList<String>();

        JSONParser parser = new JSONParser();
        try (FileReader reader = new FileReader("Menu.json")) {

            Object obj = parser.parse(reader);

            JSONObject pJsonObj = (JSONObject) obj;

            JSONArray array = (JSONArray) pJsonObj.get("Bebidas");


            for (int i = 0; i < 1; i++) {
                JSONObject Bebidas = (JSONObject) array.get(i);

                String nombrePlato = (String) Bebidas.get("nombre");
                bebidas1.add(nombrePlato);

                String precioPlato = (String) Bebidas.get("precio");
                bebidas1.add(precioPlato);

                String duracionPlato = (String) Bebidas.get("duracion");
                bebidas1.add(duracionPlato);

                String tipoPlato = (String) Bebidas.get("tipo");
                bebidas1.add(tipoPlato);

               /* System.out.println("\nLos Acompannamientos son: ");
                System.out.println("Nombre del plato: " + nombrePlato);
                System.out.println("Precio: " + precioPlato);
                System.out.println("Duracion: " + duracionPlato);
                System.out.println("Tipo: " + tipoPlato); */

                menu_bebidas.add(bebidas1);
            }
            for (int i = 1; i < 2; i++) {
                JSONObject Bebidas = (JSONObject) array.get(i);

                String nombrePlato = (String) Bebidas.get("nombre");
                bebidas2.add(nombrePlato);

                String precioPlato = (String) Bebidas.get("precio");
                bebidas2.add(precioPlato);

                String duracionPlato = (String) Bebidas.get("duracion");
                bebidas2.add(duracionPlato);

                String tipoPlato = (String) Bebidas.get("tipo");
                bebidas2.add(tipoPlato);

               /* System.out.println("\nLos Acompannamientos son: ");
                System.out.println("Nombre del plato: " + nombrePlato);
                System.out.println("Precio: " + precioPlato);
                System.out.println("Duracion: " + duracionPlato);
                System.out.println("Tipo: " + tipoPlato); */

                menu_bebidas.add(bebidas2);
            }
            for (int i = 2; i < 3; i++) {
                JSONObject Bebidas = (JSONObject) array.get(i);

                String nombrePlato = (String) Bebidas.get("nombre");
                bebidas3.add(nombrePlato);

                String precioPlato = (String) Bebidas.get("precio");
                bebidas3.add(precioPlato);

                String duracionPlato = (String) Bebidas.get("duracion");
                bebidas3.add(duracionPlato);

                String tipoPlato = (String) Bebidas.get("tipo");
                bebidas3.add(tipoPlato);

              /*  System.out.println("\nLos Acompannamientos son: ");
                System.out.println("Nombre del plato: " + nombrePlato);
                System.out.println("Precio: " + precioPlato);
                System.out.println("Duracion: " + duracionPlato);
                System.out.println("Tipo: " + tipoPlato); */

                menu_bebidas.add(bebidas3);
            }
            for (int i = 3; i < 4; i++) {
                JSONObject Bebidas = (JSONObject) array.get(i);

                String nombrePlato = (String) Bebidas.get("nombre");
                bebidas4.add(nombrePlato);

                String precioPlato = (String) Bebidas.get("precio");
                bebidas4.add(precioPlato);

                String duracionPlato = (String) Bebidas.get("duracion");
                bebidas4.add(duracionPlato);

                String tipoPlato = (String) Bebidas.get("tipo");
                bebidas4.add(tipoPlato);

               /* System.out.println("\nLos Acompannamientos son: ");
                System.out.println("Nombre del plato: " + nombrePlato);
                System.out.println("Precio: " + precioPlato);
                System.out.println("Duracion: " + duracionPlato);
                System.out.println("Tipo: " + tipoPlato); */

                menu_bebidas.add(bebidas4);
                //System.out.println("\nARRAY Bebidas: ");
                //System.out.println(menu_bebidas);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public List<ArrayList<String>> retornarPlato(){
        return menu_fuerte;
    }

    public List<ArrayList<String>> retornarSideD (){
        return menu_sideD;
    }

    public List<ArrayList<String>> retornarBebida(){
        return menu_bebidas;
    }

    public ArrayList<String> indice_fuerte(){
        Random r = new Random();
        int indice = r.nextInt(4);
        List<ArrayList<String>> menu_f = new ArrayList<ArrayList<String>>();
        ArrayList<String> plato = new ArrayList<String>();

        this.leer_platos_fuertes();
        menu_f = retornarPlato();
        plato = menu_f.get(indice);

        return plato;
    }

    public ArrayList<String> indice_sideD(){
        Random r = new Random();
        int indice = r.nextInt(4);
        List<ArrayList<String>> menu_SD = new ArrayList<ArrayList<String>>();
        ArrayList<String> side = new ArrayList<String>();

        this.leer_acompa();
        menu_SD = retornarSideD();
        side = menu_SD.get(indice);

        return side;
    }

    public ArrayList<String> indice_bebida(){
        Random r = new Random();
        int indice = r.nextInt(4);
        List<ArrayList<String>> menu_B = new ArrayList<ArrayList<String>>();
        ArrayList<String> bebi = new ArrayList<String>();

        this.leer_bebidas();
        menu_B = retornarBebida();
        bebi = menu_B.get(indice);
        //System.out.println(menu_B);

        return bebi;
    }

}
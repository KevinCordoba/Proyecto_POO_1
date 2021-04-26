import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bebidas {
    Reader readerBebidas = new Reader();
    List<ArrayList<String>> Lista_all_Bebidas = new ArrayList<ArrayList<String>>();

    Bebidas(){
        readerBebidas.leer_bebidas();
    }

    public void getBebidas(){
        Lista_all_Bebidas = readerBebidas.retornarBebida();
        //System.out.println("Las Bebidas: " + Lista_all_Bebidas);
    }

    public ArrayList<String> indice_bebida(){
        Random r = new Random();
        int indice = r.nextInt(4);
        List<ArrayList<String>> menu_B = new ArrayList<ArrayList<String>>();
        ArrayList<String> bebi = new ArrayList<String>();

        this.getBebidas();
        menu_B = Lista_all_Bebidas;
        bebi = menu_B.get(indice);
        //System.out.println(menu_B);

        return bebi;
    }

}

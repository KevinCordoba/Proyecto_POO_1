import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PlatosFuertes {
    Reader readerP_Fuertes = new Reader();
    List<ArrayList<String>> Lista_all_Fuertes = new ArrayList<ArrayList<String>>();

    PlatosFuertes(){
        readerP_Fuertes.leer_platos_fuertes();
    }

    public void getPlatos(){
        Lista_all_Fuertes = readerP_Fuertes.retornarPlato();
        //System.out.println("Los fuertes: " + Lista_all_Fuertes);
    }

    public ArrayList<String> indice_fuerte(){
        Random r = new Random();
        int indice = r.nextInt(4);
        List<ArrayList<String>> menu_f = new ArrayList<ArrayList<String>>();
        ArrayList<String> plato = new ArrayList<String>();

        //this.leer_platos_fuertes();
        this.getPlatos();
        menu_f = Lista_all_Fuertes;
        plato = menu_f.get(indice);

        return plato;
    }

}

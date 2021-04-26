import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Acompanamientos {
    Reader readerAcompanamientos = new Reader();
    List<ArrayList<String>> Lista_all_Acompanamientos = new ArrayList<ArrayList<String>>();

    Acompanamientos(){
        readerAcompanamientos.leer_acompa();
    }

    public void getAcompas(){
        Lista_all_Acompanamientos = readerAcompanamientos.retornarSideD();
        //System.out.println("Los acompas: " + Lista_all_Acompanamientos);
    }

    public ArrayList<String> indice_sideD(){
        Random r = new Random();
        int indice = r.nextInt(4);
        List<ArrayList<String>> menu_SD = new ArrayList<ArrayList<String>>();
        ArrayList<String> side = new ArrayList<String>();

        this.getAcompas();
        menu_SD = Lista_all_Acompanamientos;
        side = menu_SD.get(indice);

        return side;
    }

}

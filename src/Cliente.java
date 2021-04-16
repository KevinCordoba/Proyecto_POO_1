import java.util.ArrayList;
import java.util.List;

public class Cliente extends Reader{
    public int contador;
    public boolean impaciente;
    public List<ArrayList<String>> pedido_cliente = new ArrayList<ArrayList<String>>();

    public Cliente(){
        contador = 0;
        impaciente = false;
    }

    public void crear_orden(){

    }

    public boolean verPaciencia(){
        return impaciente;
    } 
}
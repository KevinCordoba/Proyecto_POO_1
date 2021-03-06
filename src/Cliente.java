import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cliente extends Reader{
    public int contador;
    public boolean impaciente;
    //public int paciencia;

    public List<ArrayList<String>> pedido_cliente = new ArrayList<ArrayList<String>>();

    public List<ArrayList<String>> pedido_Fuerte = new ArrayList<ArrayList<String>>();
    public ArrayList<String> platoFuerte1 = new ArrayList<String>();
    public ArrayList<String> platoFuerte2 = new ArrayList<String>();
    public ArrayList<String> platoFuerte3 = new ArrayList<String>();

    public List<ArrayList<String>> pedido_SideD = new ArrayList<ArrayList<String>>();
    public ArrayList<String> sideD1 = new ArrayList<String>();
    public ArrayList<String> sideD2 = new ArrayList<String>();
    public ArrayList<String> sideD3 = new ArrayList<String>();

    public List<ArrayList<String>> pedido_bebidas = new ArrayList<ArrayList<String>>();
    public ArrayList<String> bebida1 = new ArrayList<String>();
    public ArrayList<String> bebida2 = new ArrayList<String>();
    public ArrayList<String> bebida3 = new ArrayList<String>();

    PlatosFuertes platosFs = new PlatosFuertes();
    Acompanamientos acompans = new Acompanamientos();
    Bebidas bebs = new Bebidas();

    public Cliente(){
        contador = 0;
        impaciente = false;
        //paciencia = 100;

    }

    public void crear_orden(){
        Random r = new Random();
        int numero_random;
        numero_random = r.nextInt((3-1)+1)+1;
        //System.out.println("numero Random para platos Fuertes" + numero_random);
        while (numero_random != 0){
            if (numero_random == 3){
                platoFuerte1 = platosFs.indice_fuerte();
                platoFuerte2 = platosFs.indice_fuerte();
                platoFuerte3 = platosFs.indice_fuerte();

                pedido_Fuerte.add(platoFuerte1);
                pedido_Fuerte.add(platoFuerte2);
                pedido_Fuerte.add(platoFuerte3);

                numero_random = 0;
            }
            else if (numero_random == 2){
                platoFuerte1 = platosFs.indice_fuerte();
                platoFuerte2 = platosFs.indice_fuerte();

                pedido_Fuerte.add(platoFuerte1);
                pedido_Fuerte.add(platoFuerte2);

                numero_random = 0;
            }
            else if (numero_random == 1){
                platoFuerte1 = platosFs.indice_fuerte();

                pedido_Fuerte.add(platoFuerte1);

                numero_random = 0;
            }
            else if(numero_random == 0) {
                platoFuerte1 = platosFs.indice_fuerte();

                pedido_Fuerte.add(platoFuerte1);

                numero_random = 0;
            }
        }
        numero_random = r.nextInt((3-1)+1)+1;
        //System.out.println("numero Random para acompannamientos" + numero_random);
        while (numero_random != 0) {
            if (numero_random == 3) {
                sideD1 = acompans.indice_sideD();
                sideD2 = acompans.indice_sideD();
                sideD3 = acompans.indice_sideD();

                pedido_SideD.add(sideD1);
                pedido_SideD.add(sideD2);
                pedido_SideD.add(sideD3);

                numero_random = 0;

            } else if (numero_random == 2) {
                sideD1 = acompans.indice_sideD();
                sideD2 = acompans.indice_sideD();

                pedido_SideD.add(sideD1);
                pedido_SideD.add(sideD2);

                numero_random = 0;

            } else if (numero_random == 1) {
                sideD1 = acompans.indice_sideD();

                pedido_SideD.add(sideD1);

                numero_random = 0;

            } else {
                sideD1 = acompans.indice_sideD();

                pedido_SideD.add(sideD1);

                numero_random = 0;
            }
        }
        numero_random = r.nextInt((3-1)+1)+1;
        //System.out.println("numero Random para bebidas" + numero_random);
        while (numero_random != 0) {
            if (numero_random == 3) {
                bebida1 = bebs.indice_bebida();
                bebida2 = bebs.indice_bebida();
                bebida3 = bebs.indice_bebida();

                pedido_bebidas.add(bebida1);
                pedido_bebidas.add(bebida2);
                pedido_bebidas.add(bebida3);

                numero_random = 0;

            } else if (numero_random == 2) {
                bebida1 = bebs.indice_bebida();
                bebida2 = bebs.indice_bebida();

                pedido_bebidas.add(bebida1);
                pedido_bebidas.add(bebida2);

                numero_random = 0;

            } else if (numero_random == 1) {
                bebida1 = bebs.indice_bebida();

                pedido_bebidas.add(bebida1);

                numero_random = 0;

            } else {
                bebida1 = bebs.indice_bebida();

                pedido_bebidas.add(bebida1);

                numero_random = 0;
            }
        }
    }

    public List ver_platosFuertes(){
        return pedido_Fuerte;
    }
    public List ver_SideD(){
        return pedido_SideD;
    }
    public List ver_bebidas(){
        return pedido_bebidas;
    }

}
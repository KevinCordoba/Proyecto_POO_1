
/* Facturador se debe de encargar de
contabilizar y crear estadisticas de los pedidos logrados
 */
public class Facturador {
    int ordenes_logradas = 0; //ordenes totales
    int ganancia = 0;        // Ganancia total
    int clientes_insatisfechos = 0; // clientes impacientes que se fueron
    double costo_orden;      //orden que se maneja

    double perdida = 0;    //Variable para saber el preci

    public Facturador(){

    }

    public void hacer_descuento(int precio){ //Esta instancia es para hacer el 10% de desc en caso de combo
        double temp;
        this.costo_orden = precio;
        temp = 10 / costo_orden; //Porcentaje de descuento
        costo_orden = costo_orden - temp;

        ganancia += costo_orden;   //Se le suma la orden a la ganancia total
        ordenes_logradas += 1;    //Se suma una orden lograda m[as

        //No hago return porque no s[e si vaya a ocupar uno.


    }

    //sumarGanancia se resume en esta, ya que podemos hacer las dos cosas de una vez*****
    public void sumar_orden(int precio){  //Precio es el costo que tuvo la comida, para contarlo como ganancia
        ganancia += precio;
        ordenes_logradas += 1;

    }

    public void sumar_insatisfecho(){
        clientes_insatisfechos += 1;
    }

    public void ver_estadisticas(){
        //Se manda a la iterfaz las cantidades
    }



}

/* Comidas:
Hamburguesa-Wrap-Taco
Ensalada-Papas-Aros de cebolla
Coca_cola-Ginger-Fanta

Combos:
Wrap-Papas
Hamburg-Coca
Ensalada-Taco-Fanta

Usar siempre formato al asignar combos: {Plato fuerte, Acompannamiento, Bebida}
 */

public class combos {
    public String[][] lista_combos = {{"wrap", "papas"}, {"hamburguesa", "coca-cola"}, {"ensalada", "fanta", "taco"}};

    //Deberia ser String porque debe regresar String a la interfaz
    //Void temporal
    public void mostrar_combos(){
        for (String[] i : lista_combos)
            System.out.println(i);
    }
    //Debe enviar algo, posiblemente un string a la interfaz
    public void comprobar_combo(String[] dato, int index){
        if (dato[0] == lista_combos[0][0] && dato[1] == lista_combos[0][1]){
            //
        }
        else if (dato[0] == lista_combos[1][0] && dato[2] == lista_combos[1][1]){
            //
        }
        else if (dato == lista_combos[2]){
            //
        }
        //NO es combo
        else{
            //
        }
    }

}

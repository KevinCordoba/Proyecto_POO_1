public class ClienteImpaciente extends Cliente {
    int contador;
    int paciencia;
    boolean impaciente;

    ClienteImpaciente(){
        contador = 0;
        paciencia = 10;
        impaciente = true;
    }
    
   public boolean verPaciencia(){
       return this.impaciente;
   }
}

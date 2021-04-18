public class ClienteImpaciente extends Cliente {
    public int contador;
    public int paciencia;
    public boolean impaciente;

    public ClienteImpaciente(){
        contador = 0;
        paciencia = 10;
        impaciente = true;
    }
    
   public int verPaciencia(){
       return this.paciencia;
   }
}

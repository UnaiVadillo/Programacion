
package Excepciones;

public class DatoNoValido extends Exception{
    private String campo;
    
    public DatoNoValido(String campo)
    {
        this.campo = campo;
    }
    
    public String getMensaje()
    {
        return  this.campo + " no válidx";
    }
 
}

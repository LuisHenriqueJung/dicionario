
package entidade;


public class Termo {
    private int numero;
    private String termo;
    private String significado;
    private String fonte;
    
    public Termo(int numero, String termo, String significado,String fonte){
        this.numero = numero;
        this.termo = termo;
        this.significado = significado;
        this.fonte = fonte;
    }

    public Termo() {
     
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTermo() {
        return termo;
    }

    public void setTermo(String termo) {
        this.termo = termo;
    }

    public String getSignificado() {
        return significado;
    }

    public void setSignificado(String significado) {
        this.significado = significado;
    }

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }
}

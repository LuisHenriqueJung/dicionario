package Controle;
import entidade.Termo;
import apoio.Arquivo;
public class ControlaDicionario {
    
    public boolean salvar( Termo t, boolean anexar){
           Arquivo arq = new Arquivo("termos.txt");
           
           if(arq.abrirEscrita(anexar)){
               String registra = t.getNumero()
                       + ";" + t.getTermo()
                       + ";" + t.getSignificado()
                       + ";" + t.getFonte();
               arq.escreverLinha(registra);
               arq.fecharArquivo();
               return(true);
           }else{
            return (false);
           }
    }

    public String pesquisar(String numero, String termo,String significado,String fonte) {
        Arquivo arq = new Arquivo("termos.txt");

        String retorno = "";

        if (arq.abrirLeitura()) {

            String linha = arq.lerLinha();
                     
            while (linha != null) {                                                  
                String linhaSplit[] = linha.split(";");             
                if (linhaSplit[0].contains(numero)||linhaSplit[1].toLowerCase().contains(termo.toLowerCase())||linhaSplit[2].toLowerCase().contains(significado.toLowerCase())||linhaSplit[3].toLowerCase().contains(fonte.toLowerCase())) {                              
                    retorno = retorno + linha + "\n";                              
                }
                
                linha = arq.lerLinha();  
            }
            arq.fecharArquivo();
   
            if (retorno.isEmpty()) {
                return null;
            } else {
                return retorno;
            }            
        } else {
            return null;
        }
    }

    public String confereExis(String numero, String termo) {
        Arquivo arq = new Arquivo("termos.txt");

        String retorno = "";

        if (arq.abrirLeitura()) {

            String linha = arq.lerLinha();
                     
            while (linha != null) {                                                  
                String linhaSplit[] = linha.split(";");             

                if ((linhaSplit[0].equals(numero))) {
                    retorno = "X";
                    return retorno;                 
                }
                if (linhaSplit[1].equalsIgnoreCase(termo.toLowerCase())) {
                    retorno = "X";         
                    return retorno;
                }
                linha = arq.lerLinha();  
            }
            arq.fecharArquivo();
   
            if (retorno.isEmpty()) {
                return null;
            } else {
                return retorno;
            }            
        } else {
            return null;
        }
    }
}


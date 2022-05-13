
package Controle;
import entidade.Usuario;
import apoio.Arquivo;


public class ControlaUsuario {
    public boolean salvar(Usuario u, boolean anexar) {
    Arquivo arq = new Arquivo("usuarios.txt");

        if (arq.abrirEscrita(anexar)) {      
            String registro = u.getCodigo()
                    + ";"
                    + u.getNome()
                    + ";"
                    + u.getSenha();

            arq.escreverLinha(registro);
            arq.fecharArquivo();

            return true;
        } else {
            return false;
        }
    }
    
    public boolean logar(String usuario, String senha) {
        Arquivo arq = new Arquivo("usuarios.txt");

        boolean retorno = false;

        if (arq.abrirLeitura()) {

            String linha = arq.lerLinha();

            while (linha != null) {                                                  
                String linhaSplit[] = linha.split(";");
                if (linhaSplit[1].equals(usuario) && linhaSplit[2].equals(senha)) {             
                    retorno = true;
                }
                linha = arq.lerLinha();

            }
            arq.fecharArquivo();
        }
        return retorno;
}
    public boolean testaExistencia(String usuario) {
        Arquivo arq = new Arquivo("usuarios.txt");
        boolean retorno = false;
        if (arq.abrirLeitura()) {
            String linha = arq.lerLinha();
            while (linha != null) {
                String linhaSplit[] = linha.split(";");
                if (linhaSplit[1].equals(usuario)) {
                    retorno = true;
                }
                linha = arq.lerLinha();

            }
            arq.fecharArquivo();
        }
        return retorno;
    }
}

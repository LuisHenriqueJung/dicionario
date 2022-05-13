
package apoio;

import java.io.*;


public class Arquivo {

    private BufferedReader br;
    private BufferedWriter bw;
    private String nomeArquivo;
    private char status;

    public Arquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        status = 'C';
    }

    public boolean abrirLeitura() {
        boolean sucesso = true;

        FileReader fr = null;
        if (status != 'C') {
            System.err.println("Erro! O arquivo " + nomeArquivo + " já está aberto.");
            sucesso = false;

        } else {
            try {
                fr = new FileReader(nomeArquivo);
            } catch (FileNotFoundException e) {
                System.err.println("Erro! O arquivo " + nomeArquivo + " não encontrado.");
                sucesso = false;
            }
            if (sucesso) {
                status = 'R';
                br = new BufferedReader(fr);
            }
        }
        return (sucesso);

    }
    public boolean  abrirEscrita(boolean anexar){
        boolean sucesso = true;
        FileWriter fw = null;
        if(status != 'C'){
            System.err.println("O arquivo " + nomeArquivo + " já está aberto.");
            sucesso = false;
        }else{
            try{
                 fw = new FileWriter(nomeArquivo, anexar);
            }
            catch(IOException e){
                System.err.println("Erro na escrita do arquivo " + nomeArquivo + ".");
                sucesso = false;
            }
            if(sucesso){
                status = 'W';
                bw = new BufferedWriter(fw);
            }
        }
        return(sucesso);
    }

    public String lerLinha() {
        String linha = null;
        if (status == 'R') {
            try {
                linha = br.readLine();
            } catch (IOException e) {
                System.err.println("Erro de leitura no arquivo" + nomeArquivo + ". ");
            }
        } else{
                System.err.println("Arquivo " + nomeArquivo +  " não está pronto para leitura.");
                }
        return(linha);
    }
    public void escreverLinha(String linha) {
        if (status == 'W') {
            try {
                bw.write(linha + "\n");
            } catch (IOException e) {
                System.err.println("Erro de escrita no arquivo " + nomeArquivo + "." );
            }
        } else {
            System.err.println("Arquivo " + nomeArquivo + " não está pronto para escrita.");
        }
    }
    public void fecharArquivo() {
        if (status == 'R')
        {
            try {
                br.close();
                status = 'C';
            } catch (IOException e) {
                System.err.println("Erro ao fechar o arquivo " + nomeArquivo + ".");
            }
        }
        if (status == 'W') 
        {
            try {
                bw.close();
                status = 'C';
            } catch (IOException e) {
                System.err.println("Erro ao fechar o arquivo " + nomeArquivo + ".");
            }
        }
    }
}
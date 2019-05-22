package contas_Bancarias;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Harrison Sanches
 */
public class Grava_ArquivoCC {

    public void salvarConta(Conta_Corrente conta) {

        
        FileWriter arq;
        try {
            arq = new FileWriter("C:\\Users\\Harrison Sanches\\Documents\\NetBeansProjects\\Contas_Bancarias\\src\\contas_Bancarias\\contas_Corrente.txt", true);        
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.append( conta.getNome() + "," +conta.getNumero_Conta()
                + ","+ conta.getAgencia()+","+ conta.getLimite() +"," + conta.getSaldo()+ "\r\n");        
            arq.close();   
        } catch (IOException ex) {
            Logger.getLogger(Grava_ArquivoCC.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
}
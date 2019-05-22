/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class Grava_ArquivoCP {
    public void salvarConta(Conta_Poupanca conta) {

        
        FileWriter arq;
        try {
            arq = new FileWriter("C:\\Users\\Harrison Sanches\\Documents\\NetBeansProjects\\Contas_Bancarias\\src\\contas_Bancarias\\contas_Poupanca.txt", true);        
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.append( conta.getNome_CP() + "," +conta.getNumero_ContaCP()
                + ","+ conta.getAgencia_CP()+","+"," + conta.getSaldo_CP()+ "\r\n");        
            arq.close();   
        } catch (IOException ex) {
            Logger.getLogger(Grava_ArquivoCC.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
}

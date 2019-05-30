/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoperguntas;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author harri
 */
public class QuestaoSoma {
    
    public QuestaoSoma(){}    
    
    public void PerguntaSoma() {
        int numero1 = ThreadLocalRandom.current().nextInt(0,100);
        int numero2 = ThreadLocalRandom.current().nextInt(0,20);
        
        String pergunta = JOptionPane.showInputDialog("Quanto é " + 
        numero1 + " + " + numero2 );
        
        int respostaCorreta = Integer.parseInt(pergunta);
        if(numero1 + numero2 == respostaCorreta){
            JOptionPane.showMessageDialog(null,"Você acertou!");
        }
        else{
            JOptionPane.showMessageDialog(null,"Você errou");  
        }
    }               
}


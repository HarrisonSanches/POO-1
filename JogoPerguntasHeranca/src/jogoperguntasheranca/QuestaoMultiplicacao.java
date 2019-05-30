/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoperguntasheranca;

import javax.swing.JOptionPane;

/**
 *
 * @author harri
 */
public class QuestaoMultiplicacao extends Questao{
    
    
    @Override
    public boolean verificarResposta(){
        if(this.operador1 * this.operador2 == this.resposta){
            return true;            
        }
        return false;
    }  
    public void criarPergunta(){               
        String resposta = JOptionPane.showInputDialog("Quanto é " + 
        this.operador1 + " + " + this.operador2 );
        this.resposta = Integer.parseInt(resposta);        
    }
    
    
}

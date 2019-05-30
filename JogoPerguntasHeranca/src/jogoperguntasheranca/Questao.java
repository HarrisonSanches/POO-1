/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoperguntasheranca;


import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;
/**
 *
 * @author harri
 */

public abstract class Questao {    

    int operador1;
    int operador2;
    int resposta;
    
    public Questao(){        
        this.operador1 = ThreadLocalRandom.current().nextInt(0,100);
        this.operador2 = ThreadLocalRandom.current().nextInt(0,20);   
    }   
    
    public abstract boolean verificarResposta(); 
    
    public void exibirResultado(){
        if(this.verificarResposta())
          JOptionPane.showMessageDialog(null,"Você acertou!");
        else 
          JOptionPane.showMessageDialog(null,"Você errou!");
    }
     
}

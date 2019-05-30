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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int Controlador = 1;
        
        while (Controlador != 0){
            Controlador = ThreadLocalRandom.current().nextInt(1,4);
            if (Controlador == 1){
                QuestaoSoma newQuest = new QuestaoSoma();
                newQuest.criarPergunta();
                newQuest.exibirResultado();
            }
            if (Controlador == 2){
                QuestaoSubtracao newQuest = new QuestaoSubtracao();
                newQuest.criarPergunta();
                newQuest.exibirResultado();
            }
            if (Controlador == 3){
                QuestaoMultiplicacao newQuest = new QuestaoMultiplicacao();
                newQuest.criarPergunta();
                newQuest.exibirResultado();
            }
            Controlador = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 jogar novamente ou 0 para sair"));
        }  
        
    }
    
}

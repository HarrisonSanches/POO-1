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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int Controlador = 1;
        
        while (Controlador != 0){
            Controlador = ThreadLocalRandom.current().nextInt(1,4);
            if (Controlador == 1){
                QuestaoSoma novaQuestao = new QuestaoSoma();
                novaQuestao.PerguntaSoma();
            }
            if(Controlador == 2){
                QuestaoSubtracao novaQuestao = new QuestaoSubtracao();
                novaQuestao.PerguntaSubtracao();
            }
            if (Controlador == 2){
                QuestaoMultiplicacao novaQuestao = new QuestaoMultiplicacao();
                novaQuestao.PerguntaMult();
            }
            
            Controlador = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 jogar novamente ou 0 para sair"));
        }
    }
    
}

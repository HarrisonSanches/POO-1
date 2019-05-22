package contas_Bancarias;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;

/**
 *
 * @author Harrison Sanches
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String option = "1";
        while (!"0".equals(option)){      
            option = JOptionPane.showInputDialog("Digite 1 para conta Corrente ou 2 Para conta Poupanca:");
            if ("1".equals(option)){
                String numConta = JOptionPane.showInputDialog("Digite o numero da conta");        
                String numAgencia  = JOptionPane.showInputDialog("Digite a agência");
                String nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente");
                String limiteInicial = JOptionPane.showInputDialog("Digite o limite"); 
                String saldoInicial = JOptionPane.showInputDialog("Digite saldo");  
                Conta_Corrente contaCliente = new Conta_Corrente(numConta,nomeCliente, saldoInicial,limiteInicial,numAgencia);
                contaCliente.imprimirSaldo();
                Grava_ArquivoCC salvar = new Grava_ArquivoCC();
                salvar.salvarConta(contaCliente);
                        
            }
            else{
                if("2".equals(option)){
                    String numConta = JOptionPane.showInputDialog("Digite o numero da conta");        
                    String numAgencia  = JOptionPane.showInputDialog("Digite a agência");
                    String nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente");
                    String saldoInicial = JOptionPane.showInputDialog("Digite saldo");  
                    Conta_Poupanca contaCliente = new  Conta_Poupanca(numConta,nomeCliente,saldoInicial,numAgencia);
                    Grava_ArquivoCP salvar = new Grava_ArquivoCP();
                    salvar.salvarConta(contaCliente);
                }
                else{
                    System.out.println("OPÇÃO INVÁLIDA!");
                }
            }
            option = JOptionPane.showInputDialog("Digite 1 para continuar ou 0 para sair:");
            
        }  
 
        
        
        
    }
    
}

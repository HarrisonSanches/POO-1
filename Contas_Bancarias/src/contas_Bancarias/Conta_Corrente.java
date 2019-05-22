/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contas_Bancarias;

/**
 *
 * @author Harrison Sanches
 */
public class Conta_Corrente {
    private int numero_Conta;
    private String nome;
    private float saldo;
    private float limite;
    private String agencia;
    
    
    public Conta_Corrente(int numero_Conta, String nome, float saldo,float limite,String agencia) {
        this.numero_Conta = numero_Conta;
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
        this.agencia = agencia;
    }
    public Conta_Corrente(String numero_Conta,String nome,String saldo,String limite,String  agencia){
        this.numero_Conta = Integer.parseInt(numero_Conta);
        this.nome = nome;
        this.saldo = Float.parseFloat(saldo);
        this.limite = Float.parseFloat(limite);
        this.agencia = agencia;      
    }



    public void setNumero_Conta(int numero_Conta) {
        this.numero_Conta = numero_Conta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    
    public int getNumero_Conta() {
        return numero_Conta;
    }

    public float getSaldo() {
        return saldo;
    }


    public float getLimite() {
        return limite;
    }

    public String getAgencia() {
        return agencia;
    }
    
     public String getNome() {
        return nome;
    }
    
    public void imprimirSaldo(){        
        System.out.println("Prezado, "+ nome);
        System.out.println("Seu saldo atualmente é de: R$ "+ saldo);          
    }  
}

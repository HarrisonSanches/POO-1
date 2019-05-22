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
public class Conta_Poupanca {
    private int numero_ContaCP;
    private String nome_CP;
    private float saldo_CP;
    private String agencia_CP;
    

    public Conta_Poupanca(int numero_ContaCP, String nome_CP, float saldo_CP,String agencia_CP) {
        this.numero_ContaCP = numero_ContaCP;
        this.nome_CP = nome_CP;
        this.saldo_CP= saldo_CP;
        this.agencia_CP = agencia_CP;
    }
    public Conta_Poupanca(String numero_ContaCP,String nome_CP,String saldo_CP,String agencia_CP){
        this.numero_ContaCP = Integer.parseInt(numero_ContaCP);
        this.nome_CP = nome_CP;
        this.saldo_CP = Float.parseFloat(saldo_CP);
        this.agencia_CP = agencia_CP;      
    }

    public int getNumero_ContaCP() {
        return numero_ContaCP;
    }

    public void setNumero_ContaCP(int numero_ContaCP) {
        this.numero_ContaCP = numero_ContaCP;
    }

    public String getNome_CP() {
        return nome_CP;
    }

    public void setNome_CP(String nome_CP) {
        this.nome_CP = nome_CP;
    }

    public float getSaldo_CP() {
        return saldo_CP;
    }

    public void setSaldo_CP(float saldo_CP) {
        this.saldo_CP = saldo_CP;
    }

    public String getAgencia_CP() {
        return agencia_CP;
    }

    public void setAgencia_CP(String agencia_CP) {
        this.agencia_CP = agencia_CP;
    }

    
    
    public void imprimirSaldo(){      
        System.out.println("Prezado, "+ nome_CP);
        System.out.println("Seu saldo atualmente é de: R$ "+ saldo_CP);         
    }
    
}








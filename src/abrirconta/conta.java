/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abrirconta;

import java.util.Scanner;

/**
 *
 * @author Nando
 */
public class conta {
    // Atributos
  public  int numconta;
  protected String tipo;
  private String dono;
  private float saldo;
  private boolean status;
  
  // metodos especiais

    public conta(String tipo, float saldo) {
        Scanner tip = new Scanner (System.in);
        
        //Scanner tip = new Scanner (System.in);
        System.out.println("Digite o tipo da conta CC ou CP ");
        this.tipo = tip.nextLine();
        System.out.println("Digite o nome do portador ");
        this.setDono(dono);
        this.setNumconta(numconta);
        //this.tipo = tipo;
        //System.out.println("Digite o tipo da conta CC ou CP ");
        this.setSaldo(saldo);
        //pagarMesalidade();
        
    }
  
    public void abrirConta(){
    
     
        setStatus(status);
        
        
    }
  
    public void fecharConta(){
    
    
    }
    
    public void depositar(){
    
    }
    
    
    public void sacar(){
        
        if (this.saldo > 0){
            this.saldo = this.saldo - 10;
            System.out.println("Voce sacou o valor de R$ 10.00 ");
            
        } else {
            
            System.out.println("Voce esta sem saldo! ");
        }
    
    }
    
    public void pagarMesalidade(){
    
        if (this.saldo >0){
        this.saldo = this.saldo - 15;
            System.out.println("Foi debitado R$ 15,00 Mesalidade ");
        
        
        
      }else {
        
            System.out.println("Conta sem saldo ");
        }
        
        
    }

    public int getNumconta() {
        
        return numconta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setNumconta(int numconta) {
        
        Scanner nummconta = new Scanner(System.in);
        System.out.println("Digite o numero da conta");
        System.out.println("Ex: 041301777452");            
        numconta = nummconta.nextInt();
        
        this.numconta = numconta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        Scanner nome = new Scanner(System.in);
        dono = nome.nextLine();
        this.dono = dono;
        
        
    }

    public void setSaldo(float saldo) {
        
       switch (this.tipo) {
          case "CC":
              this.saldo = this.saldo + 50;
              break;
      
          case "CP":
              this.saldo = this.saldo + 150;
              break;
          default:
              System.out.println("Tipo de conta invalida! ");
              break;
      }
         
        
        
    }

    public void setStatus(boolean status) {
        
        if (this.status == !true){
        status = true;
            System.out.println("ACONTA ESTA HALITADA COM SUCESSO! ");
        
        }else {
            System.out.println("A CONTA JA ESTA HALITADA! ");
        
        }
        
        
        this.status = status;
    }
    
    void statusConta(){
        System.out.println("Portador da conta " + this.getDono());
        System.out.println("conta tipo : "+ this.getTipo());
        System.out.println("Saldo " + "R$" + this.getSaldo());
        System.out.println("O numero da conta é :" + this.getNumconta());
        System.out.println("Status conta !" + this.isStatus());
    }
    
}

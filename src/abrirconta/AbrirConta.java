/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abrirconta;

/**
 *
 * @author Nando
 */
public class AbrirConta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        conta c1 = new conta("CC",0.0f);
        c1.abrirConta();
        c1.pagarMesalidade();
        c1.sacar();
        c1.depositar();
        c1.statusConta();
        //c1.setNumconta(0);
        
        
    }
    
}

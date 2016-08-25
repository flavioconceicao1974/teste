/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

/**
 *
 * @author flavio
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String teste = "mas também";
        //System.out.println( teste.substring(teste.lastIndexOf(" ")+1,teste.length()));

        String line = "Não só somente";
        String[] str = line.split(" "); 
        System.out.println("tamanho : "+ str.length);
        

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author Secretaria-PC-04
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Thais";
        String nome2 = "Thais";
        String nome3 = new String("Thais");
        String res;
        res = (nome1.equals(nome3))?"Igual":"diferente";
        System.out.println(res);
   
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomasistema;

import java.util.Locale;

/**
 *
 * @author Admin
 */
public class IdiomaSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Locale idioma = Locale.getDefault();
       System.out.print("Seu sistema esta em ");
       System.out.println(idioma.getDisplayLanguage()); // Imprime a linguagem do sistema operacional, "Português" 
       
    }
    
}
